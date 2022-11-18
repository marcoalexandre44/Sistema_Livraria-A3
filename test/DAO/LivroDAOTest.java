/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import DTO.Livro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class LivroDAOTest {

    private LivroDAO dao = mock(LivroDAO.class);

    @Test
    public void testarcreate() {
        Livro livro = new Livro("joão e o pe de feijão", "aventura", "desconhecido", "desconhecida");
        when(dao.create(livro)).thenReturn(true);
        assertTrue(dao.create(livro));
    }

    @Test
    public void testarerrorcreate() {
        Livro livro = new Livro("joão e o pe de feijão", "aventura", "desconhecido", "desconhecida");
        when(dao.create(livro)).thenReturn(false);
        assertFalse(dao.create(livro));
    }

    @Test
    public void testarseosdadosrecebidosestaocorretos() {

        List<Livro> livros = new ArrayList();
        livros.add(new Livro(1, "joão e o pe de feijão", "aventura", "desconhecido", "desconhecida"));

        when(dao.listarDados()).thenReturn(livros);

        assertEquals(dao.listarDados(), livros);
    }

    @Test
    public void testarodeletedolivrodao() {
        Livro livro = new Livro();
        livro.setId(1);
        when(dao.delete(livro)).thenReturn(true);
        assertTrue(dao.delete(livro));
    }

    @Test
    public void testaatualizardadosnolivrodao() {
        Livro livro = new Livro("joão e o pe de feijão", "aventura", "desconhecido", "desconhecida");
        when(dao.atualizar(livro)).thenReturn(true);
        assertTrue(dao.atualizar(livro));
    }

    @Test
    public void verficaseolivrojaexistenobanco() {
        Livro livro = new Livro("joão e o pe de feijão", "aventura", "desconhecido", "desconhecida");
        when(dao.autenticaLivro(livro)).thenReturn(true);
        assertTrue(dao.autenticaLivro(livro));
    }
    @Test
    public void verficaseolivronaoexistenobanco() {
        Livro livro = new Livro("joão e o pe de feijão", "aventura", "desconhecido", "desconhecida");
        when(dao.autenticaLivro(livro)).thenReturn(false);
        assertFalse(dao.autenticaLivro(livro));
    }
}
