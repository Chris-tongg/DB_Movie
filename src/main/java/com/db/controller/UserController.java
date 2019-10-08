package com.db.controller;

import com.db.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dong
 * @since JDK1.8
 *
 * 用户功能模块
 * 1.用户登录
 * 2.用户注册
 * ...
 */
@RestController
@Slf4j
@RequestMapping("/UserController")
public class UserController {
    @Resource
    private IUserService userService;
    //收藏
    @RequestMapping(value = "/addCollect",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Integer addCollect(Integer fId,Integer uId){
        Integer rSet = userService.addCollect(fId,uId);
        log.debug("收藏："+rSet);
        return rSet;
    }
}
