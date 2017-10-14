package org.fsCourier.Domian;

import java.io.File;
import java.io.InputStream;
import javax.swing.ImageIcon;

public class User {
    
    private int userID;
    private String firstName;
    private String lastName;
    private String city;
    private int phone;
    private String email;
    private int userType;
    private InputStream imageInputStream;
    private File imageFile;
    private ImageIcon image;

    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public InputStream getImageInputStream() {
        return imageInputStream;
    }
    
    public File getImageFile() {
        return imageFile;
    }

    public void setImage(InputStream imageInputStream, File file) {
        this.imageInputStream = imageInputStream;
        this.imageFile = file;
    }

    public ImageIcon getImage() {
        return image;
    }
    
    public void setImageIcon(byte[] streamData) {
        this.image = new ImageIcon(streamData);
    }

}
