package com.app;

import com.hibernate.entity.HibernateEntity;

public class User extends HibernateEntity{
    private String login;
    private String password;
    private String role;
    private UserProductSet userProductSet;

    public User(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserProductSet getUserProductSet() {
        return userProductSet;
    }

    public void setUserProductSet(UserProductSet userProductSet) {
        this.userProductSet = userProductSet;
    }
}
