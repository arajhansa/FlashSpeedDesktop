package org.fsCourier.Interface.InnerPanel;

import org.fsCourier.Domian.Item;
import org.fsCourier.Domian.Shipment;
import org.fsCourier.Interface.NavigationFrame;
import org.fsCourier.Services.ShipmentService;

public class PlaceConsignment extends javax.swing.JPanel {

    private final NavigationFrame navigationFrame;
    private final Shipment shipment;
    private final Item item;
    private int deliveryType;
    private int deliveryCoverage;
    private float weight;
    private float price;

    public PlaceConsignment(NavigationFrame navigationFrame) {
        initComponents();
        this.navigationFrame = navigationFrame;
        shipment = new Shipment();
        item = new Item();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placeConsignmentButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deliveryTypeLabel = new javax.swing.JLabel();
        deliveryCoverageLabel = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        itemWeight = new javax.swing.JTextField();
        itemToCity = new javax.swing.JTextField();
        itemFromCity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(57, 113, 177));
        setPreferredSize(new java.awt.Dimension(720, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeConsignmentButton.setBackground(new java.awt.Color(57, 113, 177));
        placeConsignmentButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        placeConsignmentButton.setForeground(new java.awt.Color(255, 255, 255));
        placeConsignmentButton.setText("Place Consignment");
        placeConsignmentButton.setBorder(null);
        placeConsignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeConsignmentButtonActionPerformed(evt);
            }
        });
        add(placeConsignmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 170, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Title");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 50, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Weight");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 113, 177));
        jLabel3.setText("To City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 113, 177));
        jLabel4.setText("From City");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        deliveryTypeLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        deliveryTypeLabel.setForeground(new java.awt.Color(57, 113, 177));
        deliveryTypeLabel.setText("Delivery Type");
        add(deliveryTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 170, 30));

        deliveryCoverageLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        deliveryCoverageLabel.setForeground(new java.awt.Color(57, 113, 177));
        deliveryCoverageLabel.setText("Delivery Coverage");
        add(deliveryCoverageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 230, 30));
        add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, -1));

        itemWeight.setEditable(false);
        add(itemWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 180, -1));
        add(itemToCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 180, -1));
        add(itemFromCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void placeConsignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeConsignmentButtonActionPerformed
        ShipmentService shipmentService = new ShipmentService();
        item.setName(itemName.getText());
        item.setToCity(itemToCity.getText());
        item.setFromCity(itemFromCity.getText());
        item.setWeight(weight);
        shipment.setAmount(price);
        shipment.setShipmentID(shipmentService.createShipment(item, shipment));
        if(shipment.getShipmentID() > 0 ){
            AddAcknowledgement addAck = new AddAcknowledgement(navigationFrame);
            addAck.updateValues(shipment.getShipmentID(), price);
            navigationFrame.addPanel(addAck);
        }
    }//GEN-LAST:event_placeConsignmentButtonActionPerformed
    
    public PlaceConsignment() {
        this.navigationFrame = null;
        this.shipment = null;
        this.item = null;
    }
    
    public void updateValues(float weight, int deliveryType, int deliveryCoverage, float price){
        this.deliveryType = deliveryType;
        this.deliveryCoverage = deliveryCoverage;
        this.weight = weight;
        this.itemWeight.setText(String.valueOf(weight));
        this.price = (float) (Math.round(price*100.00)/100.00);
        shipment.setCoverage(deliveryCoverage);
        shipment.setType(deliveryType);
        deliveryTypeLabel.setText(toStringType());
        deliveryCoverageLabel.setText(toStringCoverage());
    }
    
    private String toStringCoverage() {
        String result = null;
        switch (deliveryCoverage) {
            case 1:
                result = "Local (within State)";
                break;
            case 2:
                result = "Domestic";
                break;
            case 3:
                result = "International";
                break;
        }
        return result;
    }

    private String toStringType() {
        String result = null;
        switch (deliveryType) {
            case 1:
                result = "Standard";
                break;
            case 2:
                result = "Express";
                break;
            case 3:
                result = "Over Night";
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deliveryCoverageLabel;
    private javax.swing.JLabel deliveryTypeLabel;
    private javax.swing.JTextField itemFromCity;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemToCity;
    private javax.swing.JTextField itemWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton placeConsignmentButton;
    // End of variables declaration//GEN-END:variables
}
