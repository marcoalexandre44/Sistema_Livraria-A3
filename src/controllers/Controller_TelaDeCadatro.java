/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Tela_Login;

public class Controller_TelaDeCadatro {

    public static void create(String nome, String email, String senha) {
        
        
       
        Usuario usuario = new Usuario();

        usuario.setNome_usuario(nome);
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(util.criptografarSenha(senha));

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

    
    
   public static void chamarTelaDeLogin()
   {
       
       Tela_Login tl = new Tela_Login();
       tl.setVisible(true);
       
   }
}
