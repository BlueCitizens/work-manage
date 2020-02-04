package com.bluec.vtpow.mapper;

import com.bluec.vtpow.po.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: BlueCitizens
 * @Date: 2020/2/3 21:42
 */
@Mapper
public interface RoleMapper {
    List<Role> getRolesByUser(String user_id);
}
