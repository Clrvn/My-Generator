package com.service;

import com.model.Comment;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 评论Service
 * @author Clrvn
 */
public interface CommentService {

	/**
	 * 查询评论页面
	 * @return 分页评论数据
	 */
	PageInfo<Comment> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询评论列表
	 */
	List<Comment> list(Map<String, Object> map);

	/**
	 * 通过id查询单个评论
	 */
    Comment findById(Integer id);

	/**
	 * 通过map查询单个评论
	 */
	Comment findByMap(Map<String, Object> map);

	/**
	 * 新增评论
	 */
	int save(Comment comment);

	/**
	 * 修改评论
	 */
	int update(Comment comment);

	/**
	 * 删除评论
	 */
	int deleteById(Integer id);

}
