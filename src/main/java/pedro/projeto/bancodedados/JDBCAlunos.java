/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.projeto.bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pedro.projeto.modelo.Student;

/**
 *
 * @author Pedro Peixoto Viana de Oliveira
 */
public class JDBCAlunos {
    
    Connection connection;

    public JDBCAlunos(Connection connection) {
        this.connection = connection;
    }
    
    public void insertStudent(Student student) {
        try {
            String sql = "insert into alunos(matricula, nome, curso) values (?, ?, ?)";
            PreparedStatement ps;
        

            ps = this.connection.prepareStatement(sql);
            ps.setString(1, student.getMatricula());
            ps.setString(2, student.getNome());
            ps.setString(3, student.getCurso());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public int numberOfOccurrences(String matricula) {
        int count = 0;
        try {
            String query = "SELECT COUNT(*) AS count FROM alunos WHERE matricula = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, matricula);

            ResultSet result = ps.executeQuery();
            if (result.next()) {
                count = result.getInt("count");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }
    
    public ArrayList<Student> listStudents() throws SQLException {
        ArrayList<Student> students = new ArrayList<Student>();
        
        try {
            String sql = "select * from alunos";

            Statement declaration = connection.createStatement();
            ResultSet result = declaration.executeQuery(sql);
            
            while (result.next()) {
                String matricula = result.getNString("matricula");
                String nome = result.getString("nome");
                String curso = result.getString("curso");
                
                Student student = new Student(matricula, nome, curso);
                
                students.add(student);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        
        return students;
    }
    
    public void updateStudent(String matricula, String nome, String curso) {
        try {
            String sql = "UPDATE alunos SET nome = ?, curso = ? WHERE matricula = ?"; 
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, curso);
            ps.setString(3, matricula);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteStudent(String matricula) {
        try {
            String sql = "DELETE FROM alunos WHERE matricula = ?"; 
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, matricula);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
    }
}