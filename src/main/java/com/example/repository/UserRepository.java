package com.example.repository;

import com.example.model.User;

public interface UserRepository extends BaseRepository<User>{
    User findByLoginPassword(String login, String password);
}
