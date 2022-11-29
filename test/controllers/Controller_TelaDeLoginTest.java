package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import EXCEPTIONS.NaoFoiPossivelAutenticarUsuarioException;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class Controller_TelaDeLoginTest {

    private final UsuarioDAO usuariodao = mock(UsuarioDAO.class);

    @Test
    public void testeparaverificaroniveldousuario() {
        Controller_TelaDeLogin login = new Controller_TelaDeLogin();
        when(usuariodao.verificarAdmin(any(Usuario.class))).thenReturn(true);
        assertTrue(login.validarNivelDeUsuario("alefe123@gmail", "123", usuariodao));
    }

    @Test
    public void testarautenticausuario() throws NaoFoiPossivelAutenticarUsuarioException {

        Controller_TelaDeLogin login = new Controller_TelaDeLogin();
        when(usuariodao.autenticaUsuarioLogin(any(Usuario.class))).thenReturn(true);
        assertTrue(login.autentica_usuarioLogin("alefe123@gmail", "123", usuariodao));
    }

    @Test
    public void testeparaverficarseusariojaexistenobanco() throws NaoFoiPossivelAutenticarUsuarioException {
         Controller_TelaDeLogin login = new Controller_TelaDeLogin();
        String senha = "123";
        Usuario usuario = new Usuario("alefe@gmail.com", Util.criptografarSenha(senha));
        assertFalse(usuariodao.create(usuario));

    }
}
