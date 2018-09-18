package com.weiju.service;

import com.github.pagehelper.PageInfo;
import com.weiju.model.User;
import com.weiju.model.UserRole;

/**
 * Created by yangqj on 2017/4/21.
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
