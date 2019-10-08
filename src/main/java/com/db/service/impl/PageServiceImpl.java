package com.db.service.impl;


import com.db.entity.Page;
import com.db.mapper.IFilmMapper;
import com.db.service.IPageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PageServiceImpl implements IPageService {
    @Resource
    private IFilmMapper filmMapper;
    @Override
    public Page getPage(String currentPage) {
        Page page = new Page();
        //1.设置当前页数
        page.setCurrentPage(Integer.parseInt(currentPage));
        //2.设置每页行数
        page.setPageSize(12);
        //3.设置总行数
        page.setTotalCount(filmMapper.getTotalCount());
        //4.总页数--分装到Page实体类的构造方法和set方法中
        //5.获取每页展示的数据
        page.setList(filmMapper.getList((Integer.parseInt(currentPage)-1)*page.getPageSize(),page.getPageSize()));
        //6.设置请求地址
        page.setUrl("FilmController/getList");
        return page;
    }
}
