package com.nosov.traffic.controller;

import com.nosov.traffic.controller.dto.UserTrafficDTO;
import com.nosov.traffic.service.UserService;
import com.nosov.traffic.service.UserTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserTrafficController {

    @Autowired
    private UserService userService;
    @Autowired
    UserTrafficService userTrafficService;

    @RequestMapping(value = "usertraffic", method = RequestMethod.GET)
    public String userTraffic(Model model){
        model.addAttribute("userTrafficDTO", new UserTrafficDTO());
        model.addAttribute("listUsers", this.userService.listUsers());

        return "usertraffic";
    }


    @RequestMapping(value = "usertraffic", method = RequestMethod.POST)
    public String userTrafficFind(@ModelAttribute("userTrafficDTO") UserTrafficDTO userTrafficDTO, Model model){
        model.addAttribute("userTrafficDTO", new UserTrafficDTO());
        model.addAttribute("listUsers", this.userService.listUsers());

        return "usertraffic";
    }


}
