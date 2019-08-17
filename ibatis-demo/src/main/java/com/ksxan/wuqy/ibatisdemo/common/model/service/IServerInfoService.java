package com.ksxan.wuqy.ibatisdemo.common.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ksxan.wuqy.ibatisdemo.common.model.entity.ServerInfoEntity;

import java.util.List;

/**
 * @Author wuqy
 * @Date 2019/8/10 21:25
 */
public interface IServerInfoService extends IService<ServerInfoEntity> {
    List<ServerInfoEntity> get(Integer status);
}
