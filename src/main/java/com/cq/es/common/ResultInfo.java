package com.cq.es.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 公共返回对象
 */
@Getter
@Setter
public class ResultInfo<T> implements Serializable {
    
    private Integer code;
    private String message;
    private String path;
    private T data;
    
}