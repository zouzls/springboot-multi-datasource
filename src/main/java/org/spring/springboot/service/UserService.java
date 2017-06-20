package org.spring.springboot.service;

import org.spring.springboot.domain.User;

/**
 * 用户业务接口层
 *
 * Created by bysocket on 07/02/2017.
 */
public interface UserService {


    User findById(String id);
}
