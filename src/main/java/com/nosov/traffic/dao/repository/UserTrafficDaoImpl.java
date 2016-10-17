package com.nosov.traffic.dao.repository;


import com.nosov.traffic.model.User;
import com.nosov.traffic.model.UserTraffic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserTrafficDaoImpl implements UserTrafficDao {

    private static final Logger logger = LoggerFactory.getLogger(UserTrafficDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<UserTraffic> listUsers(int userId)// TODO: 13.10.2016 set параметр в запрос
    // https://www.tutorialspoint.com/hibernate/hibernate_query_language.htm
    // Using Named Paramters
    {
        Session session = sessionFactory.getCurrentSession();
        List<UserTraffic> userTrafficList = session.createQuery("FROM UserTraffic ut WHERE ut.user.id =" + userId).list();

        for(UserTraffic userTraffic: userTrafficList){
            logger.info("User list: " + userTraffic);
        }

        return userTrafficList;
    }
}
