package Frames;

import Database.SignIn_DB;
import java.awt.Font;
import javax.swing.JOptionPane;

public class SignIn extends javax.swing.JFrame {

    public static String mail_phone;
    public static String signin_pass;

    public SignIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SIGNINpanel = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MAIL_PHONE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SIGNIN_PASS = new javax.swing.JPasswordField();
        SIGNIN = new javax.swing.JButton();
        forgot = new javax.swing.JButton();
        signINtoUP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SIGNINpanel.setBackground(new java.awt.Color(196, 165, 134));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LawyerBook.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 45, 44));
        jLabel1.setText("SIGN IN TO YOUR ACCOUNT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 45, 44));
        jLabel2.setText("Email / Phone");

        MAIL_PHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAIL_PHONEActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 45, 44));
        jLabel3.setText("Password");

        SIGNIN.setBackground(new java.awt.Color(55, 45, 44));
        SIGNIN.setForeground(new java.awt.Color(196, 165, 134));
        SIGNIN.setText("Sign In"); // NOI18N
        SIGNIN.setToolTipText("Sign In");
        SIGNIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNIN.setFocusable(false);
        SIGNIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNINActionPerformed(evt);
            }
        });

        forgot.setBackground(new java.awt.Color(196, 165, 134));
        forgot.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        forgot.setForeground(new java.awt.Color(55, 45, 44));
        forgot.setText("Forgotten Password");
        forgot.setBorderPainted(false);
        forgot.setContentAreaFilled(false);
        forgot.setFocusPainted(false);
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotMouseExited(evt);
            }
        });
        forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotActionPerformed(evt);
            }
        });

        signINtoUP.setBackground(new java.awt.Color(196, 165, 134));
        signINtoUP.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        signINtoUP.setForeground(new java.awt.Color(55, 45, 44));
        signINtoUP.setText("Create New Account");
        signINtoUP.setBorderPainted(false);
        signINtoUP.setContentAreaFilled(false);
        signINtoUP.setFocusPainted(false);
        signINtoUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signINtoUPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signINtoUPMouseExited(evt);
            }
        });
        signINtoUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signINtoUPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SIGNINpanelLayout = new javax.swing.GroupLayout(SIGNINpanel);
        SIGNINpanel.setLayout(SIGNINpanelLayout);
        SIGNINpanelLayout.setHorizontalGroup(
            SIGNINpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIGNINpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(img)
                .addGroup(SIGNINpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SIGNINpanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(SIGNINpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(MAIL_PHONE)
                            .addComponent(jLabel3)
                            .addComponent(SIGNIN_PASS, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)))
                    .addGroup(SIGNINpanelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1))
                    .addGroup(SIGNINpanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signINtoUP))
                    .addGroup(SIGNINpanelLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(SIGNIN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        SIGNINpanelLayout.setVerticalGroup(
            SIGNINpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SIGNINpanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MAIL_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SIGNIN_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SIGNIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SIGNINpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgot)
                    .addComponent(signINtoUP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIGNINpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIGNINpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MAIL_PHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAIL_PHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAIL_PHONEActionPerformed

    private void SIGNINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNINActionPerformed
        // TODO add your handling code here:

        mail_phone = MAIL_PHONE.getText();
        signin_pass = SIGNIN_PASS.getText();

        if (new SignIn_DB().verify()) {

            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    HomePage h = new HomePage();
                    h.EMAIL_SHOW = mail_phone;
                    h.setVisible(true);
                }
            });

            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Invalid User Or Password", "username password not found", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_SIGNINActionPerformed

    private void forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotActionPerformed
        try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new ForgottenPass().setVisible(true);
                }
            });

            this.dispose();
    }//GEN-LAST:event_forgotActionPerformed

    private void signINtoUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signINtoUPActionPerformed
        // TODO add your handling code here:
        new SignUp().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_signINtoUPActionPerformed

    private void signINtoUPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signINtoUPMouseEntered
        // TODO add your handling code here:
        signINtoUP.setFont(new Font("Segoe UI", Font.BOLD, 12));

    }//GEN-LAST:event_signINtoUPMouseEntered

    private void signINtoUPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signINtoUPMouseExited
        // TODO add your handling code here:
        signINtoUP.setFont(new Font("Segoe UI", Font.ITALIC, 12));
    }//GEN-LAST:event_signINtoUPMouseExited

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
        // TODO add your handling code here:
        forgot.setFont(new Font("Segoe UI", Font.BOLD, 12));

    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseExited
        // TODO add your handling code here:
        forgot.setFont(new Font("Segoe UI", Font.ITALIC, 12));

    }//GEN-LAST:event_forgotMouseExited

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MAIL_PHONE;
    private javax.swing.JButton SIGNIN;
    private javax.swing.JPasswordField SIGNIN_PASS;
    private javax.swing.JPanel SIGNINpanel;
    private javax.swing.JButton forgot;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton signINtoUP;
    // End of variables declaration//GEN-END:variables
}
