package com.model;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户
 * @author Clrvn
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 角色
     */
    private Integer roleId;


}
