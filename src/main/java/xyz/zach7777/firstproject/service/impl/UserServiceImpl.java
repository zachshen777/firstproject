package xyz.zach7777.firstproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zach7777.firstproject.mapper.UserMapper;
import xyz.zach7777.firstproject.pojo.User;
import xyz.zach7777.firstproject.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> get(User user) {
        return userMapper.get(user);
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }

    @Override
    public void put(User user) {
        userMapper.put(user);
    }
}
