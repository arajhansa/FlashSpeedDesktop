package org.fsCourier.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fsCourier.Config.ConnectionConfig;
import org.fsCourier.Config.Session;
import org.fsCourier.Domian.Item;
import org.fsCourier.Domian.Shipment;

public class ShipmentService {

    private final Connection con;

    public ShipmentService() {
        con = ConnectionConfig.getInstance().getConnection();
    }

    public int createShipment(Item item, Shipment shipment) {

        try {
            PreparedStatement smt = con.prepareStatement("INSERT INTO `item` "
                    + "VALUES(?,?,?,?,?,?)");
            PreparedStatement smt2 = con.prepareStatement("INSERT INTO `shipment` "
                    + "(item_id, status, type, coverage, amount)"
                    + "VALUES(?,?,?,?,?)");

            ResultSet rs = con.createStatement().executeQuery("Select item_id from item");
            rs.last();

            smt.setInt(1, rs.getInt(1) + 1);
            smt.setString(2, item.getName());
            smt.setDouble(3, item.getWeight());
            smt.setString(4, item.getToCity());
            smt.setString(5, item.getFromCity());
            smt.setInt(6, Session.getSessionInstance().getActiveUserID());

            smt.executeUpdate();

            smt2.setInt(1, rs.getInt(1) + 1);
            smt2.setInt(2, 0);
            smt2.setInt(3, shipment.getType());
            smt2.setInt(4, shipment.getCoverage());
            smt2.setFloat(5, shipment.getAmount());

            smt2.executeUpdate();

            rs = con.createStatement().executeQuery("Select shipment_id from shipment");
            rs.last();

            return rs.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(ShipmentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ResultSet getShipmentList() {
        try {
            ResultSet rs = con.createStatement().executeQuery("Select shipment_id, "
                    + "(select user_details.first_name from user_details, item where user_details.user_id = item.user_id and item.item_id = shipment.item_id) as Username,"
                    + "(select status_phrase from status where shipment.status = status.status_code) as status_phrase"
                    + " from shipment");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ShipmentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int updateStatus(int statusCode, int shipmentID) {
        try {
            String sql = "UPDATE shipment SET status = "
                    + statusCode + " WHERE shipment_id = " + shipmentID;
            return con.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ShipmentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public void cancelationRequest(int shipmentID){
        try {
            String sql = "UPDATE shipment SET status = "
                    + 10 + " WHERE shipment_id = " + shipmentID;
            con.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ShipmentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
