package Frames;

import Database.SignUp_DB;
import java.awt.Font;

import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public static String firstName;
    public static String lastName;
    public static String mail_phone;
    public static String signup_pass;

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SIGNUP_PANEL = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        F_NAME = new javax.swing.JTextField();
        L_NAME = new javax.swing.JTextField();
        USER = new javax.swing.JTextField();
        PASSWORD_1 = new javax.swing.JPasswordField();
        PASSWORD_2 = new javax.swing.JPasswordField();
        SIGNUP_BTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        SIGNUP_PANEL.setBackground(new java.awt.Color(196, 165, 134));
        SIGNUP_PANEL.setPreferredSize(new java.awt.Dimension(800, 500));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LawyerBook.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 45, 44));
        jLabel1.setText("CREATE  NEW  ACCOUNT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 45, 44));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 45, 44));
        jLabel3.setText("Email / Phone");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 45, 44));
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 45, 44));
        jLabel5.setText("Re-enter Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(55, 45, 44));
        jLabel6.setText("Password");

        F_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_NAMEActionPerformed(evt);
            }
        });

        SIGNUP_BTN.setBackground(new java.awt.Color(55, 45, 44));
        SIGNUP_BTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SIGNUP_BTN.setForeground(new java.awt.Color(196, 165, 134));
        SIGNUP_BTN.setText("Sign Up");
        SIGNUP_BTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNUP_BTN.setFocusable(false);
        SIGNUP_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNUP_BTNActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(55, 45, 44));
        jLabel7.setText("Already have an account ?");

        jButton2.setBackground(new java.awt.Color(196, 165, 134));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(55, 45, 44));
        jButton2.setText("Sign In");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SIGNUP_PANELLayout = new javax.swing.GroupLayout(SIGNUP_PANEL);
        SIGNUP_PANEL.setLayout(SIGNUP_PANELLayout);
        SIGNUP_PANELLayout.setHorizontalGroup(
            SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SIGNUP_PANELLayout.createSequentialGroup()
                .addGroup(SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SIGNUP_PANELLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(SIGNUP_PANELLayout.createSequentialGroup()
                                .addGroup(SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(F_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(L_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(USER)
                            .addComponent(PASSWORD_1)
                            .addComponent(PASSWORD_2)))
                    .addGroup(SIGNUP_PANELLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(SIGNUP_PANELLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(SIGNUP_PANELLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(SIGNUP_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(img))
        );
        SIGNUP_PANELLayout.setVerticalGroup(
            SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIGNUP_PANELLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PASSWORD_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PASSWORD_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(SIGNUP_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SIGNUP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SIGNUP_PANELLayout.createSequentialGroup()
                .addComponent(img)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(SIGNUP_PANEL, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void F_NAMEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_F_NAMEActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_F_NAMEActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new SignIn().setVisible(true);
        this.dispose();

    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setFont(new Font("Segoe UI", Font.BOLD, 14));

    }// GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setFont(new Font("Segoe UI", Font.ITALIC, 12));

    }// GEN-LAST:event_jButton2MouseExited

    private void SIGNUP_BTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SIGNUP_BTNActionPerformed
        // TODO add your handling code here:

        if (F_NAME.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill up First Name");
            return;
        } else {
            firstName = F_NAME.getText();
        }

        if (L_NAME.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill up Last Name");
            return;
        } else {
            lastName = L_NAME.getText();
        }

        if (USER.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill up email");
            return;
        } else {
            mail_phone = USER.getText();
        }

        String pass1, pass2;

        if (PASSWORD_1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill up password");
            return;
        } else {
            pass1 = PASSWORD_1.getText();
        }

        if (PASSWORD_2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please re enter password");
            return;
        } else {
            pass2 = PASSWORD_2.getText();
        }

        if (pass1.equals(pass2)) {
            signup_pass = pass1;
        } else {
            JOptionPane.showMessageDialog(this, "Please fill up correct password");
            return;
        }

        new SignUp_DB().createAccount();

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
                new HomePage().setVisible(true);
            }
        });

        this.dispose();

    }// GEN-LAST:event_SIGNUP_BTNActionPerformed

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
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField F_NAME;
    private javax.swing.JTextField L_NAME;
    private javax.swing.JPasswordField PASSWORD_1;
    private javax.swing.JPasswordField PASSWORD_2;
    private javax.swing.JButton SIGNUP_BTN;
    private javax.swing.JPanel SIGNUP_PANEL;
    private javax.swing.JTextField USER;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
