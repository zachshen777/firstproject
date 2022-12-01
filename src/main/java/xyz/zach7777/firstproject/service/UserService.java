package xyz.zach7777.firstproject.service;

import xyz.zach7777.firstproject.pojo.User;

import java.util.List;

public interface UserService {
    List<User> get(User user);

    void add(User user);

    void delete(User user);

    void put(User user);
}
