package controllers;

import DAO.LivroDAO;
import DTO.Livro;
import javax.swing.JTable;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class Controller_TelaDoAdminTest {

    private final LivroDAO livrodao = mock(LivroDAO.class);

    @Test
    public static void Excluirlivro() {
        Livro livro = new Livro();
        livro.setId(8);
        LivroDAO livrodao = new LivroDAO();
        assertTrue(livrodao.delete(livro));
    }

    @Test
    public void testEditarAgendamento() {
        Controller_TelaDoAdmin controllerAdmin = new Controller_TelaDoAdmin();
        JTable tablelivro = null;
        controllerAdmin.atualizarDados(tablelivro, 0, "teste", "teste", "teste", "teste");

    }
}
