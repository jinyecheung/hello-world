package com.akww.hello.world.service.system;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.akww.hello.world.mapper.system.UserMapper;
import com.akww.hello.world.pojo.system.User;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{
}
