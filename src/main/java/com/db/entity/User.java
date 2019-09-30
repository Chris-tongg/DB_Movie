package com.db.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since JDK1.8
 *
 *
 * 用户
 */
@Component
@Data
public class User {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uPhone;
    private String uHobby;
    private String uEmail;
    private String uIntro;
    private Integer isDelete;

    public User() {
    }

    public User(Integer uId, String uName, String uPassword, String uPhone, String uHobby, String uEmail, String uIntro, Integer isDelete) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uPhone = uPhone;
        this.uHobby = uHobby;
        this.uEmail = uEmail;
        this.uIntro = uIntro;
        this.isDelete = isDelete;
    }
}
