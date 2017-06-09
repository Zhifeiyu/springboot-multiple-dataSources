package com.zfylin.config;

import java.lang.annotation.*;

/**
 * 用于指定使用哪个数据源,方法上使用
 *
 * @author zfylin
 * @version 2017/6/6
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String value();
}
