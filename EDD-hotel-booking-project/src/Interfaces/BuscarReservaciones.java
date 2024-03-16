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
public class BuscarReservaciones extends javax.swing.JFrame {

    public BuscarReservaciones() {
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
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Info = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Reservaciones");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("<VOLVER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logohotel.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 110));

        Cedula.setBackground(new java.awt.Color(255, 255, 255));
        Cedula.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Cedula.setForeground(new java.awt.Color(102, 102, 102));
        Cedula.setText("  Cedula");
        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        Buscar.setBackground(new java.awt.Color(210, 192, 137));
        Buscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(0, 0, 0));
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 80, 30));

        Info.setEditable(false);
        Info.setBackground(new java.awt.Color(255, 255, 255));
        Info.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Info.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clients (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 240, 410));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
            int ci=0;
        try{
            ci=Integer.parseInt(Cedula.getText());
            
        }catch(Exception e){
            Info.setText("Ingrese un numero de cédula válido");
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       InterfaceFunctions.VolverNosotros();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarReservaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
