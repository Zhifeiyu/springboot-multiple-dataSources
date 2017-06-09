package com.zfylin.controller;

import com.zfylin.model.UserDetail;
import com.zfylin.model.UserInfo;
import com.zfylin.service.Test1Service;
import com.zfylin.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestDataSourceController {
    @Autowired
    private Test1Service test1Service;

    @Autowired
    private Test2Service test2Service;

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public List<UserInfo> selectUser() {
        System.out.println("查询第一个数据源");
        return test1Service.selectUserInfo();
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public List<UserDetail> userDetail() {
        System.out.println("查询第二个数据源");
        return test2Service.selectUserDetail();
    }

}