/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import DTO.Livro;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author alefe
 */
public class LivroDAOTest {
    
    private LivroDAO livroDAO;
    
    public LivroDAOTest(){}
    
    @Before
    public void init(){
          livroDAO = new LivroDAO();
    }
    
    @Test
    public void testarseolivrojaexistenobancodedados() {
        LivroDAO dao = new LivroDAO();
        Livro livro = new Livro("teste","teste","teste,","teste");
        assertTrue(dao.autenticaLivro(livro));
    }
    @Test
        public void testarseolivronaoexistenobancodedados() {
            LivroDAO dao = new LivroDAO();
            Livro livro = new Livro("teste1","teste","teste,","teste");
            assertFalse(dao.autenticaLivro(livro));
        }
     
      @Test
     public void testarseosdadosrecebidosestaocorretos(){
         
         
         List<Livro> livros = new ArrayList();
         livros.add(new Livro(1,"teste", "teste", "teste", "teste"));
         
         List<Livro> livrosRecebidos = livroDAO.listarDados();
         
         assertArrayEquals(livros.toArray(),livrosRecebidos.toArray() );
         
         
        
     }
}
