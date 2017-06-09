package com.zfylin.service.impl;

import com.zfylin.mapper.UserInfoMapper;
import com.zfylin.model.UserInfo;
import com.zfylin.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test1ServiceImpl implements Test1Service {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> selectUserInfo() {
        return userInfoMapper.getAll();
    }
}