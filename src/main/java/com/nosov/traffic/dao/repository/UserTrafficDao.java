package com.nosov.traffic.dao.repository;


import com.nosov.traffic.model.User;
import com.nosov.traffic.model.UserTraffic;

import java.util.List;

public interface UserTrafficDao {

    List<UserTraffic> listUsers(int userId);
}
