package com.nosov.traffic.controller;

import com.nosov.traffic.model.UserTraffic;
import com.nosov.traffic.service.UserTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserTrafficController {

    UserTrafficService userTrafficService;

    @Autowired(required = true)
    @Qualifier(value = "userTrafficService")
    public void setUserTrafficService(UserTrafficService userTrafficService) {
        this.userTrafficService = userTrafficService;
    }

    @RequestMapping(value = "usertraffic/{id}", method = RequestMethod.GET)
    public String listUserTraffic(@PathVariable("id") int id, Model model){
        model.addAttribute("userTraffic", new UserTraffic());
        model.addAttribute("listUserTraffic", this.userTrafficService.listUsers(id));

    return "usertraffic";
    }


}
