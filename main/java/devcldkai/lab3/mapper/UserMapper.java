package devcldkai.lab3.mapper;

import devcldkai.lab3.model.Users;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {

    private UserMapper(){}

    public static Users mapToUsers(ResultSet rs) throws SQLException {
        Users users = new Users();
        users.setUserID(rs.getString("userID"));
        users.setFullName(rs.getString("fullname"));
        users.setPassword(rs.getString("password"));
        users.setRole(rs.getString("role"));
        return users;
    }
}
