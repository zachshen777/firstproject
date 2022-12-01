package xyz.zach7777.firstproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zach7777.firstproject.pojo.User;
import xyz.zach7777.firstproject.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private xyz.zach7777.firstproject.mapper.userMapper userMapper;
    @Override
    public List<User> get(User user) {
        return userMapper.get(user);
    }
}
