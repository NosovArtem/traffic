package com.nosov.traffic.dao.repository;


import com.nosov.traffic.model.User;

import java.util.List;

public interface UserDao {

    User getUserById(int id);

    List<User> listUsers();
}
