/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.Controller_TelaDeCadatro;
import DAO.UsuarioDAO;
import DTO.Usuario;
import javax.swing.JOptionPane;
import static controllers.Controller_TelaDeCadatro.create;
import view.Tela_Admin;

/**
 *
 * @author alefe
 */
public class Controller_TelaDeLogin {
      public static void autentica_usuarioLogin( String email, String senha) {
                  Usuario usuario = new Usuario();
                  UsuarioDAO DAO = new UsuarioDAO();
                 usuario.setEmail_usuario(email);
                 usuario.setSenha_senha(util.criptografarSenha(senha));
                    
        if (DAO.autenticaUsuarioLogin(usuario) == true )
        {
           JOptionPane.showMessageDialog(null, "Acesso permitido");
        }
        else
        {
           JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos " );
        }
      }
//      public static void admin(String email , String senha)
//      {
//          
//          Usuario usuario = new Usuario();
//          UsuarioDAO DAO = new UsuarioDAO();
//          usuario.setEmail_usuario(email);
//          usuario.setSenha_senha(senha);
////                if( DAO.verificarAdmin(usuario) == true){
////                   chamarTelaDeAdmin();
////                }
//          }
          
      
      
        public static void chamarTelaDeAdmin()
        {
            Tela_Admin ta = new Tela_Admin();
        }

        }

        
      
    

