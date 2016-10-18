package com.nosov.traffic.controller.dto;


import com.nosov.traffic.model.User;
import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class UserTrafficDTO {

    @NotNull
    private User user;

    private Integer dateStart;

    private Date dateEnd;

    private String uplink;

    private  String downlink;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getDateStart() {
        return dateStart;
    }

    public void setDateStart(Integer dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getUplink() {
        return uplink;
    }

    public void setUplink(String uplink) {
        this.uplink = uplink;
    }

    public String getDownlink() {
        return downlink;
    }

    public void setDownlink(String downlink) {
        this.downlink = downlink;
    }
}
