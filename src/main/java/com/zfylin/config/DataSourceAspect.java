package com.zfylin.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class DataSourceAspect {
    @Value("${datasource.default}")
    private static String defaultDataSource;

    @Before(value = "@annotation(targetDataSource)")
    public void setDataSourceKey(JoinPoint point, TargetDataSource targetDataSource) {
        // 获取当前的指定的数据源;
        String dsId = targetDataSource.value();
        if (!DataSourceContextHolder.containsDataSource(dsId)) {
            log.warn("数据源[ " + targetDataSource.value() + " ]不存在，使用默认数据源 > " + point.getSignature());
            DataSourceContextHolder.setDatabaseType(defaultDataSource);
        } else {
            log.debug("UseDataSource : " + targetDataSource.value() + " > " + point.getSignature());
            DataSourceContextHolder.setDatabaseType(dsId);
        }

    }

    @After(value = "@annotation(targetDataSource)")
    public void restoreDataSource(JoinPoint point, TargetDataSource targetDataSource) {
        log.debug("RevertDataSource : " + targetDataSource.value() + " > " + point.getSignature());
        // 方法执行完毕之后，销毁当前数据源信息，进行垃圾回收。
        DataSourceContextHolder.clearDataSourceType();
    }
}