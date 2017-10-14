package org.fsCourier.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fsCourier.Config.ConnectionConfig;
import org.fsCourier.Domian.Track;

public class TrackingService {

    private static TrackingService instance = null;
    private final Connection con;
    private final Track track;
    
    private TrackingService() {
        con = ConnectionConfig.getInstance().getConnection();
        track = new Track();
    }
    
    public static TrackingService getInstance(){
        if(instance == null){
            instance = new TrackingService();
        }
        return instance;
    }
    
    public boolean checkTrackingID(int shipmentID){
        try {
            PreparedStatement smt = con.prepareStatement("Select * from shipment where shipment_id = ?");
            smt.setInt(1, shipmentID);
            ResultSet rs = smt.executeQuery();
            if(rs.next()){
                this.track.setShipmentID(shipmentID);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipmentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Track trackingResponse(){
        try {
            PreparedStatement smt = con.prepareStatement("Select "
                    + "(select status_phrase from status where shipment.status = status.status_code),"
                    + "shipment.amount,"
                    + "item.to_city,"
                    + "item.from_city,"
                    + "user_details.first_name"
                    + " from shipment, item, user_details where "
                    + "shipment.item_id = item.item_id"
                    + " and user_details.user_id = item.user_id"
                    + " and shipment.shipment_id = ?");
            smt.setInt(1, track.getShipmentID());
            ResultSet rs = smt.executeQuery();
            if(rs.next()){
                track.setStatus(rs.getString(1));
                track.setAmount(rs.getFloat(2));
                track.setToCity(rs.getString(3));
                track.setFromCity(rs.getString(4));
                track.setOwnerName(rs.getString(5));
                return track;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShipmentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
