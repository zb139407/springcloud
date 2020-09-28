package com.binfen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhangBin 1394078687@qq.com
 * @description: TODO 统一响应格式
 * @date: 2020/8/29 9:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultEntity<T> {
    private Integer code;
    private String message;
    private T data;

    public ResultEntity(Integer code, String message) {
        this(code, message, null);
    }
}
