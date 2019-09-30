package com.db.controller;

import com.db.entity.Film;
import com.db.service.IManagerService;
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
 * 管理员功能模块
 *  1.获取所有影片 getList
 *  2.具体影片管理 getFilmById
 *  3.
 */
@RestController
@RequestMapping("/ManagerController")
@Slf4j
public class ManagerController {

}
