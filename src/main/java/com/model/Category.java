package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 服务分类
 * @author Clrvn
 */
@Data
public class Category implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 分类编号
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类描述
     */
    private String description;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
