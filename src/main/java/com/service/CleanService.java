package com.service;

import com.model.Clean;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 清洁服务Service
 * @author Clrvn
 */
public interface CleanService {

	/**
	 * 查询清洁服务页面
	 * @return 分页清洁服务数据
	 */
	PageInfo<Clean> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询清洁服务列表
	 */
	List<Clean> list(Map<String, Object> map);

	/**
	 * 通过id查询单个清洁服务
	 */
    Clean findById(Integer id);

	/**
	 * 通过map查询单个清洁服务
	 */
	Clean findByMap(Map<String, Object> map);

	/**
	 * 新增清洁服务
	 */
	int save(Clean clean);

	/**
	 * 修改清洁服务
	 */
	int update(Clean clean);

	/**
	 * 删除清洁服务
	 */
	int deleteById(Integer id);

}
