package com.db.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * @author dong
 * @since JDK1.8
 */
public interface IUserMapper {
    //收藏
    Integer addCollect(@Param("fId1") Integer fId,@Param("uId1") Integer uId);
}
