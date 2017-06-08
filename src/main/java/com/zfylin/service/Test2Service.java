package com.zfylin.service;

import com.zfylin.config.TargetDataSource;
import com.zfylin.model.UserDetail;

import java.util.List;

/**
 * @author <a href="mailto:huanhuan.zhan@ptthink.com">詹欢欢</a>
 * @since 2016/7/5 - 22:21
 */
public interface Test2Service {

    List<UserDetail> selectUserDetail();
}
