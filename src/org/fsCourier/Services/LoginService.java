package org.fsCourier.Services;

import java.sql.*;
import org.fsCourier.Config.ConnectionConfig;
import org.fsCourier.Config.Session;

public class LoginService {
    
    private static LoginService loginInstance = null;
    private final Connection con;
    
    private LoginService(){
        con = ConnectionConfig.getInstance().getConnection();
    }
    
    public static LoginService getLoginInstance(){
        if(loginInstance == null){
            loginInstance  = new LoginService();
        }
        return loginInstance;
    }
    
    public boolean login(String username, String password){
        try {
            PreparedStatement stmt = con.prepareStatement("select password,user_id from login where username = ?");
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            if(rs.isLast() && rs.getString(1).equals(password) ) {
                Session session = Session.getSessionInstance();
                session.setActiveUserID(rs.getInt(2));
                session.activateSession();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
}
