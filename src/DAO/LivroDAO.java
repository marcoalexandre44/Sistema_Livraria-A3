/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Livro;
import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alefe
 */
public class LivroDAO {
    Connection cn ;
    
    
    public void create(Livro livro)
    {
    cn = new Conexao().conectarBD();
    String url = "";
    
    
    }
    public void delete()
    {
    cn = new Conexao().conectarBD();
    String url = "";
    }
    public void atualizar()
    {
    cn = new Conexao().conectarBD();
    String url = "";
    }
    
   public java.util.List<Livro> listarDados(){

       cn = new Conexao().conectarBD();
       PreparedStatement pstm = null;
       ResultSet rs = null;
       List<Livro> livros = new ArrayList<>();
        try
        {
            String url = "select * FROM livro";
            pstm = cn.prepareStatement(url);
            rs = pstm.executeQuery();
            
            while(rs.next())
        {
            Livro livro = new Livro();
            livro.setId(rs.getInt("id_livro"));
            livro.setTitulo(rs.getString("tiulo"));
            livro.setCategoria(rs.getString("categoria"));
            livro.setAutor(rs.getString("autor"));           
            livro.setEditora(rs.getString("editora"));
            livros.add(livro);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro ao tentar listar os dados do BD");
        }
       return livros;
    } 
}
