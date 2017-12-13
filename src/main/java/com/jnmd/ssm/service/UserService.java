package com.jnmd.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.ssm.domain.User;
import com.jnmd.ssm.exception.UserException;
import com.jnmd.ssm.mapper.UserMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserService {
    @Resource
    private UserMapper usermapper;
    
    @Transactional(propagation=Propagation.SUPPORTS)
    public List<User> listUser(){
        return usermapper.listUser();
    }
    @Transactional(propagation=Propagation.SUPPORTS)
    public User getUser(int uid){
        return usermapper.getUserById(uid);
    }
    @Transactional(rollbackFor=UserException.class)
    public int saveUser(User user){
        return usermapper.saveUser(user);
    }
}
