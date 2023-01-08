package capaPresentacion;

import java.awt.Color;
import java.awt.event.KeyEvent;
import capaDatos.accesoDatos;

/**

██████╗░███████╗███████╗
██╔══██╗  ██╔════╝   ██╔════╝
██████╦╝ █████╗░ █████╗░░
██╔══██╗  ██╔══╝░░  ██╔══╝░░
██████╦╝ ███████╗███████╗
╚═════╝░╚══════╝╚══════╝
**/
public class frmLogin extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    accesoDatos conn = new accesoDatos();
    
    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        sptUsuario = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        sptContraseña = new javax.swing.JSeparator();
        lblImgIngreso = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        lblBtnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(230, 230, 250));
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

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setText("Contraseña");
        pnlPrincipal.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContraseña.setText("Usuario");
        pnlPrincipal.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 165, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(230, 230, 250));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 187, 30));

        sptUsuario.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sptUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 190, 10));

        txtContraseña.setBackground(new java.awt.Color(230, 230, 250));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("Contraseña");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        pnlPrincipal.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 222, 190, 30));

        sptContraseña.setForeground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.add(sptContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, 10));

        lblImgIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lgbt.png"))); // NOI18N
        pnlPrincipal.add(lblImgIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(138, 138, 194));

        lblEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingreso.png"))); // NOI18N

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlPrincipal.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, 30));

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
            .addComponent(lblBtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlPrincipal.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void pnlPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrincipalMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlPrincipalMousePressed

    private void pnlPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrincipalMouseDragged
        int x = evt.getXOnScreen();int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_pnlPrincipalMouseDragged

    private void lblBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblBtnExitMouseClicked

    private void lblBtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnExitMouseEntered
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_lblBtnExitMouseEntered

    private void lblBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnExitMouseExited
      btnExit.setBackground(new Color(230,230,250));
    }//GEN-LAST:event_lblBtnExitMouseExited

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
       btnEntrar.setBackground(new Color(150,150,213));
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
        btnEntrar.setBackground(new Color(138,138,194));
    }//GEN-LAST:event_lblEntrarMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su usuario"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if(String.valueOf(txtContraseña.getPassword()).isEmpty())
        {
            txtContraseña.setText("Contraseña");
            txtContraseña.setForeground(Color.gray);
        } 
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if(String.valueOf(txtContraseña.getPassword()).equals("Contraseña"))
        {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }
        if(txtUsuario.getText().isEmpty())
        {
            txtUsuario.setText("Ingrese su usuario");
            txtUsuario.setForeground(Color.gray);
        }     
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        conn.Abrir();
        boolean Validar = conn.ValidarUsuario(txtUsuario.getText(), txtContraseña.getText());
        if(Validar == true)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Ingreso exitoso!");
            this.hide();
            frmPrincipal frm = new frmPrincipal();
            frm.show();
        }else
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Usuario o contrasena no validos !");
            txtUsuario.setText("");
            txtContraseña.setText("");
        }
        
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            conn.Abrir();
            Boolean Validar = conn.ValidarUsuario(txtUsuario.getText(), txtContraseña.getText());
            if(Validar == true)
            {
                javax.swing.JOptionPane.showMessageDialog(this,"Ingreso exitoso!");
                this.hide();
                frmPrincipal frm = new frmPrincipal();
                frm.show();
            }else
            {
                javax.swing.JOptionPane.showMessageDialog(this,"Usuario o contrasena no validos !");
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBtnExit;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblImgIngreso;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sptContraseña;
    private javax.swing.JSeparator sptUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
