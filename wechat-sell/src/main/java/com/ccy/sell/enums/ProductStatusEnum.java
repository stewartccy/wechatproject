package com.ccy.sell.enums;

import lombok.Getter;

/**
 * @author CCY
 * @date 2019/6/2 15:13
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;
    private String message;


    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
