package com.db.controller;

import com.db.entity.Film;
import com.db.entity.Page;
import com.db.mapper.IFilmMapper;
import com.db.service.IFilmService;
import com.db.service.IManagerService;
import com.db.service.IPageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 *
 * 影片功能模块
 */
@Slf4j
@RestController
@RequestMapping("/FilmController")
public class FilmController {
    @Resource
    private IFilmService filmService;
    @Resource
    private IPageService pageService;

    //获取总条数
    @RequestMapping(value = "/getTotalCount",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Integer getTotalCount(){
        Integer rSet = filmService.getTotalCount();
//        log.info("总条数："+rSet);
        log.debug("总条数："+rSet);
        return rSet;
    }

    //获取展示页面数据
    @RequestMapping(value = "/getList",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Page getList(String currentPage){
        Page page = pageService.getPage("1");
        log.debug("展示页面信息："+page);
        log.debug("page.list:"+page.getList());
        return page;
    }

    //通过id获取电影详细信息
    @RequestMapping(value = "/getFilmById",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Film getFilmById(Integer fId){
        Film film = filmService.getFilmById(fId);
        System.out.println("影片："+film);
        return film;
    }

    //获取所有影片
    @RequestMapping(value = "/getAll",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Film> getAll(){
        List<Film> list = filmService.getAll();
        return list;
    }

    //搜索影片
    @RequestMapping(value = "/getFilm",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Film> getFilm(String fContext){
        String text = "%"+fContext+"%";
        List<Film> list = filmService.getFilm(text);
        System.out.println(list);
        return list;
    }
}
