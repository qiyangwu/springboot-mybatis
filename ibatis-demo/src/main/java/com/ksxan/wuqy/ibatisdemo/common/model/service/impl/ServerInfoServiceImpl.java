package com.ksxan.wuqy.ibatisdemo.common.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ksxan.wuqy.ibatisdemo.common.model.dao.ServerInfoDao;
import com.ksxan.wuqy.ibatisdemo.common.model.entity.ServerInfoEntity;
import com.ksxan.wuqy.ibatisdemo.common.model.service.IServerInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wuqy
 * @Date 2019/8/10 21:59
 */
@Service
public class ServerInfoServiceImpl extends ServiceImpl<ServerInfoDao, ServerInfoEntity> implements IServerInfoService {
    @Override
    public List<ServerInfoEntity> get(Integer status) {
        return baseMapper.get(status);
    }
}
