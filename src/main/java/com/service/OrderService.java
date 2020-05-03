package com.service;

import com.model.Order;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 服务订单Service
 * @author Clrvn
 */
public interface OrderService {

	/**
	 * 查询服务订单页面
	 * @return 分页服务订单数据
	 */
	PageInfo<Order> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询服务订单列表
	 */
	List<Order> list(Map<String, Object> map);

	/**
	 * 通过id查询单个服务订单
	 */
    Order findById(Integer id);

	/**
	 * 通过map查询单个服务订单
	 */
	Order findByMap(Map<String, Object> map);

	/**
	 * 新增服务订单
	 */
	int save(Order order);

	/**
	 * 修改服务订单
	 */
	int update(Order order);

	/**
	 * 删除服务订单
	 */
	int deleteById(Integer id);

}
