package com.ksxan.wuqy.ibatisdemo.common.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @Author wuqy
 * @Date 2019/8/10 19:12
 */
@Data
@TableName(value = "s_server_user_info")
//@Alias("serverInfoEntity")
public class ServerInfoEntity implements Serializable {
    @TableId(value = "spk", type = IdType.UUID)
    private String spk;
    @TableField(value = "account")
    private String account;// '登陆用户名'
    @TableField(value = "password")
    private String password;// '登陆密码'
    @TableField(value = "usepersonPK")
    private String usepersonPK;// '使用人PK'
    @TableField
    private String ip;// '服务器的ip地址'
    @TableField(value = "status")
    private Integer status;//状态
}
