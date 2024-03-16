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
public class CheckIn extends javax.swing.JFrame {

    public CheckIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        info = new javax.swing.JTextField();
        mes = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        checkin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(102, 102, 102));
        Nombre.setText("   Nombre");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Check-In");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logohotel.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 690, -1));

        Apellido.setBackground(new java.awt.Color(255, 255, 255));
        Apellido.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Apellido.setForeground(new java.awt.Color(102, 102, 102));
        Apellido.setText("  Apellido");
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, 30));

        info.setEditable(false);
        info.setBackground(new java.awt.Color(255, 255, 255));
        info.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 340, 30));

        mes.setBackground(new java.awt.Color(255, 255, 255));
        mes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mes.setForeground(new java.awt.Color(0, 0, 0));
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 90, -1));

        ano.setBackground(new java.awt.Color(255, 255, 255));
        ano.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ano.setForeground(new java.awt.Color(0, 0, 0));
        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024" }));
        jPanel1.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 60, -1));

        dia.setBackground(new java.awt.Color(255, 255, 255));
        dia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dia.setForeground(new java.awt.Color(0, 0, 0));
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, -1));

        checkin.setBackground(new java.awt.Color(210, 192, 137));
        checkin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkin.setForeground(new java.awt.Color(0, 0, 0));
        checkin.setText("Check-In");
        checkin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/campana (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterfaceFunctions.VolverNosotros();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Nombre;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JButton checkin;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JTextField info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mes;
    // End of variables declaration//GEN-END:variables
}
