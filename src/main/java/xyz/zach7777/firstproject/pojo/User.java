package xyz.zach7777.firstproject.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class User implements Serializable {
    @Id
    private String usercode;

    private String username;

    private String password;
}
