package com.ksxan.wuqy.ibatisdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ksxan.wuqy.ibatisdemo.common.model.entity.ServerInfoEntity;
import com.ksxan.wuqy.ibatisdemo.common.model.entity.SysMenuEntity;
import com.ksxan.wuqy.ibatisdemo.common.model.service.IServerInfoService;
import com.ksxan.wuqy.ibatisdemo.common.model.service.ISysMenuService;
import com.ksxan.wuqy.ibatisdemo.common.response.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author wuqy
 * @Date 2019/8/10 22:26
 */
@RestController(value = "/")
public class IbatisController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private IServerInfoService serverInfoService;
    @Resource
    private ISysMenuService sysMenuService;

    @GetMapping("test")
    public ResponseData test() {
        SysMenuEntity sysMenuEntity = sysMenuService.get(1);
        logger.info("sysmenu:{}", sysMenuEntity);
        ServerInfoEntity serverInfoEntity = serverInfoService.getById("abcd123");
        logger.info("serverInfoEntity:{}", serverInfoEntity);
        serverInfoEntity.setPassword("12121211212");
        // 默认更新策略是不更新Null的属性字段，如果需要更新字段为Null 在字段上添加strategy = FieldStrategy.IGNORED
//        serverInfoEntity.setUsepersonPK(null);
//        serverInfoService.updateById(serverInfoEntity);
        UpdateWrapper<ServerInfoEntity> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("usepersonPK", null);
        serverInfoService.update(serverInfoEntity, updateWrapper);
        serverInfoService.update(serverInfoEntity, new UpdateWrapper<ServerInfoEntity>().set("usepersonPK", "124124142141pk"));
        logger.info("update:{}", serverInfoEntity);
        List<ServerInfoEntity> serverInfoEntities = serverInfoService.get(0);
        logger.info("serverinfos:{}", serverInfoEntities);
        return ResponseData.build();
    }

}

