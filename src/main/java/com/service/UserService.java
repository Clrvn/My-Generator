package com.service;

import com.model.User;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 用户Service
 * 
 * @author Clrvn
 * @date 2020-05-01 17:18:25
 */
public interface UserService {

	/**
	 * 查询用户页面
	 * @return 分页用户数据
	 */
	PageInfo<User> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询用户列表
	 */
	List<User> list(Map<String, Object> map);

	/**
	 * 通过id查询单个用户
	 */
    User findById(Integer id);

	/**
	 * 通过map查询单个用户
	 */
	User findByMap(Map<String, Object> map);

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
