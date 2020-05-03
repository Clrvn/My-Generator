package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 分值记录
 * @author Clrvn
 */
@Data
public class Record implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 记录编号
     */
    private Integer id;

    /**
     * 评分
     */
    private String score;

    /**
     * 家政编号
     */
    private Integer serviceId;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 追加时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
