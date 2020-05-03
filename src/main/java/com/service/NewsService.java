package com.service;

import com.model.News;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 新闻信息Service
 * @author Clrvn
 */
public interface NewsService {

	/**
	 * 查询新闻信息页面
	 * @return 分页新闻信息数据
	 */
	PageInfo<News> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询新闻信息列表
	 */
	List<News> list(Map<String, Object> map);

	/**
	 * 通过id查询单个新闻信息
	 */
    News findById(Integer id);

	/**
	 * 通过map查询单个新闻信息
	 */
	News findByMap(Map<String, Object> map);

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
