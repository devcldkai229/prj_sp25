package devcldkai.lab3.model;

import java.util.UUID;

public class Users {

    private String userID;

    private String fullName;

    private String password;

    private String role;

    public Users(){
        this.userID = UUID.randomUUID().toString(); // tạo ra một chuỗi nẫu nhiên không trùng rán cho UserID
        this.role = "USER";
    }

    public Users(String fullName, String password){
        this.userID = UUID.randomUUID().toString(); // tạo ra một chuỗi nẫu nhiên không trùng rán cho UserID
        this.fullName = fullName;
        this.password = password;
        this.role = "USER";
    }

    public String getUserID() {
        return userID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
