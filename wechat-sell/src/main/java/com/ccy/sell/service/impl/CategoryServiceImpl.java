package com.ccy.sell.service.impl;

import com.ccy.sell.dataobject.ProductCategory;
import com.ccy.sell.repository.ProductCategoryRepository;
import com.ccy.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CCY
 * @date 2019/6/1 23:14
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final ProductCategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductCategory findOne(Integer categoryId) throws Exception{
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() throws Exception{
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) throws Exception{
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) throws Exception{
        return repository.save(productCategory);
    }
}
