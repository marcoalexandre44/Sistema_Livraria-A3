/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DAO.UsuarioDAO;
import DTO.Usuario;

public class Apoio {

    public static void create(String nome,String email, String senha) {
        
        Usuario usuario = new Usuario();

        usuario.setNome_usuario(nome);   
        usuario.setEmail_usuario(email);
        usuario.setSenha_senha(senha);
      
        UsuarioDAO DAO = new UsuarioDAO();
        DAO.create(usuario);
    }
}
