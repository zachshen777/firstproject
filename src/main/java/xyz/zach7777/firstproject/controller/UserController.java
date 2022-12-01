package xyz.zach7777.firstproject.controller;

import com.alibaba.druid.support.json.JSONUtils;
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
        return JSONUtils.toJSONString(list);
    }


}
