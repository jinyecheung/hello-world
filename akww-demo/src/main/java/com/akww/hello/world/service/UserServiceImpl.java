package com.akww.hello.world.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.akww.hello.world.mapper.UserMapper;
import com.akww.hello.world.pojo.User;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{
}
