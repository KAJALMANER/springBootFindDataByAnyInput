package com.csi.service;

import com.csi.dao.ProductDao;
import com.csi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductDao productDao;
    @Override
    public void saveData(Product product) {
        productDao.saveData(product);

    }

    @Override
    public List<Product> getAllData(Product product) {
        return productDao.getAllData(product);
    }
}
