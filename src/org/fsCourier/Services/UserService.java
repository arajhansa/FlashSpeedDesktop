package org.fsCourier.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.fsCourier.Config.ConnectionConfig;
import org.fsCourier.Config.Session;
import org.fsCourier.Domian.User;

public class UserService {
    
    private static UserService userService = null;
    private final Connection con;
    private Session session;

    public UserService() {
        session = Session.getSessionInstance();
        con = ConnectionConfig.getInstance().getConnection();
    }

    public static UserService userInstance() {
        if(userService == null){
            userService = new UserService();
        }
        return userService;
    }
    
    public User getUser(){
        session = Session.getSessionInstance();
        return session.getActiveUser();
    }
    
    public int createUser(User user, String username, char[] password){
        int stat=0;
        try {
            PreparedStatement stmt, stmt2;
            
            stmt = con.prepareStatement("INSERT INTO user_details"
                    + "(`first_name`,`last_name`,`city`,`phone`,`Email`,`User_type`,`user_image`) "
                    + "VALUES(?,?,?,?,?,?,?)");
            stmt2 = con.prepareStatement("INSERT INTO login(username, password) VALUES(?,?)");
            
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getCity());
            stmt.setInt(4, user.getPhone());
            stmt.setString(5, user.getEmail());
            stmt.setInt(6, user.getUserType());
            stmt.setBinaryStream(7, user.getImageInputStream(), user.getImageFile().length());
    
            stmt2.setString(1, username);
            stmt2.setString(2, String.valueOf(password));
            
            stmt.executeUpdate();
            stmt2.executeUpdate();
            
            return 1;
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return stat;        
    }
    
    public static void logout(){
        Session.getSessionInstance().closeSession();
    }
    
}
