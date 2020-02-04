package com.wang.movie.service;

import com.wang.movie.mapper.UserMapper;
import com.wang.movie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王一宁
 * @date 2020/2/2 10:54
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findUser(String username,String password) {
        return userMapper.findUser(username,password);
    }

    public void register(User user) {
        userMapper.register(user);
    }
}
