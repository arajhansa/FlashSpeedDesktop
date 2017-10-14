package org.fsCourier.Interface.InnerPanel;

import org.fsCourier.Interface.NavigationFrame;
import org.fsCourier.Services.TrackingService;

public class TrackingRequest extends javax.swing.JPanel {

    private final NavigationFrame navigationFrame;

    public TrackingRequest(NavigationFrame navigationFrame) {
        initComponents();
        this.navigationFrame = navigationFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        track = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shipmentIDInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bkbtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(57, 113, 177));
        setPreferredSize(new java.awt.Dimension(720, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        track.setBackground(new java.awt.Color(57, 113, 177));
        track.setForeground(new java.awt.Color(255, 255, 255));
        track.setText("Track");
        track.setBorder(null);
        track.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackActionPerformed(evt);
            }
        });
        add(track, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 190, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Shipment ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 170, 30));
        add(shipmentIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 350, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel6.setText("Terms Of Use");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel5.setText("About Us");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel4.setText("copyright FSCourier Services");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        bkbtn.setBackground(new java.awt.Color(57, 113, 177));
        bkbtn.setForeground(new java.awt.Color(57, 113, 177));
        bkbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/icons8-Back To-32.png"))); // NOI18N
        bkbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bkbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkbtnMouseClicked(evt);
            }
        });
        add(bkbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void trackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackActionPerformed
        int shipmentID = Integer.parseInt(shipmentIDInput.getText());
        if(TrackingService.getInstance().checkTrackingID(shipmentID)){
            navigationFrame.addPanel(new TrackingResponse(navigationFrame));
        }
    }//GEN-LAST:event_trackActionPerformed

    private void bkbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkbtnMouseClicked
        navigationFrame.addPanel(new CustomerPanel(navigationFrame));
    }//GEN-LAST:event_bkbtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField shipmentIDInput;
    private javax.swing.JButton track;
    // End of variables declaration//GEN-END:variables
}
