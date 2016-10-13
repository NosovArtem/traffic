package com.nosov.traffic.dao.repository;

import com.nosov.traffic.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
      User user = (User)session.load(User.class, new Integer(id));
        logger.info("User successfully loaded. User details: " + user);

        return user;

    }

    @Override
    public List<User> listUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> userList = session.createQuery("from User").list();

        for(User user: userList){
            logger.info("User list: " + user);
        }

        return userList;
    }
}
