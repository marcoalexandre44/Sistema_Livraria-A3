/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import DAO.LivroDAO;
import DTO.Livro;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Controller_TelaDoAdmin {
//Cadastra os dados passados por parametros no banco de dados

    public static void cadastarLivro(String titulo, String categoria, String autor, String editora) {
        Livro livro = new Livro();
        LivroDAO dao = new LivroDAO();
        livro.setTitulo(titulo);
        livro.setCategoria(categoria);
        livro.setAutor(autor);
        livro.setEditora(editora);
        dao.create(livro);
    }

    //Verifica se ja existe um livro cadastrado com um titulo se retorna true livro ja cadastrado 
    //se retorna false  o metodo create e chamado e o livro e cadastrado
    public static boolean verificarLivro(String titulo, String categoria, String autor, String editora) {
        Livro livro = new Livro();
        LivroDAO dao = new LivroDAO();
        livro.setTitulo(titulo);
        if (dao.autenticaLivro(livro) == true) {
            JOptionPane.showMessageDialog(null, "Livro com este titulo ja cadatrado");
            return true;
        } else {
            cadastarLivro(titulo, categoria, autor, editora);
            JOptionPane.showMessageDialog(null, "Livro cadastro com sucesso ");
            return false;
        }
    }

    public static void deletarLivros(JTable JtableLivros) {
        if (JtableLivros.getSelectedRow() != -1) {

            Livro livro = new Livro();
            LivroDAO dao = new LivroDAO();
            livro.setId((int) JtableLivros.getValueAt(JtableLivros.getSelectedRow(), 0));
            dao.delete(livro);
        }
    }

    public static void atualizarDados(JTable JtableLivros, int id, String titulo, String categoria, String autor, String editora) {
        Livro livro = new Livro();
        LivroDAO dao = new LivroDAO();

        livro.setTitulo(titulo);
        livro.setCategoria(categoria);
        livro.setAutor(autor);
        livro.setEditora(editora);
        livro.setId(id);
        dao.atualizar(livro);
    }

}
