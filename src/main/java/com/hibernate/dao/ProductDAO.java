package com.hibernate.dao;

import com.app.Product;

import java.util.List;

public interface ProductDAO {

    Product getById(Integer id);
    void save(Product product);
    void delete(Product product);
    List<Product> getAll();

}
