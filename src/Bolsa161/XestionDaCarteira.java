/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolsa161;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author JRLV
 */
public class XestionDaCarteira extends javax.swing.JFrame {

    BolsaEnBD novaB = new BolsaEnBD();
    Cliente novoC = new Cliente();

    public XestionDaCarteira() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Xestión da Carteira");
        jTable3Carteira.setVisible(false);
        jTable3Bolsa.setVisible(false);
        jButton2Comprar.setVisible(false);
        jButton3Vender.setVisible(false);
    }

private void verCarteira(){
    PreparedStatement pb;
    jTable3Carteira.removeAll();
    try{
        pb = BolsaEnBD.con.prepareStatement("SELECT * FROM carteira WHERE cliente = ?");
        pb.setString(1, jTextField4Login.getText());
        ResultSet rb = pb.executeQuery();
        jTable3Carteira.setModel(DbUtils.resultSetToTableModel(rb));
        rb.close();
    }catch(SQLException e){
        System.out.println(e.getLocalizedMessage());
    }
}

private void verBolsa(){
    PreparedStatement pb;
    jTable3Bolsa.removeAll();
    try{
        pb = BolsaEnBD.con.prepareStatement("SELECT * FROM accions");
        ResultSet rb = pb.executeQuery();
        jTable3Bolsa.setModel(DbUtils.resultSetToTableModel(rb));
        rb.close();
    }catch(SQLException e){
        System.out.println(e.getLocalizedMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9Clave = new javax.swing.JTextField();
        jTextField4Login = new javax.swing.JTextField();
        jButton1Identificarse = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3Carteira = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1Mensaxe = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1Comprar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1IdEmpresaCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2CantidadeCompra = new javax.swing.JTextField();
        jButton2Comprar = new javax.swing.JButton();
        jLabel1Vender = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3IdEmpresaVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4CantidadeVenta = new javax.swing.JTextField();
        jButton3Vender = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6Bolsa = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3Bolsa = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("LOGIN:");

        jLabel11.setText("CLAVE:");

        jButton1Identificarse.setText("IDENTIFICARSE");
        jButton1Identificarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1IdentificarseActionPerformed(evt);
            }
        });

        jTable3Carteira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idEmpresa", "Cliente", "Cantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3Carteira);

        jButton1.setText("Volver a Acceso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1Comprar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1Comprar.setText("Comprar accións:");

        jLabel1.setText("idEmpresa:");

        jLabel2.setText("Cantidade:");

        jButton2Comprar.setText("COMPRA");
        jButton2Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ComprarActionPerformed(evt);
            }
        });

        jLabel1Vender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1Vender.setText("Vender accións:");

        jLabel3.setText("idEmpresa:");

        jLabel4.setText("Cantidade:");

        jButton3Vender.setText("VENDER");
        jButton3Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3VenderActionPerformed(evt);
            }
        });

        jLabel5.setText("Carteira do Inversor:");

        jLabel6Bolsa.setText("Empresas da Bolsa:");

        jTable3Bolsa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idEmpresa", "Nome", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable3Bolsa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel11))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel6Bolsa)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1Vender)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3IdEmpresaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4CantidadeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Vender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1Comprar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1IdEmpresaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2CantidadeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2Comprar))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Login, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButton1Identificarse, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1Mensaxe))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4Login)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField9Clave)
                        .addComponent(jButton1Identificarse, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1Mensaxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel6Bolsa)
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Comprar)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1IdEmpresaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2CantidadeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2Comprar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Vender)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3IdEmpresaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4CantidadeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3Vender))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1IdentificarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1IdentificarseActionPerformed
        if(novaB.identificar(jTextField4Login.getText(), jTextField9Clave.getText())){
            jTextField1Mensaxe.setText("Inversor atopado.");
            novoC.setLogin(jTextField4Login.getText());
            jTable3Carteira.setVisible(true);
            jTable3Bolsa.setVisible(true);
            verCarteira();
            verBolsa();
            jButton2Comprar.setVisible(true);
            jButton3Vender.setVisible(true);
        }else {
            jTextField1Mensaxe.setText("Inversor descoñecido.");
        }
    }//GEN-LAST:event_jButton1IdentificarseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Acceso acc = new Acceso();
        acc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ComprarActionPerformed
        novoC.comprar(Integer.parseInt(jTextField1IdEmpresaCompra.getText()), Integer.parseInt(jTextField2CantidadeCompra.getText()));
        verCarteira();
    }//GEN-LAST:event_jButton2ComprarActionPerformed

    private void jButton3VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3VenderActionPerformed
        novoC.vender(Integer.parseInt(jTextField3IdEmpresaVenta.getText()), Integer.parseInt(jTextField4CantidadeVenta.getText()));
        verCarteira();
    }//GEN-LAST:event_jButton3VenderActionPerformed

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
            java.util.logging.Logger.getLogger(XestionDaCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XestionDaCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XestionDaCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XestionDaCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XestionDaCarteira().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Identificarse;
    private javax.swing.JButton jButton2Comprar;
    private javax.swing.JButton jButton3Vender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1Comprar;
    private javax.swing.JLabel jLabel1Vender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6Bolsa;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable3Bolsa;
    private javax.swing.JTable jTable3Carteira;
    private javax.swing.JTextField jTextField1IdEmpresaCompra;
    private javax.swing.JTextField jTextField1Mensaxe;
    private javax.swing.JTextField jTextField2CantidadeCompra;
    private javax.swing.JTextField jTextField3IdEmpresaVenta;
    private javax.swing.JTextField jTextField4CantidadeVenta;
    private javax.swing.JTextField jTextField4Login;
    private javax.swing.JTextField jTextField9Clave;
    // End of variables declaration//GEN-END:variables
}
