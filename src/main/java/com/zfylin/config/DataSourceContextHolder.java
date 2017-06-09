package com.zfylin.config;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态数据源上下文
 *
 * @author zfylin
 * @version 2017/6/6
 */
public class DataSourceContextHolder {
    /**
     * 当使用ThreadLocal维护变量时，ThreadLocal为每个使用该变量的线程提供独立的变量副本，
     * 所以每一个线程都可以独立地改变自己的副本，而不会影响其它线程所对应的副本。
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 管理所有的数据源id;
     * 主要是为了判断数据源是否存在;
     */
    static List<String> dataSourceIds = new ArrayList<>();

    static String getDatabaseType() {
        return contextHolder.get();
    }

    /**
     * 使用setDataSourceType设置当前的
     *
     * @param dataSourceType 数据源类型
     */
    static void setDatabaseType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    /**
     * 判断指定DataSource当前是否存在
     *
     * @param dataSourceId 数据源Id
     */
    static boolean containsDataSource(String dataSourceId) {
        return dataSourceIds.contains(dataSourceId);
    }

    static void clearDataSourceType() {
        contextHolder.remove();
    }
}