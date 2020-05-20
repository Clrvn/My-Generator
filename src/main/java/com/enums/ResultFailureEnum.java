package com.enums;

import lombok.Getter;

@Getter
public enum ResultFailureEnum {
    /**
     * 返回错误信息枚举类
     */
    LOGIN_ERROR(1, "登录失败"),
    REGISTER_ERROR(2, "注册失败，已存在该用户名！"),
    ;

    private Integer code;

    private String msg;

    ResultFailureEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
