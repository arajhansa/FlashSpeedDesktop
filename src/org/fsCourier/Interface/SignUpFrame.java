package org.fsCourier.Interface;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.fsCourier.Domian.User;
import org.fsCourier.Services.UserService;

public class SignUpFrame extends javax.swing.JFrame {

    File image = new File("src/Images/user.jpg");
    
    public SignUpFrame() {
        initComponents();
        overlayPanel.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        overlayPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        imageLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        firstnameSeparator = new javax.swing.JSeparator();
        lastnameSeparator = new javax.swing.JSeparator();
        citySeparator = new javax.swing.JSeparator();
        phoneSeparator = new javax.swing.JSeparator();
        emailSeparator = new javax.swing.JSeparator();
        usernameSeparator = new javax.swing.JSeparator();
        passwordSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 113, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CoverLight.PNG"))); // NOI18N

        javax.swing.GroupLayout overlayPanelLayout = new javax.swing.GroupLayout(overlayPanel);
        overlayPanel.setLayout(overlayPanelLayout);
        overlayPanelLayout.setHorizontalGroup(
            overlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        overlayPanelLayout.setVerticalGroup(
            overlayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(overlayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 120, 120));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.JPG"))); // NOI18N

        jDesktopPane1.setLayer(imageLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imageLabel)
                .addGap(0, 0, 0))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imageLabel))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Choose Image");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 100, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Easy & Quick SignUp");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Choose Image Below");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<html>\nAccount will be ready as soon as <br>\nCorrect Details are Provided. <br>\n</html>");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 210, 90));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/icons8-Back To-32.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 460));

        jPanel2.setBackground(new java.awt.Color(35, 35, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 113, 177));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/icons8-Close Window-20.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 113, 177));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/icons8-Minimize Window-20.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fill the Following Details");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 113, 177));
        jLabel5.setText("First Name");
        jLabel5.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 113, 177));
        jLabel7.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("City");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 113, 177));
        jLabel9.setText("Phone Number");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 113, 177));
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(57, 113, 177));
        jLabel11.setText("Select Type");

        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Username");

        jLabel12.setForeground(new java.awt.Color(57, 113, 177));
        jLabel12.setText("Password");

        firstName.setBackground(new java.awt.Color(35, 35, 35));
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setBorder(null);
        firstName.setCaretColor(new java.awt.Color(255, 255, 255));

        lastName.setBackground(new java.awt.Color(35, 35, 35));
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setBorder(null);
        lastName.setCaretColor(new java.awt.Color(255, 255, 255));

        city.setBackground(new java.awt.Color(35, 35, 35));
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setBorder(null);
        city.setCaretColor(new java.awt.Color(255, 255, 255));

        phone.setBackground(new java.awt.Color(35, 35, 35));
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setBorder(null);
        phone.setCaretColor(new java.awt.Color(255, 255, 255));

        email.setBackground(new java.awt.Color(35, 35, 35));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(255, 255, 255));

        jRadioButton1.setBackground(new java.awt.Color(35, 35, 35));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("User");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton2.setBackground(new java.awt.Color(35, 35, 35));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Consigner");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        username.setBackground(new java.awt.Color(35, 35, 35));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(255, 255, 255));

        password.setBackground(new java.awt.Color(35, 35, 35));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.setEchoChar('\u25cf');

        jButton1.setBackground(new java.awt.Color(57, 113, 177));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel12))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usernameSeparator)
                                            .addComponent(citySeparator)
                                            .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(firstnameSeparator)
                                            .addComponent(lastnameSeparator)
                                            .addComponent(phoneSeparator)
                                            .addComponent(passwordSeparator)
                                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(25, 25, 25)
                                    .addComponent(jRadioButton2))
                                .addComponent(emailSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(firstnameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lastnameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(citySeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(phoneSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(emailSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(usernameSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 390, 460));

        setSize(new java.awt.Dimension(670, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int stat;
        
        UserService userService = UserService.userInstance();
        if (!isEmpty()) {
            int userType;
            User user = new User();
            if (jRadioButton1.isSelected()) {
                userType = 1;
            } else {
                userType = 2;
            }
            
            try{
                user.setFirstName(firstName.getText());
                user.setLastName(lastName.getText());
                user.setCity(city.getText());
                user.setEmail(email.getText());
                user.setPhone(Integer.parseInt(phone.getText()));
                user.setImage(new FileInputStream(image), image);
                user.setUserType(userType);
                stat = userService.createUser(user, username.getText(), password.getPassword());
                System.out.println(stat);
                if(stat==1){
                    Login login = new Login();
                    login.setVisible(true);
                    this.dispose();
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SignUpFrame.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        FileNameExtensionFilter filter;
        filter = new FileNameExtensionFilter("jpeg, gif and png files", "jpg", "gif", "png");
        jFileChooser1.addChoosableFileFilter(filter);
        int i = jFileChooser1.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            image = jFileChooser1.getSelectedFile();
            try {
                BufferedImage originalImage = ImageIO.read(image.getAbsoluteFile());
                int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

                BufferedImage resizeImageJpg = resizeImage(originalImage, type);
                ImageIcon photo = new ImageIcon(toImage(resizeImageJpg));

                imageLabel.setIcon(photo);
                overlayPanel.repaint();
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField city;
    private javax.swing.JSeparator citySeparator;
    private javax.swing.JTextField email;
    private javax.swing.JSeparator emailSeparator;
    private javax.swing.JTextField firstName;
    private javax.swing.JSeparator firstnameSeparator;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField lastName;
    private javax.swing.JSeparator lastnameSeparator;
    private javax.swing.JPanel overlayPanel;
    private javax.swing.JPasswordField password;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JTextField phone;
    private javax.swing.JSeparator phoneSeparator;
    private javax.swing.JTextField username;
    private javax.swing.JSeparator usernameSeparator;
    // End of variables declaration//GEN-END:variables

    private static BufferedImage resizeImage(BufferedImage originalImage, int type) {
        BufferedImage resizedImage = new BufferedImage(100, 100, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, 100, 100, null);
        g.dispose();
        return resizedImage;
    }

    private Image toImage(BufferedImage bufferedImage) {
        return Toolkit.getDefaultToolkit().createImage(bufferedImage.getSource());
    }

    private boolean isEmpty() {
        boolean flag = false;
        if (username.getText().equals("")) {
            usernameSeparator.setBackground(new Color(230, 60, 60));
            usernameSeparator.setForeground(new Color(230, 60, 60));
            flag = true;
        } else {
            usernameSeparator.setBackground(new Color(255, 255, 255));
            usernameSeparator.setForeground(new Color(255, 255, 255));
        }
        if (password.getPassword().length == 0) {
            passwordSeparator.setBackground(new Color(230, 60, 60));
            passwordSeparator.setForeground(new Color(230, 60, 60));
            flag = true;
        } else {
            passwordSeparator.setBackground(new Color(255, 255, 255));
            passwordSeparator.setForeground(new Color(255, 255, 255));
        }
        if (firstName.getText().equals("")) {
            firstnameSeparator.setBackground(new Color(230, 60, 60));
            firstnameSeparator.setForeground(new Color(230, 60, 60));
            flag = true;
        } else {
            firstnameSeparator.setBackground(new Color(255, 255, 255));
            firstnameSeparator.setForeground(new Color(255, 255, 255));
        }
        if (lastName.getText().equals("")) {
            lastnameSeparator.setBackground(new Color(230, 60, 60));
            lastnameSeparator.setForeground(new Color(230, 60, 60));
            flag = true;
        } else {
            lastnameSeparator.setBackground(new Color(255, 255, 255));
            lastnameSeparator.setForeground(new Color(255, 255, 255));
        }
        if (city.getText().equals("")) {
            citySeparator.setBackground(new Color(230, 60, 60));
            citySeparator.setForeground(new Color(230, 60, 60));
            flag = true;
        } else {
            citySeparator.setBackground(new Color(255, 255, 255));
            citySeparator.setForeground(new Color(255, 255, 255));
        }
        if (phone.getText().equals("")) {
            phoneSeparator.setBackground(new Color(230, 60, 60));
            phoneSeparator.setForeground(new Color(230, 60, 60));
            flag = true;
        } else {
            phoneSeparator.setBackground(new Color(255, 255, 255));
            phoneSeparator.setForeground(new Color(255, 255, 255));
        }
        if (email.getText().equals("")) {
            emailSeparator.setBackground(new Color(230, 60, 60));
            emailSeparator.setForeground(new Color(230, 60, 60));
            flag = true;
        } else {
            emailSeparator.setBackground(new Color(255, 255, 255));
            emailSeparator.setForeground(new Color(255, 255, 255));
        }
        return flag;
    }
}
