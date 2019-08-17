package com.ksxan.wuqy.ibatisdemo.common.utils;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 因为MyBatisPlus的缘故，不能放在Dao对应的包里 基础Dao(还需在XML文件里，有对应的SQL语句；或者基于注解，基于动态sql)
 *
 * @param <T>
 * @author wuqy
 */
public interface BaseDao<T> extends BaseMapper<T> {
}
