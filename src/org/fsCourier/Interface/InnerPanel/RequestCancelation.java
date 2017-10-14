package org.fsCourier.Interface.InnerPanel;

import javax.swing.JOptionPane;
import org.fsCourier.Interface.NavigationFrame;
import org.fsCourier.Services.ShipmentService;

public class RequestCancelation extends javax.swing.JPanel {

    private final NavigationFrame navigationFrame;
    
    int consignmentType;
    int deliveryType;
    int deliveryCoverage;
    
    public RequestCancelation(NavigationFrame navigationFrame) {
        initComponents();
        this.navigationFrame = navigationFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shipmentIDText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(57, 113, 177));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel Delivery");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, 40));

        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Shipment ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 100, 40));

        shipmentIDText.setBackground(new java.awt.Color(255, 255, 255));
        shipmentIDText.setForeground(new java.awt.Color(102, 102, 102));
        shipmentIDText.setText("jTextField1");
        shipmentIDText.setBorder(null);
        add(shipmentIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 200, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 200, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if( JOptionPane.showConfirmDialog(this, "Sure about to Cancel thid Delivery?")==0 ){
            ShipmentService shipmentService = new ShipmentService();
            shipmentService.cancelationRequest(Integer.parseInt(shipmentIDText.getText()));
            navigationFrame.home();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField shipmentIDText;
    // End of variables declaration//GEN-END:variables
}
