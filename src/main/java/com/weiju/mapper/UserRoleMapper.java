package com.weiju.mapper;

import com.weiju.model.UserRole;
import com.weiju.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}