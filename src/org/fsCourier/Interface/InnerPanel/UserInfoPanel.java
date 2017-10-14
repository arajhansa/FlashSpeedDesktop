package org.fsCourier.Interface.InnerPanel;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import org.fsCourier.Domian.User;
import org.fsCourier.Interface.Login;
import org.fsCourier.Interface.NavigationFrame;
import org.fsCourier.Services.UserService;

public class UserInfoPanel extends javax.swing.JPanel {

    private final NavigationFrame navigationFrame;
    
    public UserInfoPanel(NavigationFrame navigationFrame) {
        initComponents();
        this.navigationFrame = navigationFrame;
        overlayPanel.setBackground(new Color(0,0,0,0));
        User user = UserService.userInstance().getUser();
        usernameLabel.setText(user.getFirstName() + ",");
        Image img = user.getImage().getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        imageLabel.setIcon(icon);
        overlayPanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        overlayPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 55, 85));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Welcome");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        usernameLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(153, 204, 255));
        usernameLabel.setText("User,");
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("<html>Manager Your user account<br /> from here:</html>");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Change Password");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Update Account Details");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Account Transactions");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Logout");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        overlayPanel.setBackground(new java.awt.Color(35, 55, 85));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cover.PNG"))); // NOI18N

        javax.swing.GroupLayout overlayPanelLayout = new javax.swing.GroupLayout(overlayPanel);
        overlayPanel.setLayout(overlayPanelLayout);
        overlayPanelLayout.setHorizontalGroup(
            overlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overlayPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        overlayPanelLayout.setVerticalGroup(
            overlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(overlayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 120));

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.JPG"))); // NOI18N

        jDesktopPane2.setLayer(imageLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        UserService.logout();
        Login login = new Login();
        login.setVisible(true);
        navigationFrame.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel overlayPanel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}