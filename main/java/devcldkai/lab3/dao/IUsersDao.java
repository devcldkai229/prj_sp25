package devcldkai.lab3.dao;

import devcldkai.lab3.model.Users;

public interface IUsersDao {

    Users getByUsername(String username);

    void save(Users users);

}
