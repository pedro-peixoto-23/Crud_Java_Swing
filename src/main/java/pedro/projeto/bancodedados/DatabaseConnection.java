/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.projeto.bancodedados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pedro Peixoto Viana de Oliveira
 */
public class DatabaseConnection {
    private Connection connection;
    
    public Connection connectionOpen() {
        // url: "jdbc:mysql://localhost:porta/name_data_base?useTimezone=true&serverTimezone=UTC"
        String url = "jdbc:mysql://localhost:3306/database_alunos?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return connection;
    }
    
    public void connectionClose() {
        try {
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
