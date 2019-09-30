package com.db.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author dong
 * @since JDK1.8
 *
 *
 * 评论
 */
@Component
@Data
public class Diss {
    private Integer dId;
    private Integer uId;
    private Integer fId;
    private String dContext;
    private Date dDate;

    public Diss() {
    }

    public Diss(Integer dId, Integer uId, Integer fId, String dContext, Date dDate) {
        this.dId = dId;
        this.uId = uId;
        this.fId = fId;
        this.dContext = dContext;
        this.dDate = dDate;
    }
}
