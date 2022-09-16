/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alefe
 */
public class UsuarioDAO {
    Connection cn;
    PreparedStatement stm;
    
    public void create(Usuario user){
        
        cn = new Conexao().conectarBD();
        try 
        {
            stm = cn.prepareStatement("INSERT INTO user (nome_usuario , email_usuario ,senha_usuario)VALUES(?,?,?)");
            stm.setString(1, user.getNome_usuario());
            stm.setString(2, user.getEmail_usuario());
            stm.setString(3, user.getSenha_senha());
            stm.executeUpdate();
        } 
        catch (SQLException ex)
        {
            System.out.println(" Erro ao cadrastar usuario " + ex);
        }
    }
    
    
    
}
