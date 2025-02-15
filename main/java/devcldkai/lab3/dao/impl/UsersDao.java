package devcldkai.lab3.dao.impl;

import devcldkai.lab3.dao.IUsersDao;
import devcldkai.lab3.mapper.UserMapper;
import devcldkai.lab3.model.Users;
import devcldkai.lab3.queries.UserQueries;
import devcldkai.lab3.utils.DatabaseUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDao implements IUsersDao {

    public static IUsersDao getInstance(){
        return new UsersDao();
    }

    @Override
    public Users getByUsername(String username) {
        try {
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(UserQueries.selectByUsername);
            preparedStatement.setString(1, username);

            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()){
                    return UserMapper.mapToUsers(resultSet);
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Users users) {
        try {
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(UserQueries.insert);
            preparedStatement.setString(1, users.getUserID());
            preparedStatement.setString(2, users.getFullName());
            preparedStatement.setString(3, users.getPassword());
            preparedStatement.setString(4, users.getRole());

            preparedStatement.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
