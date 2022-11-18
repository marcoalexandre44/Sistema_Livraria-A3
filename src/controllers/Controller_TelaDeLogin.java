/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import javax.swing.JOptionPane;
import view.Tela_Admin;
import view.Tela_UsuarioComun;

public class Controller_TelaDeLogin {

//Verfica se existe o usuario no banco se sim ele chama o metodo validarNivelDeUsuario
    public static boolean autentica_usuarioLogin(String email, String senha) {
        Usuario usuario = new Usuario();
        UsuarioDAO DAO = new UsuarioDAO();
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(Util.criptografarSenha(senha));

        if (DAO.autenticaUsuarioLogin(usuario) == true) {
            validarNivelDeUsuario(email, Util.criptografarSenha(senha));
            return true;
            
        } else {
            JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos ");
             return false;
        }        
    }

// Valida o nivel do usuario se for admin abre se a tela de admin se for diferente de admin abra se usuario comum
    public static void validarNivelDeUsuario(String email, String senha) {

        Usuario usuario = new Usuario();
        UsuarioDAO DAO = new UsuarioDAO();
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(senha);

        if (DAO.verificarAdmin(usuario) == true) {
            chamarTelaDeAdmin();
        } else {
            chamarTelaDeComun();
        }
    }

    public static void chamarTelaDeAdmin() {
        Tela_Admin ta = new Tela_Admin();
        ta.setVisible(true);
    }

    private static void chamarTelaDeComun() {
        Tela_UsuarioComun tuc = new Tela_UsuarioComun();
        tuc.setVisible(true);
    }

}
