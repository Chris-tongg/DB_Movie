package com.db.service;

import com.db.entity.Film;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 */
public interface IFilmService {
    //查找数据库总条数 -- 3
    Integer getTotalCount();

    //获取展示页面数据 -- 2
    List<Film> getList(int offset, int pageSize);

    //通过id获取电影详细信息
    Film getFilmById(Integer fId);

    //获取所有影片
    List<Film> getAll();

    //搜索影片
    List<Film> getFilm(String fContext);
}
