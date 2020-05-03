package com.dao;

import com.model.Clean;

import java.util.List;
import java.util.Map;


/**
 * 清洁服务DAO
 * @author Clrvn
 */
public interface CleanDao {

    /**
     * 通过id查询单个清洁服务
     */
    Clean findById(Integer id);

    /**
     * 通过map查询单个清洁服务
     */
    Clean findByMap(Map<String, Object> map);

    /**
     * 查询清洁服务列表
     */
    List<Clean> list(Map<String, Object> map);

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
