/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Livro;
import database.ConexaoDataBase;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class LivroDAO {
    Connection cn;
//testado
    public boolean create(Livro livro) {

        cn = new ConexaoDataBase().conectarBD();

        PreparedStatement pstm;

        boolean teste = false;
        String url = "Insert into livro (tiulo, categoria ,autor ,editora)values(?,?,?,?)";
        try {
            pstm = cn.prepareStatement(url);
            pstm.setString(1, livro.getTitulo());
            pstm.setString(2, livro.getCategoria());
            pstm.setString(3, livro.getAutor());
            pstm.setString(4, livro.getEditora());
            pstm.execute();
            teste = true;
        } catch (SQLException ex) {
            System.out.println("error ao tentar cadrastar livro no banco de dados");
        }
        return teste;
    }
//testado
    public boolean delete(Livro livro) {
        cn = new ConexaoDataBase().conectarBD();
        PreparedStatement stm;
        String url = "delete from livro where id_livro =?";
        try {
            stm = cn.prepareStatement(url);
            stm.setInt(1, livro.getId());
            stm.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("error ao tentar deletar um livro do sistema");
        }
        return false;
    }
//testado
    public boolean atualizar(Livro livro) {
        cn = new ConexaoDataBase().conectarBD();
        PreparedStatement stm;

        String url = "UPDATE livro SET tiulo = ? , categoria = ? , autor = ?, editora = ?  where  id_livro = ?";
        try {
            stm = cn.prepareStatement(url);
            stm.setString(1, livro.getTitulo());
            stm.setString(2, livro.getCategoria());
            stm.setString(3, livro.getAutor());
            stm.setString(4, livro.getEditora());
            stm.setInt(5, livro.getId());
            stm.execute();

            return true;
        } catch (SQLException ex) {
            System.out.println("error em tentar atualizar os dados no banco de dados");
        }
        return false;
    }
//testado
    public boolean autenticaLivro(Livro livro) {
        cn = new ConexaoDataBase().conectarBD();
        PreparedStatement stm;
        boolean checar = false;
        ResultSet rs = null;
        try {
            String url = "select * FROM livro where tiulo = ? ";
            stm = cn.prepareStatement(url);
            stm.setString(1, livro.getTitulo());

            rs = stm.executeQuery();

            if (rs.next()) {
                checar = true;
            }
        } catch (SQLException ex) {
            System.out.println("Erro em efetuar consulta" + ex);
        }
        return checar;
    }
//testado
    public java.util.List<Livro> listarDados() {

        cn = new ConexaoDataBase().conectarBD();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Livro> livros = new ArrayList<>();
        try {
            String url = "select * FROM livro";
            pstm = cn.prepareStatement(url);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id_livro"));
                livro.setTitulo(rs.getString("tiulo"));
                livro.setCategoria(rs.getString("categoria"));
                livro.setAutor(rs.getString("autor"));
                livro.setEditora(rs.getString("editora"));
                livros.add(livro);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar listar os dados do BD");
        }
        return livros;
    }
}
