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
        System.out.println(page.getList());
        return page;
    }
}
