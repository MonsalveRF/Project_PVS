/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capaPresentacion;

import java.awt.Color;

/**
 *
 * @author admin
 */
public class frmPrincipal extends javax.swing.JFrame {
    int xMouse, yMouse;
    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        lblBtnExit = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JPanel();
        lblBtnRegistro = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JPanel();
        lblBtnIngreso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        pnlPrincipal.setBackground(new java.awt.Color(230, 230, 250));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(540, 343));
        pnlPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlPrincipalMouseDragged(evt);
            }
        });
        pnlPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPrincipalMousePressed(evt);
            }
        });
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(230, 230, 250));

        lblBtnExit.setBackground(new java.awt.Color(230, 230, 250));
        lblBtnExit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBtnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnExit.setText("X");
        lblBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPrincipal.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 30, 30));

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre1.setText("Selecciona la opcion");
        pnlPrincipal.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        btnRegistro.setBackground(new java.awt.Color(138, 138, 194));

        lblBtnRegistro.setBackground(new java.awt.Color(138, 138, 194));
        lblBtnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBtnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnRegistro.setText("Registro");
        lblBtnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnRegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistroLayout = new javax.swing.GroupLayout(btnRegistro);
        btnRegistro.setLayout(btnRegistroLayout);
        btnRegistroLayout.setHorizontalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnRegistroLayout.setVerticalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPrincipal.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 140, -1));

        btnIngreso.setBackground(new java.awt.Color(138, 138, 194));

        lblBtnIngreso.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblBtnIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnIngreso.setText("Ingreso");
        lblBtnIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnIngresoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIngresoLayout = new javax.swing.GroupLayout(btnIngreso);
        btnIngreso.setLayout(btnIngresoLayout);
        btnIngresoLayout.setHorizontalGroup(
            btnIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnIngresoLayout.setVerticalGroup(
            btnIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIngresoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPrincipal.add(btnIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 140, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/selection.png"))); // NOI18N
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblBtnExitMouseClicked

    private void lblBtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnExitMouseEntered
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_lblBtnExitMouseEntered

    private void lblBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnExitMouseExited
        btnExit.setBackground(new Color(230,230,250));
    }//GEN-LAST:event_lblBtnExitMouseExited

    private void pnlPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrincipalMouseDragged
        int x = evt.getXOnScreen();int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_pnlPrincipalMouseDragged

    private void pnlPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrincipalMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlPrincipalMousePressed

    private void lblBtnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnRegistroMouseEntered
        btnRegistro.setBackground(new Color(150,150,213));
    }//GEN-LAST:event_lblBtnRegistroMouseEntered

    private void lblBtnIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnIngresoMouseEntered
        btnIngreso.setBackground(new Color(150,150,213));
    }//GEN-LAST:event_lblBtnIngresoMouseEntered

    private void lblBtnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnRegistroMouseExited
        btnRegistro.setBackground(new Color(138,138,194));
    }//GEN-LAST:event_lblBtnRegistroMouseExited

    private void lblBtnIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnIngresoMouseExited
        btnIngreso.setBackground(new Color(138,138,194));
    }//GEN-LAST:event_lblBtnIngresoMouseExited

    private void lblBtnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnRegistroMouseClicked
        this.hide();
        frmRegistro frm = new frmRegistro();
        frm.show();
    }//GEN-LAST:event_lblBtnRegistroMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnIngreso;
    private javax.swing.JPanel btnRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBtnExit;
    private javax.swing.JLabel lblBtnIngreso;
    private javax.swing.JLabel lblBtnRegistro;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
