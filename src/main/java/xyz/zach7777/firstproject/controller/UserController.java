package xyz.zach7777.firstproject.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.zach7777.firstproject.pojo.User;
import xyz.zach7777.firstproject.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String get(@RequestBody User user) {
        List<User> list = userService.get(user);
        return JSON.toJSONString(list);
    }
    @PostMapping("/")
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }

    @PutMapping("/")
    public void put(@RequestBody User user) {
        userService.put(user);
    }


}
