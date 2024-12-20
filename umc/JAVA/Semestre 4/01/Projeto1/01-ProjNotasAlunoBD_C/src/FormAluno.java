
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alunocmc
 */
public class FormAluno extends javax.swing.JFrame {
    
    ControleAluno controle = new ControleAluno();

   
    public FormAluno() {
        controle.Conexao();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textrgm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textnota1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textnota2 = new javax.swing.JTextField();
        ButCadastrar = new javax.swing.JButton();
        ButConsultar = new javax.swing.JButton();
        ButAlterar = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        ButListar = new javax.swing.JButton();
        ButSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textMedia = new javax.swing.JTextField();
        butMedia = new javax.swing.JButton();
        butLimparCampo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Notas Aluno");

        jLabel2.setText("RGM");

        jLabel3.setText("Nome");

        jLabel4.setText("Nota 1");

        jLabel5.setText("Nota 2");

        ButCadastrar.setText("CADASTRAR");
        ButCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });

        ButConsultar.setText("CONSULTAR");
        ButConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButConsultarActionPerformed(evt);
            }
        });

        ButAlterar.setText("ALTERAR");
        ButAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAlterarActionPerformed(evt);
            }
        });

        ButExcluir.setText("EXCLUIR");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });

        ButListar.setText("LISTAR");
        ButListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButListarActionPerformed(evt);
            }
        });

        ButSair.setText("SAIR");
        ButSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSairActionPerformed(evt);
            }
        });

        jLabel6.setText("Media");

        textMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMediaActionPerformed(evt);
            }
        });

        butMedia.setText("Calcular Media");
        butMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMediaActionPerformed(evt);
            }
        });

        butLimparCampo.setText("Limpar Campo");
        butLimparCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparCampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butLimparCampo)
                .addGap(18, 18, 18)
                .addComponent(ButSair))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textrgm, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(textnome)
                                    .addComponent(textnota1)
                                    .addComponent(textnota2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(butMedia))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButCadastrar)
                        .addGap(34, 34, 34)
                        .addComponent(ButConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(ButExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(ButListar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textrgm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butMedia))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButConsultar)
                    .addComponent(ButAlterar)
                    .addComponent(ButExcluir)
                    .addComponent(ButListar)
                    .addComponent(ButCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButSair)
                    .addComponent(butLimparCampo)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastrarActionPerformed
        controle.Cadastrar(Integer.parseInt(this.textrgm.getText()), 
                 this.textnome.getText(), 
                 Double.parseDouble(this.textnota1.getText()),
                 Double.parseDouble(this.textnota2.getText()));

        this.textrgm.setText("");
        this.textnome.setText("");
        this.textnota1.setText("");
        this.textnota2.setText("");

    }//GEN-LAST:event_ButCadastrarActionPerformed

    private void ButListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButListarActionPerformed
        controle.listar();
    }//GEN-LAST:event_ButListarActionPerformed

    private void ButConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButConsultarActionPerformed
            String info = controle.Consultar(Integer.parseInt(this.textrgm.getText()));
            String vetor [] = info.split(";");
            this.textnome.setText(vetor[0]);
            this.textnota1.setText(vetor[1]);
            this.textnota2.setText(vetor[2]);
    }//GEN-LAST:event_ButConsultarActionPerformed

    private void ButAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAlterarActionPerformed
        controle.Alterar(Integer.parseInt(this.textrgm.getText()), 
                 this.textnome.getText(), 
                 Double.parseDouble(this.textnota1.getText()),
                 Double.parseDouble(this.textnota2.getText()));
        this.textrgm.setText("");
        this.textnome.setText("");
        this.textnota1.setText("");
        this.textnota2.setText("");
        

    }//GEN-LAST:event_ButAlterarActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        controle.Excluir(Integer.parseInt(this.textrgm.getText()));
        this.textrgm.setText("");
    }//GEN-LAST:event_ButExcluirActionPerformed

    private void ButSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButSairActionPerformed

    private void textMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMediaActionPerformed

    private void butMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMediaActionPerformed
        this.textMedia.setText(" "+controle.CalcularMedia(Double.parseDouble(this.textnota1.getText()),Double.parseDouble(this.textnota2.getText())));
        
    }//GEN-LAST:event_butMediaActionPerformed

    private void butLimparCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparCampoActionPerformed
        this.textrgm.setText("");
        this.textnome.setText("");
        this.textnota1.setText("");
        this.textnota2.setText("");
        this.textMedia.setText("");
            }//GEN-LAST:event_butLimparCampoActionPerformed

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
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAlterar;
    private javax.swing.JButton ButCadastrar;
    private javax.swing.JButton ButConsultar;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButListar;
    private javax.swing.JButton ButSair;
    private javax.swing.JButton butLimparCampo;
    private javax.swing.JButton butMedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textMedia;
    private javax.swing.JTextField textnome;
    private javax.swing.JTextField textnota1;
    private javax.swing.JTextField textnota2;
    private javax.swing.JTextField textrgm;
    // End of variables declaration//GEN-END:variables
}
