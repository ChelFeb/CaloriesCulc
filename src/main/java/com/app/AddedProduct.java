package com.app;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "productPerDay", catalog = "caloriesculc")
public class AddedProduct implements Serializable {

    private int userId;
    private int recordId;
    private int mass;
    private Date date;
    private Product product;

    public AddedProduct() {
    }

    public AddedProduct(int mass, Product product) {
        this.mass = mass;
        this.date = new Date();     // дата добавления продукта
        this.product = product;
    }




    //-------------------------------------------------------
    @Column(name = "MASS", precision = 6)
    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE", unique = true, nullable = false, length = 10)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "RECORD_ID", unique = true, nullable = false)
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

   @Column(name = "USER_ID", precision = 6)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
