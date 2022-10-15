/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.LivroDAO;
import DTO.Livro;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Util {
// Criptografa a senha no padrão SHA-256
    public static String criptografarSenha(String senha) {
        String cript = senha;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            cript = hash.toString(24);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("erro ao criptografar senha");
        }
        return cript;
    }
    
// Insere os dados na tabela JtableLivros
    public static JTable table(JTable JtableLivros) {
        DefaultTableModel dtmlivro = (DefaultTableModel) JtableLivros.getModel();
        dtmlivro.setNumRows(0);
        LivroDAO dao = new LivroDAO();
        for (Livro livro : dao.listarDados()) {
            dtmlivro.addRow(new Object[]{
                livro.getId(),
                livro.getTitulo(),
                livro.getCategoria(),
                livro.getAutor(),
                livro.getEditora()
            });
        }
        return JtableLivros;
      

    }

}
