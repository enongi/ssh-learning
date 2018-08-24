package com.service;

import com.bean.TbUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TbUserServiceImpl implements TbUserService {

    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void add(TbUser tbUser){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(tbUser);
        transaction.commit();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
