
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alunos
 */
public class FormAssalariado extends javax.swing.JFrame {
            Assalariado ast = new Assalariado();
    public FormAssalariado() {
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

        textNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textRegistro = new javax.swing.JTextField();
        textSetor = new javax.swing.JTextField();
        textSalario = new javax.swing.JTextField();
        textDesconto = new javax.swing.JTextField();
        butVoltar = new javax.swing.JButton();
        butExibir = new javax.swing.JButton();
        butCalcSal = new javax.swing.JButton();
        textCalcSal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Registro");

        jLabel3.setText("Setor");

        jLabel4.setText("Salario");

        jLabel5.setText("Desconto");

        textRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRegistroActionPerformed(evt);
            }
        });

        butVoltar.setText("Voltar");
        butVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVoltarActionPerformed(evt);
            }
        });

        butExibir.setText("Exibir");
        butExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExibirActionPerformed(evt);
            }
        });

        butCalcSal.setText("Calcular Salario");
        butCalcSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCalcSalActionPerformed(evt);
            }
        });

        jLabel6.setText("Assalariado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butVoltar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textRegistro)
                                    .addComponent(textSetor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textSalario)
                                    .addComponent(textDesconto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butCalcSal)
                                .addGap(64, 64, 64)
                                .addComponent(textCalcSal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel6)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(butExibir)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butExibir)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCalcSal)
                    .addComponent(textCalcSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(butVoltar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  ast.nome = this.textNome.getText();
                  ast.registro = Integer.parseInt(this.textRegistro.getText());
                  ast.Setor = this.textSetor.getText();
                  ast.salario = Double.parseDouble(this.textSalario.getText());
                  ast.desconto = Double.parseDouble(this.textDesconto.getText());
                  JOptionPane.showMessageDialog(null,"Dados Cadastrados com Sucesso");
                  this.textNome.setText("");
                  this.textRegistro.setText("");
                  this.textSetor.setText("");
                  this.textSalario.setText("");
                  this.textDesconto.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRegistroActionPerformed

    private void butVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVoltarActionPerformed
       new FormEmpresa().setVisible(true);
       dispose();
    }//GEN-LAST:event_butVoltarActionPerformed

    private void butExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExibirActionPerformed
                  this.textNome.setText(ast.nome);
                  this.textRegistro.setText("" + ast.registro);
                  this.textSetor.setText(ast.Setor);
                  this.textSalario.setText("" + ast.salario);
                  this.textDesconto.setText("" + ast.desconto);
    }//GEN-LAST:event_butExibirActionPerformed

    private void butCalcSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCalcSalActionPerformed
                this.textCalcSal.setText("" + ast.CalcSal());
    }//GEN-LAST:event_butCalcSalActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCalcSal;
    private javax.swing.JButton butExibir;
    private javax.swing.JButton butVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textCalcSal;
    private javax.swing.JTextField textDesconto;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textRegistro;
    private javax.swing.JTextField textSalario;
    private javax.swing.JTextField textSetor;
    // End of variables declaration//GEN-END:variables
}