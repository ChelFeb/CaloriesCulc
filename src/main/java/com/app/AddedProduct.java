package com.app;

import com.hibernate.HibernateUtil;
import com.hibernate.dao.DaoFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.SessionFactory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "productPerDay", catalog = "caloriesculc")
public class AddedProduct implements Serializable {

    private int userId;
    private int recordId;
    private int mass;
    private Date date;
    private Product product;     //todo Переделать что бы была связка с Id продуктом



    //    private int productId;
    ArrayList<AddedProduct> exactDate;

    public AddedProduct() {
    }

    public AddedProduct(int mass,Product product, int userId) {
        this.userId = userId;
        this.mass = mass;
        this.date = new Date();     // дата добавления продукта
        this.product =  product;
    }

    public ArrayList<AddedProduct> exactProductListByDate(Date date, int userId) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Criteria userLookupCriteria = session.
                createCriteria(AddedProduct.class).
                add(Restrictions.ge("date", date)).
                add(Restrictions.eq("userId", userId));

        return (ArrayList<AddedProduct>) userLookupCriteria.list();
    }

    @Column(name = "MASS", precision = 6)
    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE", unique = false, nullable = false, length = 10)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne(fetch = FetchType.EAGER)
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
