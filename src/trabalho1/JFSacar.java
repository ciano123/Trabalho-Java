/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho1;

import javax.swing.JOptionPane;
/**
 *
 * @author Cassiano
 */
public class JFSacar extends javax.swing.JFrame {

    /**
     * Creates new form JFSacar
     */
    public JFSacar() {
        initComponents();
    }
   public int n;
    /*public int tipoN(int n1){
        return n1;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNumeroC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saldin = new javax.swing.JLabel();
        pesquisar = new javax.swing.JButton();
        jVsaque = new javax.swing.JTextField();
        Bok = new javax.swing.JButton();
        limm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N° Conta ");

        jNumeroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumeroCActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor saque");

        jLabel4.setText("Saldo");

        saldin.setAlignmentX(6.0F);

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        jVsaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVsaqueActionPerformed(evt);
            }
        });

        Bok.setText("Ok");
        Bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokActionPerformed(evt);
            }
        });

        limm.setText("Limpar");
        limm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limmActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Bok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jVsaque, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisar)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jVsaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bok)
                    .addComponent(limm)
                    .addComponent(cancel))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void jNumeroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumeroCActionPerformed
        
    }//GEN-LAST:event_jNumeroCActionPerformed

    private void jVsaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVsaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVsaqueActionPerformed

    private void BokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokActionPerformed
        String strSaque = jVsaque.getText();
        double dbSaque = Double.parseDouble(strSaque);
        int response = JOptionPane.showConfirmDialog(this, "Deseja continuar?", "Confirmar" , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_NO_OPTION){
            if(n==1){
            
            JOptionPane.showMessageDialog(null, Principal.conta1.getNome());
            Principal.conta1.sacar(dbSaque);
            JFInicial inicio = new JFInicial();
            inicio.setResizable(false);
            inicio.setVisible(true);
            dispose();
        }else if(n==2){
            JOptionPane.showMessageDialog(null, Principal.conta2.getNome());
            Principal.conta2.sacar(dbSaque);
            JFInicial inicio = new JFInicial();
            inicio.setResizable(false);
            inicio.setVisible(true);
            dispose();
        } else if(n==3){
            JOptionPane.showMessageDialog(null, Principal.conta3.getNome());
            Principal.conta3.descontar(dbSaque, Principal.conta3.getSaldo(),Principal.conta3.getLimite(),Principal.conta3.getMulta());
            JFInicial inicio = new JFInicial();
            inicio.setResizable(false);
            inicio.setVisible(true);
            dispose();
        }
        // JOptionPane.showMessageDialog(null, "Saque efetuado");   
        }
            
        else if(response==JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Saque cancelado");
            dispose();
            JFSacar s = new JFSacar();
            s.setResizable(false);
            s.setVisible(true);
            
        }else if(response==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Operação não realizada"); 
            dispose();
             JFSacar s = new JFSacar();
             s.setResizable(false);
             s.setVisible(true);
             
        }
    }//GEN-LAST:event_BokActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        String str = jNumeroC.getText();
        int istr = Integer.parseInt(str);
        if(Principal.conta1.getNumero()==istr){
            String str1 = String.valueOf(Principal.conta1.getSaldo());
            saldin.setText(str1);
            n=1;
           
        }
        if(Principal.conta2.getNumero()==istr){
            String str2 = String.valueOf(Principal.conta2.getSaldo());
            saldin.setText(str2);
            n=2;
        
        }
        if(Principal.conta3.getNumero()==istr){
            String str3 = String.valueOf(Principal.conta3.getSaldo());
            saldin.setText(str3);
            n=3;
        
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void limmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limmActionPerformed
       jNumeroC.setText("");
       jVsaque.setText("");
    }//GEN-LAST:event_limmActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        JFInicial inicio = new JFInicial();
        inicio.setVisible(true);
        inicio.setResizable(false);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(JFSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSacar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bok;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jNumeroC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jVsaque;
    private javax.swing.JButton limm;
    private javax.swing.JButton pesquisar;
    private javax.swing.JLabel saldin;
    // End of variables declaration//GEN-END:variables
}
