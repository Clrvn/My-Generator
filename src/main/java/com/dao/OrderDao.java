package com.dao;

import com.model.Order;

import java.util.List;
import java.util.Map;


/**
 * 服务订单DAO
 * @author Clrvn
 */
public interface OrderDao {

    /**
     * 通过id查询单个服务订单
     */
    Order findById(Integer id);

    /**
     * 通过map查询单个服务订单
     */
    Order findByMap(Map<String, Object> map);

    /**
     * 查询服务订单列表
     */
    List<Order> list(Map<String, Object> map);

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
