package xyz.zach7777.firstproject;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("xyz.zach7777.firstproject.dao")
class FirstprojectApplicationTests {

    @Test
    void contextLoads() {
    }

}
