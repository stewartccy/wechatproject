package com.ccy.sell.service;

import com.ccy.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CCY
 * @date 2019/6/1 23:12
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId) throws Exception;

    List<ProductCategory> findAll() throws Exception;

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) throws Exception;

    ProductCategory save(ProductCategory productCategory) throws Exception;
}
