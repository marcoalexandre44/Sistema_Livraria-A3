package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import view.Tela_Login;

public class Controller_TelaDeCadastro {
    // Cadastra um usuario no banco de dados 

    public static void create(String nome, String email, String senha) {

        Usuario usuario = new Usuario();

        usuario.setNome_usuario(nome);
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(Util.criptografarSenha(senha));

        UsuarioDAO DAO = new UsuarioDAO();
        DAO.create(usuario);
    }
        //Verfica se no banco se ja existe algum usuario cadastrado

    public static void autentica_usuario(String nome, String email, String senha) {
        Usuario usuario = new Usuario();
        usuario.setEmail_usuario(email);
        UsuarioDAO DAO = new UsuarioDAO();
        DAO.autenticaUsuario(usuario);
        // Se retorna true o usuario ja existe e se retorna false que dizer q os parametros passados podem  ser cadastrados

        if (DAO.autenticaUsuario(usuario) == true) {
            JOptionPane.showMessageDialog(null, "Usuario ja cadastrado");
        } else {
            create(nome, email, senha);
            chamarTelaDeLogin();
        }

    }

    public static void chamarTelaDeLogin() {

        Tela_Login tl = new Tela_Login();
        tl.setVisible(true);

    }

    public String cadastro(String nome, String email, String senha) {
        String result = null;
        if (nome.equals("") || email.equals("") || senha.equals("")) {

            return "campos vazios";

        } else if (Controller_TelaDeCadastro.testeverificarEmail(email) == true) {
            Controller_TelaDeCadastro.autentica_usuario(nome, email, senha);
            return null;

        } else if (Controller_TelaDeCadastro.testeverificarEmail(email) == false) {

            return "email ou senha invallidos";
        }
        return result;
    }

    public static boolean testeverificarEmail(String email) {

        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(email);

        return matcher.find();
    }
}
