/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DAO.LivroDAO;
import DTO.Livro;
import com.mysql.cj.xdevapi.Table;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alefe
 */
public class Controller_TelaDoAdmin {

    public void table(JTable JtableLivros) {
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

    }
}
