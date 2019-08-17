package com.ksxan.wuqy.ibatisdemo.common.model.dao;


import com.ksxan.wuqy.ibatisdemo.common.model.entity.SysMenuEntity;
import com.ksxan.wuqy.ibatisdemo.common.utils.BaseDao;
import org.apache.ibatis.annotations.Select;

/**
 * 菜单管理
 *
 * @author Joey
 * @Email 2434387555@qq.com
 */
public interface SysMenuDao extends BaseDao<SysMenuEntity> {
    @Select("SELECT * FROM sys_menu where menu_id = #{menuId}")
    SysMenuEntity get(long menuId);
}
