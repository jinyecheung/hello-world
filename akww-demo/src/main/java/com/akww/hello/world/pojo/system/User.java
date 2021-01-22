package com.akww.hello.world.pojo.system;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "User",description = "用户实体对象")
@TableName("t_sys_user")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id")
    @ApiModelProperty("userId")
    private String userId;

    @TableField("user_name")
    @ApiModelProperty("userName")
    private String userName;

    @TableField("pass_word")
    @ApiModelProperty("passWord")
    private String passWord;

    @TableField("phone")
    @ApiModelProperty("phone")
    private String phone;

    @TableField("email")
    @ApiModelProperty("email")
    private String email;
}
