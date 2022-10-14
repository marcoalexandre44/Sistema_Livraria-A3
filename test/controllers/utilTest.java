package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class utilTest {
    
   // private util u;
    
    
    @Test
    public void testeCriptografia() {
        String senha = "123";
        assertEquals("959e8cmla530336a9mm65db9447753c64bb73fbli5fdeil7hl47nlhb", Util.criptografarSenha(senha));
    }
    public void testeCreate(){
        Usuario usuario = new Usuario("alefe gustavo" , "alefe@gmail.com.br","123");
        UsuarioDAO dao = new UsuarioDAO();
        dao.create(usuario);
        assert
       
    }
}
        
