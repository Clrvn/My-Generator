package com.dao;

import com.model.User;

import java.util.List;
import java.util.Map;


/**
 * 用户DAO
 * @author Clrvn
 */
public interface UserDao {

    /**
     * 通过id查询单个用户
     */
    User findById(Integer id);

    /**
     * 通过map查询单个用户
     */
    User findByMap(Map<String, Object> map);

    /**
     * 查询用户列表
     */
    List<User> list(Map<String, Object> map);

    /**
     * 新增用户
     */
    int save(User user);

    /**
     * 修改用户
     */
    int update(User user);

    /**
     * 删除用户
     */
    int deleteById(Integer id);

}
