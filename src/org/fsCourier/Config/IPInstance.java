package org.fsCourier.Config;

public class IPInstance {
    
    private String IP;
    private static IPInstance ipInstance = null;

    private IPInstance() {
        this.IP = "localhost";
    }

    public static IPInstance getInstance(){
        if(ipInstance == null){
            ipInstance = new IPInstance();
        }
        return ipInstance;
    }
    
    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
    
}
