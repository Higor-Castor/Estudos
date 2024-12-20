
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alunos
 */
public class FormGerente extends javax.swing.JFrame {
        Gerente grt = new Gerente();
    public FormGerente() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textRegistro = new javax.swing.JTextField();
        textSetor = new javax.swing.JTextField();
        textSalario = new javax.swing.JTextField();
        textGratificacao = new javax.swing.JTextField();
        butCadastrar = new javax.swing.JButton();
        butExibir = new javax.swing.JButton();
        butVoltar = new javax.swing.JButton();
        butCalcSal = new javax.swing.JButton();
        textCalcSal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gerente");

        jLabel2.setText("Nome");

        jLabel3.setText("Registro");

        jLabel4.setText("Setor");

        jLabel5.setText("Salario");

        jLabel6.setText("Gratificação");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        textSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSetorActionPerformed(evt);
            }
        });

        butCadastrar.setText("Cadastrar");
        butCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCadastrarActionPerformed(evt);
            }
        });

        butExibir.setText("Exibir");
        butExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExibirActionPerformed(evt);
            }
        });

        butVoltar.setText("Voltar");
        butVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVoltarActionPerformed(evt);
            }
        });

        butCalcSal.setText("Calcular Salario");
        butCalcSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCalcSalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(butCalcSal)
                .addGap(18, 18, 18)
                .addComponent(textCalcSal)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNome)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(butCadastrar)
                                .addGap(36, 36, 36)
                                .addComponent(butExibir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel1)))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textRegistro)
                                    .addComponent(textSetor)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textSalario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(butVoltar)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textGratificacao)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textGratificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butCadastrar)
                    .addComponent(butExibir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butCalcSal)
                    .addComponent(textCalcSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(butVoltar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSetorActionPerformed

    private void butCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCadastrarActionPerformed
                  grt.nome = this.textNome.getText();
                  grt.registro = Integer.parseInt(this.textRegistro.getText());
                  grt.Setor = this.textSetor.getText();
                  grt.salario = Double.parseDouble(this.textSalario.getText());
                  grt.gratificacao = Double.parseDouble(this.textGratificacao.getText());
                  JOptionPane.showMessageDialog(null,"Dados Cadastrados com Sucesso");
                  this.textNome.setText("");
                  this.textRegistro.setText("");
                  this.textSetor.setText("");
                  this.textSalario.setText("");
                  this.textGratificacao.setText("");
                  
   
    }//GEN-LAST:event_butCadastrarActionPerformed

    private void butExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExibirActionPerformed
                  this.textNome.setText(grt.nome);
                  this.textRegistro.setText("" + grt.registro);
                  this.textSetor.setText(grt.Setor);
                  this.textSalario.setText("" + grt.salario);
                  this.textGratificacao.setText("" + grt.gratificacao);
    }//GEN-LAST:event_butExibirActionPerformed

    private void butCalcSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCalcSalActionPerformed
                      this.textCalcSal.setText("" + grt.CalcSal());
    }//GEN-LAST:event_butCalcSalActionPerformed

    private void butVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVoltarActionPerformed
       new FormEmpresa().setVisible(true);
       dispose();
    }//GEN-LAST:event_butVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCadastrar;
    private javax.swing.JButton butCalcSal;
    private javax.swing.JButton butExibir;
    private javax.swing.JButton butVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textCalcSal;
    private javax.swing.JTextField textGratificacao;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textRegistro;
    private javax.swing.JTextField textSalario;
    private javax.swing.JTextField textSetor;
    // End of variables declaration//GEN-END:variables
}
