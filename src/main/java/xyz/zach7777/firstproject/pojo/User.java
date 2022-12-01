package xyz.zach7777.firstproject.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String usercode;

    private String username;

    private String password;
}
