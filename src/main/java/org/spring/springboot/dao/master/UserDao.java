package org.spring.springboot.dao.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;
import org.springframework.stereotype.Repository;

/**
 * 用户 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
@Mapper
@Repository
public interface UserDao {

    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    User findById(@Param("id") String id);
}
