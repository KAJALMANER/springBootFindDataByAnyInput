package com.csi.dao;

import com.csi.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductDaoImpl implements ProductDao{
   private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();


    @Override
    public void saveData(Product product) {
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(product);
        transaction.commit();
    }

    @Override
    public List<Product> getAllData(Product product) {

        Session session = factory.openSession();
        List<Product> prodList = new ArrayList<>();
        List<Product> productList = session.createQuery("from Product").list();

        for (Product pp : productList) {
            if (pp.getProdId() == product.getProdId()
                    || pp.getProdName().equals(product.getProdName())
                    || pp.getProdCode() == product.getProdCode()
                    || pp.getProdlunchDate().equals(product.getProdlunchDate())) {
                prodList.add(pp);
            }

        }
        return prodList;
    }
    }
