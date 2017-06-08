package com.zfylin.service.impl;

import com.zfylin.config.TargetDataSource;
import com.zfylin.mapper.UserDetailMapper;
import com.zfylin.model.UserDetail;
import com.zfylin.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:huanhuan.zhan@ptthink.com">詹欢欢</a>
 * @since 2016/7/5 - 22:21
 */
@Service
public class Test2ServiceImpl implements Test2Service {

    @Autowired
    private UserDetailMapper userDetailMapper;

    @TargetDataSource("test2")
    public List<UserDetail> selectUserDetail() {
        return userDetailMapper.selectAll();
    }
}
