package org.fsCourier.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionConfig {
    
    private Connection con;
    
    private static ConnectionConfig ConnectionInstance = null;
    
    private ConnectionConfig() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"
                    + IPInstance.getInstance().getIP() 
                    + "/FlashSpeedCourier", "fsAdmin", "fsData");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static ConnectionConfig getInstance(){
        if(ConnectionInstance == null){
           ConnectionInstance = new ConnectionConfig();
        }
        return ConnectionInstance;
    }
    
    public Connection getConnection() {
        return con;
    }
    
}