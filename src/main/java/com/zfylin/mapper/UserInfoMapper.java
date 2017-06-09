package com.zfylin.mapper;

import com.zfylin.model.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserInfoMapper {
    @Select("SELECT * FROM user_info")
    List<UserInfo> getAll();
}