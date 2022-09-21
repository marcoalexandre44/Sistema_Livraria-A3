/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DAO.UsuarioDAO;
import DTO.Usuario;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller_TelaDeCadatro {

    public static void create(String nome, String email, String senha) {
        
        
        
        Usuario usuario = new Usuario();

        usuario.setNome_usuario(nome);
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(criptografarSenha(senha));

        UsuarioDAO DAO = new UsuarioDAO();
        DAO.create(usuario);
    }

    public static void autentica_usuario(String nome, String email, String senha) {

        Usuario usuario = new Usuario();

        usuario.setEmail_usuario(email);

        UsuarioDAO DAO = new UsuarioDAO();
        DAO.autenticaUsuario(usuario);
        if (DAO.autenticaUsuario(usuario) == true)
        {
            JOptionPane.showMessageDialog(null, "Usuario ja cadastrado");
        } 
        else 
        {
            create(nome, email, senha);
        }

    }

    public static String criptografarSenha(String senha) {
            String cript = senha;
            MessageDigest md ;
        try 
        {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            cript = hash.toString(24);
        } 
        catch (NoSuchAlgorithmException ex)
        {
            System.out.println("erro ao criptografar senha");

        }  
        return cript;
    }
    
   public static void chamarTelaDeLogin()
   {
       
       Tela_Login tl = new Tela_Login();
       tl.setVisible(true);
       
   }
}
