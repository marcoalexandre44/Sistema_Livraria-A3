/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DAO.UsuarioDAO;
import DTO.Usuario;
import javax.swing.JOptionPane;
import static view.Controller_TelaDeCadatro.create;

/**
 *
 * @author alefe
 */
public class Controller_TelaDeLogin {
      public static void autentica_usuarioLogin( String email, String senha) {
        Usuario usuario = new Usuario();
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(Controller_TelaDeCadatro.criptografarSenha(senha));
        UsuarioDAO DAO = new UsuarioDAO();
        
        if (DAO.autenticaUsuarioLogin(usuario) == true )
        {
           JOptionPane.showMessageDialog(null, "Acesso permitido");
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Acesso negado por favor se registre no sistema" );
        }
        }
      
    
}
