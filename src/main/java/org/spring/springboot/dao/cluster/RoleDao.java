package org.spring.springboot.dao.cluster;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Role;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface RoleDao {


    Role findById(@Param("id") String id);
}
