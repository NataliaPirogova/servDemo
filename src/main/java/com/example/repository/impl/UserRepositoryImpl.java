package com.example.repository.impl;

import com.example.connection.JDBCConnector;
import com.example.model.User;
import com.example.repository.UserRepository;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private static final String CREATE_USER = "INSERT INTO users (fullname, age, login, password) VALUES (?,?,?,?)";
    private static final String FIND_ALL_USERS = "SELECT * FROM users";
    private static final String FIND_USER_BY_LOGIN_AND_PASSWORD = "SELECT * FROM users WHERE login=? AND password=?";
    private JDBCConnector connector;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByID(long id) {
        return null;
    }

    @Override
    public User insert() {
        return null;
    }

    @Override
    public boolean creat(User user) {
        try (Connection connection1 = connector.getConnection();
             PreparedStatement statement = connection1.prepareStatement(CREATE_USER);) {
            statement.setString(1, user.getFullname());
            statement.setLong(2, user.getAge());
            statement.setString(3, user.getLogin());
            statement.setString(4, user.getPassword());
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean deleteByID(long ID) {
        return false;
    }

    @Override
    public User findByLoginPassword(String login, String password) {
        User user = new User();
        ;
        try (Connection connection1 = connector.getConnection();
             PreparedStatement statement = connection1.prepareStatement(FIND_USER_BY_LOGIN_AND_PASSWORD);) {
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                user.setId(result.getLong(1));
                user.setFullname(result.getString(2));
                user.setAge(result.getInt(3));
                user.setLogin(login);
                user.setPassword(password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
