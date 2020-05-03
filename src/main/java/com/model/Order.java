package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 服务订单
 * @author Clrvn
 */
@Data
public class Order implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private Integer id;

    /**
     * 分类编号
     */
    private Integer categoryId;

    /**
     * 服务编号
     */
    private Integer cleanId;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 家政编号
     */
    private Integer serviceId;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 发起人编号
     */
    private Integer createUserId;

    /**
     * 接收人编号
     */
    private Integer toUserId;


}
