package com.db.service;

import java.util.Date;

/**
 * @author dong
 * @since JDK1.8
 */
public interface IUserService {
    //收藏
    Integer addCollect(Integer fId, Integer uId);
}
