package com.db.service.impl;

import com.db.mapper.IUserMapper;
import com.db.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author dong
 * @since JDK1.8
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserMapper userMapper;
    @Override
    public Integer addCollect(Integer fId, Integer uId) {
        Integer rSet = userMapper.addCollect(fId,uId);
        return rSet;
    }
}
