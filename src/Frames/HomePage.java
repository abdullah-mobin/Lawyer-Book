/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Database.Bookings;
import Database.CreateDataBase;
import Database.ProfileUpdate;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    public String EMAIL_SHOW;

    
    
    public static String mail_edit;
    public static String phone_edit;
    public static String gender_edit;
    public static int nid_edit;
    public static String country_edit;
    public static String about_edit;
    public static String UNI;
    public static String BAR;
    public static String YR;
    public static String GPA;
    public static String CAT;

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LEFT_PANEL_BUTTONS = new javax.swing.ButtonGroup();
        DASHBOARD_PANEL = new javax.swing.JPanel();
        LEFT_PANEL = new javax.swing.JPanel();
        PROFILE = new javax.swing.JButton();
        MY_APPOINMENTS = new javax.swing.JButton();
        MY_ORDER = new javax.swing.JButton();
        BOOK_NOW = new javax.swing.JButton();
        SIGN_OUT = new javax.swing.JButton();
        LOGO_IMG = new javax.swing.JLabel();
        NAME_LOGO = new javax.swing.JLabel();
        TOP_BAR = new javax.swing.JPanel();
        SEARCH_BAR = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        dashboard_group = new javax.swing.JTabbedPane();
        BOOK_PANEL = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        BOOK = new javax.swing.JTextArea();
        ORDERS_PANEL = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orders = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        APPOINMENT_PANEL = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        add1 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        addBTN = new javax.swing.JLabel();
        PROFILE_PANEL = new javax.swing.JPanel();
        img_picker = new javax.swing.JPanel();
        add_img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edited_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edited_phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edited_gender = new javax.swing.JComboBox<>();
        edited_country = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edited_about = new javax.swing.JTextArea();
        lawyer_profile_edit = new javax.swing.JButton();
        save_profile = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        edited_nid = new javax.swing.JTextField();
        LAWYER_PROFILE = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        LAWYER_SUBMIT = new javax.swing.JButton();
        backToGeneralProfile = new javax.swing.JButton();
        uni = new javax.swing.JTextField();
        bar = new javax.swing.JTextField();
        yr = new javax.swing.JTextField();
        gpa = new javax.swing.JTextField();
        cat = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        add_bar_Id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        DASHBOARD_PANEL.setBackground(new java.awt.Color(196, 165, 134));
        DASHBOARD_PANEL.setPreferredSize(new java.awt.Dimension(800, 500));
        DASHBOARD_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LEFT_PANEL.setBackground(new java.awt.Color(55, 45, 44));
        LEFT_PANEL.setPreferredSize(new java.awt.Dimension(200, 500));

        PROFILE.setBackground(new java.awt.Color(55, 45, 44));
        PROFILE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PROFILE.setForeground(new java.awt.Color(196, 165, 134));
        PROFILE.setText("My Profile");
        PROFILE.setBorderPainted(false);
        LEFT_PANEL_BUTTONS.add(PROFILE);
        PROFILE.setContentAreaFilled(false);
        PROFILE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PROFILE.setPreferredSize(new java.awt.Dimension(122, 23));
        PROFILE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROFILEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PROFILEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PROFILEMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROFILEMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PROFILEMouseReleased(evt);
            }
        });
        PROFILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROFILEActionPerformed(evt);
            }
        });

        MY_APPOINMENTS.setBackground(new java.awt.Color(55, 45, 44));
        MY_APPOINMENTS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MY_APPOINMENTS.setForeground(new java.awt.Color(196, 165, 134));
        MY_APPOINMENTS.setText("My Appoinments");
        MY_APPOINMENTS.setBorderPainted(false);
        LEFT_PANEL_BUTTONS.add(MY_APPOINMENTS);
        MY_APPOINMENTS.setContentAreaFilled(false);
        MY_APPOINMENTS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MY_APPOINMENTS.setPreferredSize(new java.awt.Dimension(140, 27));
        MY_APPOINMENTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MY_APPOINMENTSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MY_APPOINMENTSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MY_APPOINMENTSMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MY_APPOINMENTSMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MY_APPOINMENTSMouseReleased(evt);
            }
        });
        MY_APPOINMENTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MY_APPOINMENTSActionPerformed(evt);
            }
        });

        MY_ORDER.setBackground(new java.awt.Color(55, 45, 44));
        MY_ORDER.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MY_ORDER.setForeground(new java.awt.Color(55, 45, 44));
        MY_ORDER.setText("My Orders");
        MY_ORDER.setBorderPainted(false);
        LEFT_PANEL_BUTTONS.add(MY_ORDER);
        MY_ORDER.setContentAreaFilled(false);
        MY_ORDER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MY_ORDER.setPreferredSize(new java.awt.Dimension(122, 23));
        MY_ORDER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MY_ORDERMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MY_ORDERMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MY_ORDERMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MY_ORDERMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MY_ORDERMouseReleased(evt);
            }
        });
        MY_ORDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MY_ORDERActionPerformed(evt);
            }
        });

        BOOK_NOW.setBackground(new java.awt.Color(55, 45, 44));
        BOOK_NOW.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BOOK_NOW.setForeground(new java.awt.Color(196, 165, 134));
        BOOK_NOW.setText("Book Now");
        BOOK_NOW.setBorderPainted(false);
        LEFT_PANEL_BUTTONS.add(BOOK_NOW);
        BOOK_NOW.setContentAreaFilled(false);
        BOOK_NOW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOOK_NOW.setPreferredSize(new java.awt.Dimension(122, 23));
        BOOK_NOW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOOK_NOWMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BOOK_NOWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BOOK_NOWMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BOOK_NOWMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BOOK_NOWMouseReleased(evt);
            }
        });
        BOOK_NOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOK_NOWActionPerformed(evt);
            }
        });

        SIGN_OUT.setBackground(new java.awt.Color(55, 45, 44));
        SIGN_OUT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SIGN_OUT.setForeground(new java.awt.Color(196, 165, 134));
        SIGN_OUT.setText("Sign Out");
        SIGN_OUT.setBorderPainted(false);
        SIGN_OUT.setContentAreaFilled(false);
        SIGN_OUT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGN_OUT.setPreferredSize(new java.awt.Dimension(122, 23));
        SIGN_OUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SIGN_OUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SIGN_OUTMouseExited(evt);
            }
        });
        SIGN_OUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGN_OUTActionPerformed(evt);
            }
        });

        LOGO_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_1rsz_lb.png"))); // NOI18N
        LOGO_IMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGO_IMGMouseClicked(evt);
            }
        });

        NAME_LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_namelb.png"))); // NOI18N
        NAME_LOGO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NAME_LOGOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NAME_LOGOMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout LEFT_PANELLayout = new javax.swing.GroupLayout(LEFT_PANEL);
        LEFT_PANEL.setLayout(LEFT_PANELLayout);
        LEFT_PANELLayout.setHorizontalGroup(
            LEFT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFT_PANELLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(LEFT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(MY_APPOINMENTS, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIGN_OUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PROFILE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MY_ORDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOOK_NOW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGO_IMG)
                    .addComponent(NAME_LOGO))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        LEFT_PANELLayout.setVerticalGroup(
            LEFT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFT_PANELLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(NAME_LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(LOGO_IMG)
                .addGap(18, 18, 18)
                .addComponent(MY_ORDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BOOK_NOW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MY_APPOINMENTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PROFILE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SIGN_OUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        DASHBOARD_PANEL.add(LEFT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TOP_BAR.setBackground(new java.awt.Color(119, 72, 56));

        SEARCH_BAR.setText("search here");
        SEARCH_BAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_BARActionPerformed(evt);
            }
        });

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\oop-project\\lbimg\\ntfc.png")); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/message_icon-icons.com_64615.png"))); // NOI18N

        javax.swing.GroupLayout TOP_BARLayout = new javax.swing.GroupLayout(TOP_BAR);
        TOP_BAR.setLayout(TOP_BARLayout);
        TOP_BARLayout.setHorizontalGroup(
            TOP_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOP_BARLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SEARCH_BAR, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel25)
                .addGap(18, 18, 18))
        );
        TOP_BARLayout.setVerticalGroup(
            TOP_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TOP_BARLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TOP_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TOP_BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SEARCH_BAR)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TOP_BARLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        DASHBOARD_PANEL.add(TOP_BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, -1));

        dashboard_group.setBackground(new java.awt.Color(196, 165, 134));

        BOOK_PANEL.setBackground(new java.awt.Color(196, 165, 134));

        jLabel4.setText("Find Your Desired Lawyer From the list ");

        BOOK.setColumns(20);
        BOOK.setRows(5);
        jScrollPane7.setViewportView(BOOK);

        javax.swing.GroupLayout BOOK_PANELLayout = new javax.swing.GroupLayout(BOOK_PANEL);
        BOOK_PANEL.setLayout(BOOK_PANELLayout);
        BOOK_PANELLayout.setHorizontalGroup(
            BOOK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BOOK_PANELLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(BOOK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        BOOK_PANELLayout.setVerticalGroup(
            BOOK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BOOK_PANELLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dashboard_group.addTab("tab4", BOOK_PANEL);

        ORDERS_PANEL.setBackground(new java.awt.Color(196, 165, 134));

        orders.setBackground(new java.awt.Color(196, 165, 134));
        orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lawyer", "Objective", "Time", "Cost"
            }
        ));
        jScrollPane2.setViewportView(orders);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 45, 44));
        jLabel3.setText("My All Orders ");

        jButton1.setBackground(new java.awt.Color(55, 45, 44));
        jButton1.setForeground(new java.awt.Color(196, 165, 134));
        jButton1.setText("Filter ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(55, 45, 44));
        jButton2.setForeground(new java.awt.Color(196, 165, 134));
        jButton2.setText("Delete Order");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(55, 45, 44));
        jLabel15.setText("Want to remove an order ?");

        javax.swing.GroupLayout ORDERS_PANELLayout = new javax.swing.GroupLayout(ORDERS_PANEL);
        ORDERS_PANEL.setLayout(ORDERS_PANELLayout);
        ORDERS_PANELLayout.setHorizontalGroup(
            ORDERS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ORDERS_PANELLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(ORDERS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ORDERS_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ORDERS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ORDERS_PANELLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)))))
                .addGap(28, 28, 28))
        );
        ORDERS_PANELLayout.setVerticalGroup(
            ORDERS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ORDERS_PANELLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ORDERS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ORDERS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        dashboard_group.addTab("tab2", ORDERS_PANEL);

        APPOINMENT_PANEL.setBackground(new java.awt.Color(196, 165, 134));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(55, 45, 44));
        jLabel16.setText("My Appoinments");

        add1.setColumns(20);
        add1.setRows(5);
        add1.setText("-Empty-");
        jScrollPane3.setViewportView(add1);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(55, 45, 44));
        jLabel17.setText("Want to remove an Appoinment ?");

        jButton3.setBackground(new java.awt.Color(55, 45, 44));
        jButton3.setForeground(new java.awt.Color(196, 165, 134));
        jButton3.setText("Delete Appoinment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel24.setText("For Lawyer only");

        addBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBTN.setText("Publish Add");
        addBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBTNMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addBTNMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addBTNMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout APPOINMENT_PANELLayout = new javax.swing.GroupLayout(APPOINMENT_PANEL);
        APPOINMENT_PANEL.setLayout(APPOINMENT_PANELLayout);
        APPOINMENT_PANELLayout.setHorizontalGroup(
            APPOINMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(APPOINMENT_PANELLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(APPOINMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(APPOINMENT_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(APPOINMENT_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(463, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, APPOINMENT_PANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(APPOINMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, APPOINMENT_PANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(APPOINMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(34, 34, 34))
        );
        APPOINMENT_PANELLayout.setVerticalGroup(
            APPOINMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(APPOINMENT_PANELLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(50, 50, 50)
                .addGroup(APPOINMENT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(addBTN)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        dashboard_group.addTab("tab3", APPOINMENT_PANEL);

        PROFILE_PANEL.setBackground(new java.awt.Color(196, 165, 134));

        img_picker.setBackground(new java.awt.Color(255, 255, 255));
        img_picker.setPreferredSize(new java.awt.Dimension(180, 180));
        img_picker.setLayout(null);

        add_img.setForeground(new java.awt.Color(55, 45, 44));
        add_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\oop-project\\lbimg\\plus.png")); // NOI18N
        add_img.setText("   upload profile picture");
        add_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_imgMouseClicked(evt);
            }
        });
        img_picker.add(add_img);
        add_img.setBounds(0, 0, 160, 160);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 45, 44));
        jLabel2.setText("Profile Setup");

        jLabel6.setForeground(new java.awt.Color(55, 45, 44));
        jLabel6.setText("E-mail");

        edited_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edited_emailActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(55, 45, 44));
        jLabel7.setText("Phone");

        edited_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edited_phoneActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(55, 45, 44));
        jLabel8.setText("Gender");

        jLabel9.setForeground(new java.awt.Color(55, 45, 44));
        jLabel9.setText("Country");

        edited_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Male", "Female" }));
        edited_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edited_genderActionPerformed(evt);
            }
        });

        edited_country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Bangladesh", "Pakistan", "Srilanka", "USA", "UK", "Canada", "Australiya", "Soudia Arabia" }));
        edited_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edited_countryActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(55, 45, 44));
        jLabel10.setText("Write About You");

        edited_about.setColumns(20);
        edited_about.setLineWrap(true);
        edited_about.setRows(5);
        jScrollPane1.setViewportView(edited_about);

        lawyer_profile_edit.setBackground(new java.awt.Color(196, 165, 134));
        lawyer_profile_edit.setForeground(new java.awt.Color(55, 45, 44));
        lawyer_profile_edit.setText("Setup Lawyer Profile");
        lawyer_profile_edit.setBorderPainted(false);
        lawyer_profile_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lawyer_profile_editActionPerformed(evt);
            }
        });

        save_profile.setBackground(new java.awt.Color(55, 45, 44));
        save_profile.setForeground(new java.awt.Color(196, 165, 134));
        save_profile.setText("Save Profile");
        save_profile.setBorderPainted(false);
        save_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_profileActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(55, 45, 44));
        jLabel12.setText("Are You A Lawyer ?");

        jLabel11.setForeground(new java.awt.Color(55, 45, 44));
        jLabel11.setText("NID");

        javax.swing.GroupLayout PROFILE_PANELLayout = new javax.swing.GroupLayout(PROFILE_PANEL);
        PROFILE_PANEL.setLayout(PROFILE_PANELLayout);
        PROFILE_PANELLayout.setHorizontalGroup(
            PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                        .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                                    .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edited_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                    .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                                            .addComponent(lawyer_profile_edit)
                                            .addGap(18, 18, 18)
                                            .addComponent(save_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PROFILE_PANELLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(272, 272, 272))
                                        .addComponent(edited_country, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                                .addComponent(img_picker, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel2))
                                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11)
                                            .addComponent(edited_phone)
                                            .addComponent(jLabel7)
                                            .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(113, 113, 113)
                                                .addComponent(jLabel14))
                                            .addComponent(edited_email)
                                            .addComponent(edited_nid, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))))
                            .addComponent(jLabel8))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        PROFILE_PANELLayout.setVerticalGroup(
            PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(img_picker, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(edited_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edited_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edited_nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edited_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edited_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PROFILE_PANELLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(PROFILE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lawyer_profile_edit)
                            .addComponent(save_profile))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard_group.addTab("tab1", PROFILE_PANEL);

        LAWYER_PROFILE.setBackground(new java.awt.Color(196, 165, 134));
        LAWYER_PROFILE.setForeground(new java.awt.Color(196, 165, 134));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(55, 45, 44));
        jLabel13.setText("BECOME A LAWYER ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(55, 45, 44));
        jLabel18.setText("University Name ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 45, 44));
        jLabel19.setText("Bar Counsil Id ");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(55, 45, 44));
        jLabel20.setText("Graduation Year");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(55, 45, 44));
        jLabel21.setText("Grade");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(55, 45, 44));
        jLabel22.setText("Catagory");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(55, 45, 44));
        jLabel23.setText("Submit bar ID Card");

        LAWYER_SUBMIT.setBackground(new java.awt.Color(55, 45, 44));
        LAWYER_SUBMIT.setForeground(new java.awt.Color(196, 165, 134));
        LAWYER_SUBMIT.setText("Submit");
        LAWYER_SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAWYER_SUBMITActionPerformed(evt);
            }
        });

        backToGeneralProfile.setBackground(new java.awt.Color(55, 45, 44));
        backToGeneralProfile.setForeground(new java.awt.Color(196, 165, 134));
        backToGeneralProfile.setText("Back");
        backToGeneralProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToGeneralProfileActionPerformed(evt);
            }
        });

        gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaActionPerformed(evt);
            }
        });

        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- select -", "Civil ", "Criminal", "Tax", "Land", " " }));

        jPanel1.setLayout(null);

        add_bar_Id.setText("                        + add pdf of bar id card (front & back)");
        add_bar_Id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_bar_IdMouseClicked(evt);
            }
        });
        jPanel1.add(add_bar_Id);
        add_bar_Id.setBounds(0, 0, 350, 20);

        javax.swing.GroupLayout LAWYER_PROFILELayout = new javax.swing.GroupLayout(LAWYER_PROFILE);
        LAWYER_PROFILE.setLayout(LAWYER_PROFILELayout);
        LAWYER_PROFILELayout.setHorizontalGroup(
            LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LAWYER_PROFILELayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LAWYER_PROFILELayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(39, 39, 39)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LAWYER_PROFILELayout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addComponent(backToGeneralProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(LAWYER_SUBMIT, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(uni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yr, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gpa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        LAWYER_PROFILELayout.setVerticalGroup(
            LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LAWYER_PROFILELayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addGap(36, 36, 36)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(yr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(LAWYER_PROFILELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LAWYER_SUBMIT)
                    .addComponent(backToGeneralProfile))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        dashboard_group.addTab("tab5", LAWYER_PROFILE);

        DASHBOARD_PANEL.add(dashboard_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        getContentPane().add(DASHBOARD_PANEL, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PROFILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROFILEActionPerformed
        dashboard_group.setSelectedIndex(3);
        get_profile(EMAIL_SHOW);
    }//GEN-LAST:event_PROFILEActionPerformed

    private void BOOK_NOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOK_NOWActionPerformed
        dashboard_group.setSelectedIndex(0);
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String username = "admin";
            String password = "0000";
            connection = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM lawyer_book.add;";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            StringBuilder resultText = new StringBuilder();
            while (resultSet.next()) {
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    resultText.append(resultSet.getString(i)).append("\n");
                }
                resultText.append("\n");
            }

            BOOK.setText(resultText.toString());
            BOOK.setFont(new Font("Segoe UI", Font.BOLD, 15));

        } catch (ClassNotFoundException | SQLException e) {
        }
        
    }//GEN-LAST:event_BOOK_NOWActionPerformed

    private void BOOK_NOWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOOK_NOWMouseEntered
        BOOK_NOW.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_BOOK_NOWMouseEntered

    private void BOOK_NOWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOOK_NOWMouseExited
        if ("Book  Now".equals(BOOK_NOW.getText())) {
            defaultBTN();
            BOOK_NOW.setText("Book  Now");

            BOOK_NOW.setFont(new Font("Segoe UI", Font.BOLD, 15));
        } else {
            BOOK_NOW.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        }
    }//GEN-LAST:event_BOOK_NOWMouseExited

    private void MY_APPOINMENTSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_APPOINMENTSMouseEntered
        MY_APPOINMENTS.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_MY_APPOINMENTSMouseEntered

    private void MY_APPOINMENTSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_APPOINMENTSMouseExited
        if ("My  Appoinments".equals(MY_APPOINMENTS.getText())) {
            defaultBTN();
            MY_APPOINMENTS.setText("My  Appoinments");

            MY_APPOINMENTS.setFont(new Font("Segoe UI", Font.BOLD, 15));
        } else {
            MY_APPOINMENTS.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        }
    }//GEN-LAST:event_MY_APPOINMENTSMouseExited

    private void PROFILEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEMouseExited
        if ("My  Profile".equals(PROFILE.getText())) {
            defaultBTN();
            PROFILE.setText("My  Profile");
            PROFILE.setFont(new Font("Segoe UI", Font.BOLD, 15));
        } else {
            PROFILE.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        }
    }//GEN-LAST:event_PROFILEMouseExited

    private void PROFILEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEMouseEntered
        PROFILE.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_PROFILEMouseEntered

    private void SIGN_OUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGN_OUTMouseEntered
        SIGN_OUT.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_SIGN_OUTMouseEntered

    private void SIGN_OUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGN_OUTMouseExited
        SIGN_OUT.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    }//GEN-LAST:event_SIGN_OUTMouseExited

    private void NAME_LOGOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAME_LOGOMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_NAME_LOGOMouseEntered

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void BOOK_NOWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOOK_NOWMouseClicked
        BOOK_NOW.setText("Book  Now");
    }//GEN-LAST:event_BOOK_NOWMouseClicked

    private void BOOK_NOWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOOK_NOWMousePressed
        BOOK_NOW.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    }//GEN-LAST:event_BOOK_NOWMousePressed

    private void BOOK_NOWMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOOK_NOWMouseReleased
        BOOK_NOW.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_BOOK_NOWMouseReleased

    private void MY_APPOINMENTSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_APPOINMENTSMousePressed
        MY_APPOINMENTS.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    }//GEN-LAST:event_MY_APPOINMENTSMousePressed

    private void MY_APPOINMENTSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_APPOINMENTSMouseReleased
        MY_APPOINMENTS.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_MY_APPOINMENTSMouseReleased

    private void MY_APPOINMENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_APPOINMENTSMouseClicked
        MY_APPOINMENTS.setText("My  Appoinments");
    }//GEN-LAST:event_MY_APPOINMENTSMouseClicked

    private void PROFILEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEMousePressed
        PROFILE.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    }//GEN-LAST:event_PROFILEMousePressed

    private void PROFILEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEMouseReleased
        PROFILE.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_PROFILEMouseReleased

    private void PROFILEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEMouseClicked
        PROFILE.setText("My  Profile");
    }//GEN-LAST:event_PROFILEMouseClicked

    private void SIGN_OUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGN_OUTActionPerformed
        int signout = JOptionPane.showConfirmDialog(this, "Sure to Sign Out", "SIGN OUT",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (signout == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_SIGN_OUTActionPerformed

    private void NAME_LOGOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAME_LOGOMouseClicked
        defaultBTN();
        dashboard_group.setSelectedIndex(0);
    }//GEN-LAST:event_NAME_LOGOMouseClicked

    private void LOGO_IMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGO_IMGMouseClicked
        defaultBTN();
        dashboard_group.setSelectedIndex(0);
    }//GEN-LAST:event_LOGO_IMGMouseClicked

    private void SEARCH_BARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_BARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCH_BARActionPerformed

    private void MY_APPOINMENTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MY_APPOINMENTSActionPerformed
        dashboard_group.setSelectedIndex(2);
    }//GEN-LAST:event_MY_APPOINMENTSActionPerformed

    private void lawyer_profile_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lawyer_profile_editActionPerformed
        // TODO add your handling code here:

        dashboard_group.setSelectedIndex(4);

    }//GEN-LAST:event_lawyer_profile_editActionPerformed

    private void edited_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edited_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edited_countryActionPerformed

    private void edited_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edited_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edited_genderActionPerformed

    private void edited_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edited_phoneActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_edited_phoneActionPerformed

    private void add_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_imgMouseClicked
        
        JFileChooser select = new JFileChooser();
        select.showOpenDialog(this);
        File f = select.getSelectedFile();
        if (f == null) {
            return;
        }
        add_img.setIcon(new ImageIcon(f.toString()));
        add_img.setText("");
        
    }//GEN-LAST:event_add_imgMouseClicked

    private void save_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_profileActionPerformed
        mail_edit = edited_email.getText();
        phone_edit = edited_phone.getText();
        gender_edit = (String) edited_gender.getSelectedItem();
        country_edit = (String) edited_country.getSelectedItem();
        nid_edit = Integer.parseInt(edited_nid.getText());
        about_edit = edited_about.getText();

        new ProfileUpdate().UpdateUserAccount();


    }//GEN-LAST:event_save_profileActionPerformed

    private void edited_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edited_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edited_emailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backToGeneralProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToGeneralProfileActionPerformed
        // TODO add your handling code here:
                dashboard_group.setSelectedIndex(3);

    }//GEN-LAST:event_backToGeneralProfileActionPerformed

    private void gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaActionPerformed

    private void add_bar_IdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_bar_IdMouseClicked
        // TODO add your handling code here:

        JFileChooser select = new JFileChooser();
        select.showOpenDialog(this);
        File f = select.getSelectedFile();
        if (f == null) {
            return;
        }
        add_bar_Id.setIcon(new ImageIcon(f.toString()));
        add_bar_Id.setText("");


    }//GEN-LAST:event_add_bar_IdMouseClicked

    private void LAWYER_SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAWYER_SUBMITActionPerformed
        // TODO add your handling code here:
        mail_edit = edited_email.getText();
        phone_edit = edited_phone.getText();
        gender_edit = (String) edited_gender.getSelectedItem();
        country_edit = (String) edited_country.getSelectedItem();
        nid_edit = Integer.parseInt(edited_nid.getText());
        about_edit = edited_about.getText();
        UNI = uni.getText();
        BAR = bar.getText();
        YR = yr.getText();
        GPA = gpa.getText();
        CAT = (String) cat.getSelectedItem();

        new ProfileUpdate().AddLawyerAccount();


    }//GEN-LAST:event_LAWYER_SUBMITActionPerformed

    private void addBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseEntered
        addBTN.setFont(new Font("Segoe UI", Font.PLAIN, 14));

    }//GEN-LAST:event_addBTNMouseEntered

    private void addBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseExited
        addBTN.setFont(new Font("Segoe UI", Font.BOLD, 14));


    }//GEN-LAST:event_addBTNMouseExited

    private void addBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMousePressed
        addBTN.setFont(new Font("Segoe UI", Font.BOLD, 14));

    }//GEN-LAST:event_addBTNMousePressed

    private void addBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseReleased
        
        addBTN.setFont(new Font("Segoe UI", Font.PLAIN, 14));

    }//GEN-LAST:event_addBTNMouseReleased

    private void addBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseClicked
        
      
        String msg = JOptionPane.showInputDialog("My service in a text : ","I will do tax paper for you----");
        String tm = JOptionPane.showInputDialog("Set Time : ","00:00am to 00:00pm------");
        String cost = JOptionPane.showInputDialog("Set Cost : ","00.00 BDT-----");
       
        add1.setText(msg+"\n");
        add1.append(tm+"\n");
        add1.append(cost+"\n");
        
        new Bookings().AdvToDb(EMAIL_SHOW,msg,tm,cost,CAT);
                
    }//GEN-LAST:event_addBTNMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MY_ORDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MY_ORDERActionPerformed
        //        dashboard_group.setSelectedIndex(1);
    }//GEN-LAST:event_MY_ORDERActionPerformed

    private void MY_ORDERMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_ORDERMouseReleased
        MY_ORDER.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_MY_ORDERMouseReleased

    private void MY_ORDERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_ORDERMousePressed
        MY_ORDER.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    }//GEN-LAST:event_MY_ORDERMousePressed

    private void MY_ORDERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_ORDERMouseExited
        if ("My  Orders".equals(MY_ORDER.getText())) {
            defaultBTN();
            MY_ORDER.setText("My  Orders");

            MY_ORDER.setFont(new Font("Segoe UI", Font.BOLD, 15));
        } else {
            MY_ORDER.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        }
    }//GEN-LAST:event_MY_ORDERMouseExited

    private void MY_ORDERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_ORDERMouseEntered
        MY_ORDER.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }//GEN-LAST:event_MY_ORDERMouseEntered

    private void MY_ORDERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MY_ORDERMouseClicked
        MY_ORDER.setText("My  Orders");
    }//GEN-LAST:event_MY_ORDERMouseClicked

    private void defaultBTN() {
        MY_ORDER.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        MY_APPOINMENTS.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        BOOK_NOW.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        PROFILE.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        BOOK_NOW.setText("Book Now");
        PROFILE.setText("My Profile");
        MY_ORDER.setText("My Orders");
        MY_APPOINMENTS.setText("My Appoinments");

    }

    private void get_profile(String EMAIL_SHOW) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "admin", "0000");

            PreparedStatement prevInfo = connect.prepareStatement("SELECT email,password,name,phone,gender,country,nid FROM " + "LAWYER_BOOK" + ".userinfo WHERE email = '" + EMAIL_SHOW + "' ;");
            ResultSet oldInfo = prevInfo.executeQuery();

            String oldpass = null;
            String oldname = null;
            String oldmail = null;
            String oldphone = null;
            String oldgender = null;
            String oldcountry = null;
            String oldnid = null;

            if (oldInfo.next()) {
                oldpass = oldInfo.getString("password");
                oldname = oldInfo.getString("name");
                oldmail = oldInfo.getString("email");
                oldphone = oldInfo.getString("phone");
                oldgender = oldInfo.getString("gender");
                oldcountry = oldInfo.getString("country");
                oldnid = oldInfo.getString("nid");
            }

            edited_email.setText(oldmail);
            edited_phone.setText(oldphone);
            edited_nid.setText(oldnid);

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(CreateDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel APPOINMENT_PANEL;
    private javax.swing.JTextArea BOOK;
    private javax.swing.JButton BOOK_NOW;
    private javax.swing.JPanel BOOK_PANEL;
    private javax.swing.JPanel DASHBOARD_PANEL;
    private javax.swing.JPanel LAWYER_PROFILE;
    private javax.swing.JButton LAWYER_SUBMIT;
    private javax.swing.JPanel LEFT_PANEL;
    private javax.swing.ButtonGroup LEFT_PANEL_BUTTONS;
    private javax.swing.JLabel LOGO_IMG;
    private javax.swing.JButton MY_APPOINMENTS;
    private javax.swing.JButton MY_ORDER;
    private javax.swing.JLabel NAME_LOGO;
    private javax.swing.JPanel ORDERS_PANEL;
    private javax.swing.JButton PROFILE;
    private javax.swing.JPanel PROFILE_PANEL;
    private javax.swing.JTextField SEARCH_BAR;
    private javax.swing.JButton SIGN_OUT;
    private javax.swing.JPanel TOP_BAR;
    private javax.swing.JTextArea add1;
    private javax.swing.JLabel addBTN;
    private javax.swing.JLabel add_bar_Id;
    private javax.swing.JLabel add_img;
    private javax.swing.JButton backToGeneralProfile;
    private javax.swing.JTextField bar;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JTabbedPane dashboard_group;
    private javax.swing.JTextArea edited_about;
    private javax.swing.JComboBox<String> edited_country;
    private javax.swing.JTextField edited_email;
    private javax.swing.JComboBox<String> edited_gender;
    private javax.swing.JTextField edited_nid;
    private javax.swing.JTextField edited_phone;
    private javax.swing.JTextField gpa;
    private javax.swing.JPanel img_picker;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton lawyer_profile_edit;
    private javax.swing.JTable orders;
    private javax.swing.JButton save_profile;
    private javax.swing.JButton search;
    private javax.swing.JTextField uni;
    private javax.swing.JTextField yr;
    // End of variables declaration//GEN-END:variables
}
