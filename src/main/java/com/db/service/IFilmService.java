package com.db.service;

import com.db.entity.Film;

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

}
