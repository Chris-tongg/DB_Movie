package com.db.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author dong
 * @since JDK1.8
 *
 *
 * 收藏夹
 */
@Component
@Data
public class Collect {
    private Integer cId;
    private Integer uId;
    private Integer fId;
    private Date cDate;
    private Integer isDelete;

    public Collect() {
    }

    public Collect(Integer cId, Integer uId, Integer fId, Date cDate, Integer isDelete) {
        this.cId = cId;
        this.uId = uId;
        this.fId = fId;
        this.cDate = cDate;
        this.isDelete = isDelete;
    }
}