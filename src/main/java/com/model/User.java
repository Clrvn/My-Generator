package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户
 * @author Clrvn
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
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
     * 年龄
     */
    private String age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电话
     */
    private String phone;

    /**
     * 住址
     */
    private String address;

    /**
     * QQ
     */
    private String qq;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 角色
     */
    private Integer roleId;


}
