/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Usuario;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import database.ConexaoDataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alefe
 */
public class UsuarioDAO {

    Connection cn;
    PreparedStatement stm;

    public boolean create(Usuario user) {

        cn = new ConexaoDataBase().conectarBD();
        try {
            stm = cn.prepareStatement("INSERT INTO user_novo (nome_usuario , email_usuario ,senha_usuario)VALUES(?,?,?)");
            stm.setString(1, user.getNome_usuario());
            stm.setString(2, user.getEmail_usuario());
            stm.setString(3, user.getSenha_senha());
            stm.executeUpdate();
            return true;
        } catch (SQLException erro) {
            System.out.println("Não foi possivél fazer cadastro " + erro);
        }
        return false;
    }

    public boolean autenticaUsuario(Usuario user) {
        cn = new ConexaoDataBase().conectarBD();
        boolean checar = false;
        ResultSet rs = null;
        try {
            String url = "select * FROM user_novo where email_usuario = ? ";
            stm = cn.prepareStatement(url);
            stm.setString(1, user.getEmail_usuario());

            rs = stm.executeQuery();

            if (rs.next()) {
                checar = true;
            }

        } catch (SQLException ex) {
            System.out.println("Erro em efetuar consulta" + ex);
        }
        return checar;
    }

    public boolean autenticaUsuarioLogin(Usuario user) throws NaoFoiPossivelAutenticarUsuarioException {
        cn = new ConexaoDataBase().conectarBD();
        boolean checar = false;
        ResultSet rs = null;
        try {
            String url = "select * FROM user_novo where email_usuario = ? and senha_usuario = ?";
            stm = cn.prepareStatement(url);
            stm.setString(1, user.getEmail_usuario());
            stm.setString(2, user.getSenha_senha());
            rs = stm.executeQuery();

            if (rs.next()) {
                checar = true;
            } else {
                System.out.println("Usuario não Cadastrado");
                throw new NaoFoiPossivelAutenticarUsuarioException();
            }
        } catch (SQLException ex) {
            System.out.println("Erro em efetuar consulta" + ex);
        }
        return checar;
    }

    public boolean verificarAdmin(Usuario usuario) {

        cn = new ConexaoDataBase().conectarBD();
        PreparedStatement pstm = null;
        boolean verificar = false;
        try {
            String url = "select * FROM user_novo where email_usuario = ? and statu = 'admin'";
            stm = cn.prepareStatement(url);
            stm.setString(1, usuario.getEmail_usuario());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                verificar = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error ao verificar admin");
        }
        return verificar;
    }
}
