package com.db.service.impl;

import com.db.entity.Diss;
import com.db.mapper.IDissMapper;
import com.db.service.IDissService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author dong
 * @since JDK1.8
 */
@Service
public class DissServiceImpl implements IDissService {
    @Resource
    private IDissMapper dissMapper;
    //获取评论
    @Override
    public List<Diss> getDissById(Integer fId) {
        List<Diss> list = dissMapper.getDissById(fId);
        return list;
    }

    //发表评论
    @Override
    public Integer addDiss(Integer uId, Integer fId, Integer dContext) {
        Integer rSet = dissMapper.addDiss(uId, fId, dContext);
        return rSet;
    }
}
