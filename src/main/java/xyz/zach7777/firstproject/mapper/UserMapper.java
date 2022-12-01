package xyz.zach7777.firstproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.zach7777.firstproject.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> get(User user);

    void add(User user);

    void delete(User user);

    void put(User user);
}
