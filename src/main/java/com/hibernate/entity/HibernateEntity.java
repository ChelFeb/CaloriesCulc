package com.hibernate.entity;

public abstract class HibernateEntity {
    private Integer id;

    public HibernateEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
