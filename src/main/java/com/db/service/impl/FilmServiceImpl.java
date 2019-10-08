package com.db.service.impl;

import com.db.entity.Film;
import com.db.mapper.IFilmMapper;
import com.db.service.IFilmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 */
@Service
public class FilmServiceImpl implements IFilmService {
    @Resource
    private IFilmMapper filmMapper;

    //获取总条数
    @Override
    public Integer getTotalCount() {
        Integer rSet = filmMapper.getTotalCount();
        return rSet;
    }

    //获取电影展示页面
    @Override
    public List<Film> getList(int offset, int pageSize) {
        List<Film> list = filmMapper.getList(offset, pageSize);
        return list;
    }

    //通过id获取电影详细信息
    @Override
    public Film getFilmById(Integer fId) {
        Film film = filmMapper.getFilmById(fId);
        return film;
    }

    @Override
    public List<Film> getAll() {
        List<Film> list = filmMapper.getAll();
        return list;
    }

    @Override
    public List<Film> getFilm(String fContext) {
        List<Film> list = filmMapper.getFilm(fContext);
        return list;
    }


}
