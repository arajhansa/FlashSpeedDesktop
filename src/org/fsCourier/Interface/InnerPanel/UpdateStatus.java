package org.fsCourier.Interface.InnerPanel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.fsCourier.Interface.NavigationFrame;
import org.fsCourier.Services.ShipmentService;

public class UpdateStatus extends javax.swing.JPanel {

    private final NavigationFrame navigationFrame;

    public UpdateStatus(NavigationFrame navigationFrame) {
        initComponents();
        this.navigationFrame = navigationFrame;
        updateTable();
        jComboBox1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipment ID", "Username", "Current Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 330));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        jLabel1.setText("New Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Update Status>", "waiting for approval", "ready to dispatch", "in transit", "spinting", "sub station halt", "reached at destination", "out for delivery", "delivered", "package returned ", "Cancelled" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int shipmentID = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        ShipmentService shipmentService = new ShipmentService();
        shipmentService.updateStatus(jComboBox1.getSelectedIndex() - 1, shipmentID);
        updateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(jTable1.getSelectedRow()>0){
            jComboBox1.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateTable() {
        ShipmentService shipmentService = new ShipmentService();
        ResultSet rs = shipmentService.getShipmentList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            while(rs.next()){
                model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateStatus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
