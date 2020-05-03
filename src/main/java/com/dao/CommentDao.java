package com.dao;

import com.model.Comment;

import java.util.List;
import java.util.Map;


/**
 * 评论DAO
 * @author Clrvn
 */
public interface CommentDao {

    /**
     * 通过id查询单个评论
     */
    Comment findById(Integer id);

    /**
     * 通过map查询单个评论
     */
    Comment findByMap(Map<String, Object> map);

    /**
     * 查询评论列表
     */
    List<Comment> list(Map<String, Object> map);

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
