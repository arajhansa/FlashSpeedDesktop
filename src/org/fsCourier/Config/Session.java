package org.fsCourier.Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.fsCourier.Domian.User;

public class Session {
    
    private int activeUserID;
    private static Session sessionInstance = null;
    private Connection con;
    private User user;
    
    private Session(){
    }    

    public static Session getSessionInstance() {
        if(sessionInstance == null){
            sessionInstance = new Session();
        }
        return sessionInstance;
    }
    
    public void setActiveUserID(int activeUserByID) {
        this.activeUserID = activeUserByID;
    }

    public int getActiveUserID() {
        return activeUserID;
    }
    
    public User getActiveUser(){
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public void activateSession(){
        con = ConnectionConfig.getInstance().getConnection();
        user = new User();
        try {
            PreparedStatement stmt = con.prepareStatement("select * from user_details where user_id = ?");
            stmt.setInt(1, activeUserID);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            user.setUserID(activeUserID);
            user.setFirstName(rs.getString(2));
            user.setLastName(rs.getString(3));
            user.setCity(rs.getString(4));
            user.setPhone(rs.getInt(5));
            user.setEmail(rs.getString(6));
            user.setUserType(rs.getInt(7));
            user.setImageIcon(rs.getBytes(8));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void closeSession(){
        this.activeUserID = 0;
        this.con = null;
        this.user = null;
        sessionInstance = null;
    }
    
}
