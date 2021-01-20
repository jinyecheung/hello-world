package com.akww.hello.world.controller.system;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akww.hello.world.pojo.system.User;
import com.akww.hello.world.service.system.IUserService;

import java.util.UUID;

@Api("用户表")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "创建",notes = "根据User对象创建")
    @ApiImplicitParam(name = "user",value = "user",required = true,dataType = "User")
    @PostMapping("saveUser")
    public String saveUser(@RequestBody User user){
        if(StringUtils.isBlank(user.getUserId())){
            user.setUserId(UUID.randomUUID().toString().replace("-",""));
        }
        return userService.save(user) ? "OK" : "error";
    }

    @ApiOperation(value = "查询列表",notes = "查询列表")
    @PostMapping("userList")
    public Object userList(){
        return userService.list();
    }
}
