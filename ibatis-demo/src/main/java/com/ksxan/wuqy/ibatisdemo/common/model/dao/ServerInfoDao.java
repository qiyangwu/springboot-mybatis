package com.ksxan.wuqy.ibatisdemo.common.model.dao;

import com.ksxan.wuqy.ibatisdemo.common.model.entity.ServerInfoEntity;
import com.ksxan.wuqy.ibatisdemo.common.utils.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author wuqy
 * @Date 2019/8/10 22:16
 */
@Mapper
public interface ServerInfoDao extends BaseDao<ServerInfoEntity> {

    @Select("SELECT * FROM s_server_user_info where status = #{status}")
    List<ServerInfoEntity> get(int status);

    @Select("SELECT * FROM s_server_user_info where spk = #{spk}")
    ServerInfoEntity get2(String spk);
}
