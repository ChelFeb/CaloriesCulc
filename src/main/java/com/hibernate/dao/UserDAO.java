package com.hibernate.dao;

import com.app.User;

public interface UserDAO {
    User getById(Integer id);
    void save(User name);

    void delete(User name);
}
