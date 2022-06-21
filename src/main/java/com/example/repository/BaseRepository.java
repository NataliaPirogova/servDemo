package com.example.repository;

import java.util.List;

public interface BaseRepository<T> {
    List<T> findAll();

    T findByID(long id);

    T insert();

    boolean creat(T t);

    boolean update(T t);

    boolean deleteByID(long ID);
}
