package com.zfylin.service;

import com.zfylin.config.TargetDataSource;
import com.zfylin.model.UserInfo;

import java.util.List;

/**
 * @author <a href="mailto:huanhuan.zhan@ptthink.com">詹欢欢</a>
 * @since 2016/7/5 - 22:18
 */
public interface Test1Service {

    List<UserInfo> selectUserInfo();
}
