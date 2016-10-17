package com.nosov.traffic.service;

import com.nosov.traffic.model.User;
import com.nosov.traffic.model.UserTraffic;

import java.util.List;

public interface UserTrafficService {

    List<UserTraffic> listUsers(int userId);
}
