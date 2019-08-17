package com.ksxan.wuqy.ibatisdemo.common.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ksxan.wuqy.ibatisdemo.common.model.dao.SysMenuDao;
import com.ksxan.wuqy.ibatisdemo.common.model.entity.SysMenuEntity;
import com.ksxan.wuqy.ibatisdemo.common.model.service.ISysMenuService;
import org.springframework.stereotype.Service;

/**
 * @Author wuqy
 * @Date 2019/8/10 21:59
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements ISysMenuService {
    @Override
    public SysMenuEntity get(long menuId) {
        return baseMapper.get(menuId);
    }
}
