package com.db.service;

import com.db.entity.Diss;

import java.util.Date;
import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 */
public interface IDissService {
    //获取评论
    List<Diss> getDissById(Integer fId);
    //发表评论
    Integer addDiss(Integer uId, Integer fId, Integer dContext);
}
