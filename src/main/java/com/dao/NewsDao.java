package com.dao;

import com.model.News;

import java.util.List;
import java.util.Map;


/**
 * 新闻信息DAO
 * @author Clrvn
 */
public interface NewsDao {

    /**
     * 通过id查询单个新闻信息
     */
    News findById(Integer id);

    /**
     * 通过map查询单个新闻信息
     */
    News findByMap(Map<String, Object> map);

    /**
     * 查询新闻信息列表
     */
    List<News> list(Map<String, Object> map);

    /**
     * 新增新闻信息
     */
    int save(News news);

    /**
     * 修改新闻信息
     */
    int update(News news);

    /**
     * 删除新闻信息
     */
    int deleteById(Integer id);

}
