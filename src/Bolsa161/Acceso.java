/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolsa161;

/**
 *
 * @author JRLV
 */
public class Acceso extends javax.swing.JFrame {

    BolsaEnBD novaB = new BolsaEnBD();

    public Acceso() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Acceso a Bolsa");
        novaB.iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Xestion = new javax.swing.JButton();
        jButton2NovoInversor = new javax.swing.JButton();
        jButton3NovaEmpresa = new javax.swing.JButton();
        jButton3Actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1Xestion.setText("Xestión da Carteira");
        jButton1Xestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1XestionActionPerformed(evt);
            }
        });

        jButton2NovoInversor.setText("Dar de alta novo inversor");
        jButton2NovoInversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2NovoInversorActionPerformed(evt);
            }
        });

        jButton3NovaEmpresa.setText("Dar de alta nova empresa");
        jButton3NovaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3NovaEmpresaActionPerformed(evt);
            }
        });

        jButton3Actualizar.setText("Actualizar valores da Bolsa");
        jButton3Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3NovaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2NovoInversor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Xestion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1Xestion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2NovoInversor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3NovaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1XestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1XestionActionPerformed
        XestionDaCarteira carteiraCliente = new XestionDaCarteira();
        carteiraCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1XestionActionPerformed

    private void jButton2NovoInversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2NovoInversorActionPerformed
        NovoInversor novoI = new NovoInversor();
        novoI.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2NovoInversorActionPerformed

    private void jButton3NovaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3NovaEmpresaActionPerformed
        NovaEmpresa novaE = new NovaEmpresa();
        novaE.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3NovaEmpresaActionPerformed

    private void jButton3ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActualizarActionPerformed
        Actualizar act = new Actualizar();
        act.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Xestion;
    private javax.swing.JButton jButton2NovoInversor;
    private javax.swing.JButton jButton3Actualizar;
    private javax.swing.JButton jButton3NovaEmpresa;
    // End of variables declaration//GEN-END:variables
}
