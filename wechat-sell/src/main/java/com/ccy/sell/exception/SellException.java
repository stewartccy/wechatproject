package com.ccy.sell.exception;

import com.ccy.sell.enums.ResultEnum;

/**
 * @author CCY
 * @date 2019/6/3 14:19
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message){
        super(message);
        this.code = code;
    }
}
