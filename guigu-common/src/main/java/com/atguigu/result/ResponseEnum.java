package com.atguigu.result;

import com.sun.net.httpserver.Authenticator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum ResponseEnum {
    SUCCESS(0,"成功"),
    ERROR(-1,"服务器内部错误"),
    ;

    private Integer code;
    private String message;
}
