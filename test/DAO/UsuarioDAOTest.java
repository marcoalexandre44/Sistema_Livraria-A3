
package DAO;

import DTO.Usuario;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import controllers.Controller_TelaDeLogin;
import controllers.Util;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class UsuarioDAOTest {
    
   private UsuarioDAO usuariodao =mock(UsuarioDAO.class);

    @Test
    public void TesteParaVerificarSeEstarInserindodadosnobanco(){ 

        Usuario usuario = new Usuario("alefe","alefe123@gmail","123");
        doNothing().when(usuariodao).create(usuario);
        usuariodao.create(usuario);
        verify(usuariodao, times(1)).create(usuario);
}
    @Test
    public void TesteParaVerificarValidacaoDedadosEmail() throws NaoFoiPossivelAutenticarUsuarioException{

        Usuario usuario = new Usuario("alefe", "alefe@gmail.com", "123");
        when(usuariodao.autenticaUsuario(usuario)).thenReturn(true);
        assertTrue(usuariodao.autenticaUsuario(usuario));
        verify(usuariodao, times(1)).autenticaUsuario(usuario);
    }
     @Test
    public void TesteParaverificarValidacaoDeDadosFalse() throws NaoFoiPossivelAutenticarUsuarioException{

        Usuario usuario = new Usuario("alfefe", "alefe1232qwadfe", "123");
        when(usuariodao.autenticaUsuario(usuario)).thenReturn(false);
        assertFalse(usuariodao.autenticaUsuario(usuario));
        verify(usuariodao, times(1)).autenticaUsuario(usuario);
    }
    @Test
    public void DeverRetornaErroCasoOUsuarioNaoExistaNoBanco()
            throws NaoFoiPossivelAutenticarUsuarioException{

        Usuario usuario = new Usuario("alefe@hotmail.com", "123");
        when(usuariodao.autenticaUsuarioLogin(usuario)).thenThrow(new NaoFoiPossivelAutenticarUsuarioException()); 
        NaoFoiPossivelAutenticarUsuarioException exception = assertThrows(NaoFoiPossivelAutenticarUsuarioException.class,
         ()-> usuariodao.autenticaUsuarioLogin(usuario));
        assertEquals("Usuario não Cadastrado no sistema!", exception.getMessage());
        verify(usuariodao, times(1)).autenticaUsuario(usuario);
    }
    @Test
    public void testeparaverficarseusariojaexistenobanco() throws NaoFoiPossivelAutenticarUsuarioException {
         Controller_TelaDeLogin login = new Controller_TelaDeLogin();
        String senha = "123";
        Usuario usuario = new Usuario("alefe@gmail.com", Util.criptografarSenha(senha));
        assertFalse(usuariodao.create(usuario));

    }
    
}
