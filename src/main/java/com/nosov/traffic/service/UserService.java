package com.nosov.traffic.service;


import com.nosov.traffic.model.User;

import java.util.List;

public interface UserService {

    User getUserById(int id);

    List<User> listUsers();
}
