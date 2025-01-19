package devcldkai.lab3.model;

public class Users {

    private String userID;

    private String fullName;

    private String password;

    public Users(){}

    public Users(String userID, String fullName, String password){
        this.userID = userID;
        this.fullName = fullName;
        this.password = password;
    }

    public String getUserID() {
        return userID;
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
