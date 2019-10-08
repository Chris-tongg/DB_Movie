package com.db.mapper;

import com.db.entity.Diss;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 */
public interface IDissMapper {
    //获取评论
    List<Diss> getDissById(@Param("fId2") Integer fId);
    //发表评论
    Integer addDiss(@Param("uId1") Integer uId, @Param("fId1") Integer fId, @Param("dContext1") Integer dContext);
}
