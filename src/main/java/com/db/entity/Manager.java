package com.db.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since JDK1.8
 *
 *
 * 管理员
 */
@Component
@Data
public class Manager {
    private Integer mId;
    private String mName;
    private String mPassword;
    private Integer isDelete;

    public Manager() {
    }

    public Manager(Integer mId, String mName, String mPassword, Integer isDelete) {
        this.mId = mId;
        this.mName = mName;
        this.mPassword = mPassword;
        this.isDelete = isDelete;
    }
}
