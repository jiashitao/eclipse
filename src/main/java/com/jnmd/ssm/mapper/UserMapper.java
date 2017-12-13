package com.jnmd.ssm.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jnmd.ssm.domain.User;

@Repository
public interface UserMapper {
    public List<User> listUser();
    public User getUserById(int uid);
    public int saveUser(User user);
    
}
