package org.spring.springboot.service.impl;

import org.spring.springboot.dao.cluster.RoleDao;
import org.spring.springboot.dao.master.UserDao;
import org.spring.springboot.domain.Role;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private RoleDao roleDao; // 从数据源


    @Override
    public User findById(String id) {
        User user=userDao.findById(id);
        Role role=roleDao.findById("1");
        user.setRole(role);
        return user;
    }
}
