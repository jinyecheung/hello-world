package com.akww.hello.world.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "User",description = "用户实体对象")
@TableName("t_user")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @TableId(value = "id")
    @ApiModelProperty("id")
    private String id;

    @TableField("username")
    @ApiModelProperty("username")
    private String username;

    @TableField("password")
    @ApiModelProperty("password")
    private String password;
}
