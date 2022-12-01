package xyz.zach7777.firstproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.zach7777.firstproject.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface userMapper {
    List<User> get(User user);
}
