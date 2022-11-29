
package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import javax.swing.JOptionPane;
import view.Tela_Admin;
import view.Tela_UsuarioComun;

public class Controller_TelaDeLogin {

//Verfica se existe o usuario no banco se sim ele chama o metodo validarNivelDeUsuario
    public static boolean autentica_usuarioLogin(String email, String senha, UsuarioDAO Dao) throws NaoFoiPossivelAutenticarUsuarioException {
        Usuario usuario = new Usuario();
        UsuarioDAO DAO = Dao;
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(Util.criptografarSenha(senha));

        if (DAO.autenticaUsuarioLogin(usuario) == true) {
            
            if(validarNivelDeUsuario(email, senha,DAO)==true){
                chamarTelaDeAdmin();
            
            } else if(validarNivelDeUsuario(email, senha,DAO)==false){
                chamarTelaDeComun();      
            }        
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos ");
             return false;
        }        
      
    }

// Valida o nivel do usuario se for admin abre se a tela de admin se for
// diferente de admin abra se usuario comum
    public static boolean validarNivelDeUsuario(String email, String senha , UsuarioDAO dao) {
        Usuario usuario = new Usuario();
        UsuarioDAO DAO = dao;
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(senha);

        if (DAO.verificarAdmin(usuario) == true) {
           return true;
        } else {
            return false;
        }
    }

    public static void chamarTelaDeAdmin() {
        Tela_Admin ta = new Tela_Admin();
        ta.setVisible(true);
    }

    public static void chamarTelaDeComun() {
        Tela_UsuarioComun tuc = new Tela_UsuarioComun();
        tuc.setVisible(true);
    }

}
