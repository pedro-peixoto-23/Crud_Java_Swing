/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pedro.projeto;

import javax.swing.JOptionPane;
import pedro.projeto.telas.Opcoes;

/**
 *
 * @author Pedro Peixoto Viana de Oliveira
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form initial
     */
    public Inicial() {
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

        painelPrincipal = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailCaixaTexto = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaCaixaTexto = new javax.swing.JTextField();
        entrarBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        painelPrincipal.setBackground(new java.awt.Color(0, 20, 66));

        tituloLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("Login");

        emailLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        emailCaixaTexto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        emailCaixaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        senhaLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(255, 255, 255));
        senhaLabel.setText("Senha");

        senhaCaixaTexto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        entrarBotao.setBackground(new java.awt.Color(255, 179, 13));
        entrarBotao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        entrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        entrarBotao.setText("Entrar");
        entrarBotao.setBorder(null);
        entrarBotao.setBorderPainted(false);
        entrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        entrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel)
                    .addComponent(senhaCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaLabel)
                    .addComponent(emailLabel)
                    .addComponent(emailCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(33, 33, 33)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCaixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(374, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {
        String email = emailCaixaTexto.getText();
        String senha = senhaCaixaTexto.getText();

        String email_correto = "pedro@gmail.com";
        String senha_correta = "1234";

        if (email.equals(email_correto) && senha.equals(senha_correta)) {
            Opcoes tela = new Opcoes();
            this.dispose();
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Dados incorretos!");
        }
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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailCaixaTexto;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton entrarBotao;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField senhaCaixaTexto;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
