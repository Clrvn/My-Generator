package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 评论
 * @author Clrvn
 */
@Data
public class Comment implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 评论编号
     */
    private Integer id;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 留言用户编号
     */
    private Integer commentUserId;

    /**
     * 发布时间
     */
    private Date createTime;


}
