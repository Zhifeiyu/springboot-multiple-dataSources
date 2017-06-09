package com.zfylin.mapper;

import com.zfylin.model.UserDetail;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDetailMapper {
    @Select("SELECT * FROM user_detail")
    List<UserDetail> getAll();

}