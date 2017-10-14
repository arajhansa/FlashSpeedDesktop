package org.fsCourier.Interface.InnerPanel;

import org.fsCourier.Interface.NavigationFrame;

public class AddAcknowledgement extends javax.swing.JPanel {

    private final NavigationFrame navigationFrame;

    public AddAcknowledgement(NavigationFrame navigationFrame) {
        initComponents();
        this.navigationFrame = navigationFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        shipmentIDLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Tracking ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 40));

        shipmentIDLabel.setText("jLabel2");
        add(shipmentIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Amount:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        amountLabel.setText("jLabel3");
        add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 170, 30));

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        navigationFrame.addPanel(new CustomerPanel(navigationFrame));
    }//GEN-LAST:event_jButton1ActionPerformed

    public void updateValues(int itemID, float amount){
        shipmentIDLabel.setText(String.valueOf(itemID));
        amountLabel.setText(String.valueOf(amount));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel shipmentIDLabel;
    // End of variables declaration//GEN-END:variables
}
