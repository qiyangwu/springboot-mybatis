package com.ksxan.wuqy.ibatisdemo.common.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ksxan.wuqy.ibatisdemo.common.model.entity.SysMenuEntity;

/**
 * @Author wuqy
 * @Date 2019/8/11 14:38
 */
public interface ISysMenuService extends IService<SysMenuEntity> {
    SysMenuEntity get(long menuId);
}
