package com.hibernate.dao;

import com.app.Product;

import java.util.List;

public interface ProductDAO {

    Product getById(Integer id);

    Product ifUserExists(String login, String hashedPassowrd);   //todo

    void save(Product product);

    void delete(Product product);

    List<Product> getAll();

}
