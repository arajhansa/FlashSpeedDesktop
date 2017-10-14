package org.fsCourier.Interface.InnerPanel;

import java.awt.Color;
import org.fsCourier.Interface.NavigationFrame;

public class AddConsignment extends javax.swing.JPanel {

    private final NavigationFrame navigationFrame;
    
    float consignmentType;
    float price;
    int deliveryType;
    int deliveryCoverage;
    
    public AddConsignment(NavigationFrame navigationFrame) {
        initComponents();
        this.navigationFrame = navigationFrame;
        this.weightTextField.setEditable(false);
        this.setEstimatedCost();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        consignmentList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        deliveryList = new javax.swing.JComboBox<>();
        placeConsignmentButton = new javax.swing.JButton();
        estimateLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deliveryCoverageList = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Consignment Type");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 30));

        consignmentList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consignmentList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Envolope", "Box less than 5kg" }));
        consignmentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consignmentListActionPerformed(evt);
            }
        });
        add(consignmentList, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Delivery Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, 30));

        deliveryList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deliveryList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Express", "Over Night" }));
        deliveryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryListActionPerformed(evt);
            }
        });
        add(deliveryList, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 150, 30));

        placeConsignmentButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        placeConsignmentButton.setText("Place Consignment");
        placeConsignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeConsignmentButtonActionPerformed(evt);
            }
        });
        add(placeConsignmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 160, 30));

        estimateLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        add(estimateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 113, 177));
        jLabel3.setText("Delivery Coverage");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 30));

        deliveryCoverageList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deliveryCoverageList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local (within State)", "Domestic", "Inernational" }));
        deliveryCoverageList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryCoverageListActionPerformed(evt);
            }
        });
        add(deliveryCoverageList, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 160, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("Payble Amount:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        weightLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        weightLabel.setForeground(new java.awt.Color(153, 153, 153));
        weightLabel.setText("Weight ");
        add(weightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, 30));

        weightTextField.setText("1");
        weightTextField.setToolTipText("");
        weightTextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                weightTextFieldCaretUpdate(evt);
            }
        });
        add(weightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void placeConsignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeConsignmentButtonActionPerformed
        PlaceConsignment placeConsignment = new PlaceConsignment(navigationFrame);
        placeConsignment.updateValues(Float.parseFloat(weightTextField.getText()), deliveryType, deliveryCoverage, price);
        navigationFrame.addPanel(placeConsignment);
    }//GEN-LAST:event_placeConsignmentButtonActionPerformed

    private void consignmentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consignmentListActionPerformed
        System.out.println(consignmentList.getSelectedIndex());
        if(consignmentList.getSelectedIndex()>0){
            weightLabel.setForeground(new Color(57,113,177));
            weightTextField.setEditable(true);
            this.repaint();
        } else {
            weightLabel.setForeground(new Color(153,153,153));
            weightTextField.setEditable(false);
            consignmentType = 1;
        }
        this.setEstimatedCost();
    }//GEN-LAST:event_consignmentListActionPerformed

    private void deliveryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryListActionPerformed
        this.setEstimatedCost();
    }//GEN-LAST:event_deliveryListActionPerformed

    private void deliveryCoverageListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryCoverageListActionPerformed
        this.setEstimatedCost();
    }//GEN-LAST:event_deliveryCoverageListActionPerformed

    private void weightTextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_weightTextFieldCaretUpdate
        if(!weightTextField.getText().isEmpty()){
           consignmentType = Float.parseFloat(weightTextField.getText());
           this.setEstimatedCost();
        }
    }//GEN-LAST:event_weightTextFieldCaretUpdate

    private void setEstimatedCost(){
        deliveryType = deliveryList.getSelectedIndex() + 1;
        deliveryCoverage = deliveryCoverageList.getSelectedIndex() + 1;
        
        price = (float) ((((Math.pow(consignmentType, 2) * 5) 
                * (deliveryType * 5) 
                * ((Math.pow(deliveryCoverage, 2)) * 10)) 
                / 40) * 10);
        
        estimateLabel.setText(String.valueOf(Math.round(price*100.00)/100.00));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> consignmentList;
    private javax.swing.JComboBox<String> deliveryCoverageList;
    private javax.swing.JComboBox<String> deliveryList;
    private javax.swing.JLabel estimateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton placeConsignmentButton;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
