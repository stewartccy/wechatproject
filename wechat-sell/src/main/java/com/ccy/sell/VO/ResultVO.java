package com.ccy.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author CCY
 * @date 2019/6/2 16:38
 */
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
