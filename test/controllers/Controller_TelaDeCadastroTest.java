/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controllers;

import DAO.UsuarioDAO;
import DTO.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;

/**
 *
 * @author alefe
 */
public class Controller_TelaDeCadastroTest {

    private final UsuarioDAO DAO = mock(UsuarioDAO.class);

    @Test
    public void testarometododecadastropassandooscamposvazios() {
        Controller_TelaDeCadastro telaDeCadastro = new Controller_TelaDeCadastro();
        String mensagem = telaDeCadastro.cadastro("", "", "");
        assertEquals("campos vazios", mensagem);
    }
 @Test
    public void testarometododecadastropassandooscamposinvalidos() {
        Controller_TelaDeCadastro telaDeCadastro = new Controller_TelaDeCadastro();
        String emailinvalido = telaDeCadastro.cadastro("araujo", "aleffdfgfafgnhhilm", "123");
        assertEquals("email ou senha invallidos", emailinvalido);
    }
}
