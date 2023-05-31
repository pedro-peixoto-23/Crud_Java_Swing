/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pedro.projeto.telas;

import javax.swing.JOptionPane;
import pedro.projeto.bancodedados.DatabaseConnection;
import pedro.projeto.bancodedados.JDBCAlunos;
import pedro.projeto.modelo.Student;

/**
 *
 * @author Pedro Peixoto Viana de Oliveira
 */
public class Adicionar extends javax.swing.JFrame {

    /**
     * Creates new form Adicionar
     */
    public Adicionar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        matriculaLabel = new javax.swing.JLabel();
        matriculaCaixaTexto = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeCaixaTexto = new javax.swing.JTextField();
        cursoLabel = new javax.swing.JLabel();
        cursoCaixaTexto = new javax.swing.JTextField();
        adicionarBotao = new javax.swing.JButton();
        listarAlunosBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar");

        jPanel1.setBackground(new java.awt.Color(0, 20, 66));

        tituloLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("Adicionar aluno");

        matriculaLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        matriculaLabel.setForeground(new java.awt.Color(255, 255, 255));
        matriculaLabel.setText("Matrícula");

        matriculaCaixaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        nomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("Nome");

        nomeCaixaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        cursoLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cursoLabel.setForeground(new java.awt.Color(255, 255, 255));
        cursoLabel.setText("Curso");

        cursoCaixaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        adicionarBotao.setBackground(new java.awt.Color(7, 84, 83));
        adicionarBotao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adicionarBotao.setForeground(new java.awt.Color(255, 255, 255));
        adicionarBotao.setText("Adcionar");
        adicionarBotao.setBorder(null);
        adicionarBotao.setBorderPainted(false);
        adicionarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBotaoActionPerformed(evt);
            }
        });

        listarAlunosBotao.setBackground(new java.awt.Color(122, 122, 122));
        listarAlunosBotao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        listarAlunosBotao.setForeground(new java.awt.Color(255, 255, 255));
        listarAlunosBotao.setText("Listar alunos");
        listarAlunosBotao.setBorder(null);
        listarAlunosBotao.setBorderPainted(false);
        listarAlunosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarAlunosBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel)
                    .addComponent(cursoLabel)
                    .addComponent(nomeLabel)
                    .addComponent(nomeCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculaLabel)
                    .addComponent(matriculaCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(adicionarBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursoCaixaTexto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addComponent(listarAlunosBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(30, 30, 30)
                .addComponent(matriculaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matriculaCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cursoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(adicionarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listarAlunosBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarBotaoActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseConnection connection = new DatabaseConnection();
        JDBCAlunos jdbc = new JDBCAlunos(connection.connectionOpen());
        String matricula = matriculaCaixaTexto.getText();
        String nome = nomeCaixaTexto.getText();
        String curso = cursoCaixaTexto.getText();
        if (matricula.equals("") == false && nome.equals("") == false && curso.equals("") == false) {
            if (matricula.length() == 4) {
                if (jdbc.numberOfOccurrences(matricula) == 0) {
                    Student student = new Student(matricula, nome, curso);
                    jdbc.insertStudent(student);
                    JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Matrícula já cadastrada!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "A matrícula deve ter 4 dígitos!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }
        connection.connectionClose();
    }

    private void listarAlunosBotaoActionPerformed(java.awt.event.ActionEvent evt) {
        ListarAlunos tela = new ListarAlunos();
        this.dispose();
        tela.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adicionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarBotao;
    private javax.swing.JTextField cursoCaixaTexto;
    private javax.swing.JLabel cursoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listarAlunosBotao;
    private javax.swing.JTextField matriculaCaixaTexto;
    private javax.swing.JLabel matriculaLabel;
    private javax.swing.JTextField nomeCaixaTexto;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
