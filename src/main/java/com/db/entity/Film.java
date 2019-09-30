package com.db.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since JDK1.8
 *
 *
 * 影片
 */

@Component
@Data
public class Film {
    private Integer fId;
    private String fImg;
    private String fIntro;
    private String fType;
    private Integer isDelete;

    public Film() {
    }

    public Film(Integer fId, String fImg, String fIntro, String fType, Integer isDelete) {
        this.fId = fId;
        this.fImg = fImg;
        this.fIntro = fIntro;
        this.fType = fType;
        this.isDelete = isDelete;
    }
}
