package com.db.controller;

import com.db.entity.Diss;
import com.db.service.IDissService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 *
 * 评论功能模块
 */
@RestController
@RequestMapping("/DissController")
public class DissController {
    @Resource
    private IDissService dissService;
    //获取评论
    @RequestMapping(value = "/getDissById",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Diss> getDissById(Integer fId){
        List<Diss> list = dissService.getDissById(fId);
        return list;
    }
    //发表评论
    @RequestMapping(value = "addDiss",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Integer addDiss(Integer uId, Integer fId, Integer dContext){
        Integer rSet = dissService.addDiss(uId, fId, dContext);
        return rSet;
    }
}
