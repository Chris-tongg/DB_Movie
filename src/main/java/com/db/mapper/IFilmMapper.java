package com.db.mapper;

import com.db.entity.Film;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 */
public interface IFilmMapper {
    //查找数据库总条数 -- 3
    Integer getTotalCount();

    //获取展示页面数据 -- 2
    List<Film> getList(@Param("offset") int offset,@Param("pageSize") int pageSize);

    //通过id获取电影详细信息
    Film getFilmById(@Param("fId1") Integer fId);

    //获取所有影片
    List<Film> getAll();

    //搜索影片
    List<Film> getFilm(@Param("fContext1") String fContext);
}
