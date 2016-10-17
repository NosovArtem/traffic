package com.nosov.traffic.service;

import com.nosov.traffic.dao.repository.UserTrafficDao;
import com.nosov.traffic.model.User;
import com.nosov.traffic.model.UserTraffic;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserTrafficServiceImpl implements UserTrafficService{

    UserTrafficDao userTrafficDao;

    public void setUserTrafficDao(UserTrafficDao userTrafficDao) {
        this.userTrafficDao = userTrafficDao;
    }

    @Override
    @Transactional
    public List<UserTraffic> listUsers(int userId) {
        return this.userTrafficDao.listUsers(userId);
    }
}
