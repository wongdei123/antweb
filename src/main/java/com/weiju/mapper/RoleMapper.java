package com.weiju.mapper;

import com.weiju.model.Role;
import com.weiju.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}