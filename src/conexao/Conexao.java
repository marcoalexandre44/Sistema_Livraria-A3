/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alefe
 */
public class Conexao {
    Connection cn = null;
    String url = "jdbc:mysql://localhost:3306/a3_Livraria?user=root&password=";
    public Connection conectarBD(){
    
        try {
            cn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar no Banco de dados" + ex);
        } 
        return cn;
    } 
}
