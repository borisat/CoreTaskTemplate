package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final Connection connection;

    public UserServiceImpl() {
        this.connection  = Util.getPostrgresConnection();
    }


    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {

        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl(connection);

        userDaoJDBC.saveUser(name, lastName, age);


    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        UserDao userDao = new UserDaoJDBCImpl(connection);

        return userDao.getAllUsers() ;

    }

    public void cleanUsersTable() {

    }
}
