package com.dao;

import com.model.Category;

import java.util.List;
import java.util.Map;


/**
 * 服务分类DAO
 * @author Clrvn
 */
public interface CategoryDao {

    /**
     * 通过id查询单个服务分类
     */
    Category findById(Integer id);

    /**
     * 通过map查询单个服务分类
     */
    Category findByMap(Map<String, Object> map);

    /**
     * 查询服务分类列表
     */
    List<Category> list(Map<String, Object> map);

    /**
     * 新增服务分类
     */
    int save(Category category);

    /**
     * 修改服务分类
     */
    int update(Category category);

    /**
     * 删除服务分类
     */
    int deleteById(Integer id);

}
