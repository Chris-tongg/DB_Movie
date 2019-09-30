package com.db.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since JDK1.8
 *
 * 影片照片
 */
@Component
@Data
public class images {
    private Integer iId;
    private Integer fId;
    private Integer iImg;
    private Integer isDelete;
}
