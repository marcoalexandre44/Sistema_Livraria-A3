package controllers;

import DAO.LivroDAO;
import DAO.UsuarioDAO;
import DTO.Usuario;
import static junit.framework.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import DTO.Livro;
public class UtilTest {

    private int id;
    private String titulo;
    private String categoria;
    private String autor;
    private String editora;
    private   Livro livro = new Livro("joão e o pe de feijão","aventura","desconhecido","123");
    
    @Test
    public void testeCriptografia() {
        String senha = "123";
        assertEquals("959e8cmla530336a9mm65db9447753c64bb73fbli5fdeil7hl47nlhb", Util.criptografarSenha(senha));
    }
}
