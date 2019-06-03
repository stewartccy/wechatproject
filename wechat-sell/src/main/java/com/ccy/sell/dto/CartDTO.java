package com.ccy.sell.dto;

import lombok.Data;

/**
 * @author CCY
 * @date 2019/6/3 15:15
 */
@Data
public class CartDTO {
    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
