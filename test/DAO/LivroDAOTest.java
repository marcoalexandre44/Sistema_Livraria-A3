/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import DTO.Livro;
import controllers.Controller_TelaDoAdmin;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LivroDAOTest {

    private LivroDAO livrodao = mock(LivroDAO.class);

    @Test
    public void testarcreate() {
        Livro livro = new Livro("joão e o pe de feijão", "aventura", "desconhecido", "desconhecida");
        when(livrodao.create(livro)).thenReturn(true);
        assertTrue(livrodao.create(livro));
    }

    @Test
    public void testarerrorcreate() {
        Livro livro = new Livro("joão e o pe de feijão", "aventura", "desconhecido", "desconhecida");
        when(livrodao.create(livro)).thenReturn(false);
        assertFalse(livrodao.create(livro));
    }

    @Test
    public void testeparaverficarselivrojaexistenobanco() {
        Controller_TelaDoAdmin telaDeAdmin = new Controller_TelaDoAdmin();
        Livro livroobjt = new Livro("teste", "teste", "teste", "teste");
        assertFalse(livrodao.create(livroobjt));

    }

    @Test
    public void testarodeletedolivrodao() {
        Livro livro = new Livro();
        livro.setId(1);
        when(livrodao.delete(livro)).thenReturn(true);
        assertTrue(livrodao.delete(livro));
    }
}
