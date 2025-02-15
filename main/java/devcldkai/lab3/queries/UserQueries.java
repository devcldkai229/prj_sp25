package devcldkai.lab3.queries;

public class UserQueries {

    private UserQueries(){}

    public static final String selectByUsername = "select * from Users where fullname =?";

    public static final String insert = "insert Users(UserId, fullname, password, Role) values(?,?,?,?)";


}
