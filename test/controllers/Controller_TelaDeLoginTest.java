package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class Controller_TelaDeLoginTest {

    private UsuarioDAO DAO = mock(UsuarioDAO.class);

    @Test
    public void testeparaverificaroniveldousuario() {
        Controller_TelaDeLogin login = new Controller_TelaDeLogin();
        when(DAO.verificarAdmin(any(Usuario.class))).thenReturn(true);
        assertTrue(login.validarNivelDeUsuario("alefe123@gmail", "123", DAO));
    }

    @Test
    public void testarautenticausuario() {
        
        Controller_TelaDeLogin login = new Controller_TelaDeLogin();
        when(DAO.autenticaUsuarioLogin(any(Usuario.class))).thenReturn(true);
        assertTrue(login.autentica_usuarioLogin("alefe123@gmail", "123", DAO));
    }
}
