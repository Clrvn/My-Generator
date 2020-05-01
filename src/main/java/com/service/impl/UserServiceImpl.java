package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.User;
import com.service.UserService;
import com.dao.UserDao;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 用户ServiceImpl
 * @author Clrvn
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询用户页面
     * @return 分页用户数据
     */
    @Override
    public PageInfo<User> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(userDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询用户列表
     */
    @Override
    public List<User> list(Map<String, Object> map) {
        return userDao.list(map);
    }


    /**
     * 通过id查询单个用户
     */
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    /**
     * 通过map查询单个用户
     */
    @Override
    public User findByMap(Map<String, Object> map) {
        return userDao.findByMap(map);
    }

    /**
     * 新增用户
     */
    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    /**
     * 修改用户
     */
    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    /**
     * 删除用户
     */
    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }

}
