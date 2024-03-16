/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Camila Garcia
 */
public class Nosotros extends javax.swing.JFrame {
    public Nosotros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BuscarClientes = new javax.swing.JButton();
        BusquedaReservaciones = new javax.swing.JButton();
        HistorialHab = new javax.swing.JButton();
        CheckIn = new javax.swing.JButton();
        Checkout = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logohotel.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        BuscarClientes.setBackground(new java.awt.Color(255, 255, 255));
        BuscarClientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BuscarClientes.setForeground(new java.awt.Color(0, 0, 0));
        BuscarClientes.setText("CLIENTES");
        BuscarClientes.setBorder(null);
        BuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClientesActionPerformed(evt);
            }
        });
        jPanel2.add(BuscarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 80, 30));

        BusquedaReservaciones.setBackground(new java.awt.Color(255, 255, 255));
        BusquedaReservaciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BusquedaReservaciones.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaReservaciones.setText("RESERVACIONES");
        BusquedaReservaciones.setBorder(null);
        BusquedaReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaReservacionesActionPerformed(evt);
            }
        });
        jPanel2.add(BusquedaReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, 30));

        HistorialHab.setBackground(new java.awt.Color(255, 255, 255));
        HistorialHab.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HistorialHab.setForeground(new java.awt.Color(0, 0, 0));
        HistorialHab.setText("HISTORIAL");
        HistorialHab.setBorder(null);
        HistorialHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialHabActionPerformed(evt);
            }
        });
        jPanel2.add(HistorialHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 30));

        CheckIn.setBackground(new java.awt.Color(255, 255, 255));
        CheckIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CheckIn.setForeground(new java.awt.Color(0, 0, 0));
        CheckIn.setText("CHECK-IN");
        CheckIn.setBorder(null);
        CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInActionPerformed(evt);
            }
        });
        jPanel2.add(CheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, 30));

        Checkout.setBackground(new java.awt.Color(255, 255, 255));
        Checkout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Checkout.setForeground(new java.awt.Color(0, 0, 0));
        Checkout.setText("CHECK-OUT");
        Checkout.setBorder(null);
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });
        jPanel2.add(Checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, 30));

        Salir.setBackground(new java.awt.Color(210, 192, 137));
        Salir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("SALIR");
        Salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 60, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotel (1).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 260));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotelinterno (1).jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 260));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Desde 2024, Caracas Hotel ha creado en el país una sólida filosofía de servicio plasmada en sus servicios hoteleros. Buscamos satisfacer ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("las necesidades de cada uno de nuestros huéspedes, desde el más exigente ejecutivo hasta una extensa familia, ofreciendo un espacio exclusivo ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 950, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NOSOTROS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("con los más altos estándares de calidad, confianza y servicio.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 950, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("0800-CARACAS                                              caracashotelreservaciones@gmail.com                                                       @ccshotel          ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 820, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 940, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClientesActionPerformed
        InterfaceFunctions.openBuscarClientes();
    }//GEN-LAST:event_BuscarClientesActionPerformed

    private void BusquedaReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaReservacionesActionPerformed
        InterfaceFunctions.openBuscarReservaciones();
    }//GEN-LAST:event_BusquedaReservacionesActionPerformed

    private void HistorialHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialHabActionPerformed
        InterfaceFunctions.openHistorial();
    }//GEN-LAST:event_HistorialHabActionPerformed

    private void CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInActionPerformed
        InterfaceFunctions.openCheckIn();
    }//GEN-LAST:event_CheckInActionPerformed

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        InterfaceFunctions.openCheckout();
    }//GEN-LAST:event_CheckoutActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
        System.exit(0);

    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Nosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nosotros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nosotros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarClientes;
    private javax.swing.JButton BusquedaReservaciones;
    private javax.swing.JButton CheckIn;
    private javax.swing.JButton Checkout;
    private javax.swing.JButton HistorialHab;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
