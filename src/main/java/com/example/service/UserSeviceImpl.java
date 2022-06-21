package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;

import java.util.List;

public class UserSeviceImpl implements UserService{
    private final UserRepository userRepository;

    public UserSeviceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
}
