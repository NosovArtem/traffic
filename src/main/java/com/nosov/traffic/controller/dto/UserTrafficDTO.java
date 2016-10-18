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

    private Date dateStart;

    private Date dateEnd;

    private Boolean uplink;

    private  Boolean downlink;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Boolean getUplink() {
        return uplink;
    }

    public void setUplink(Boolean uplink) {
        this.uplink = uplink;
    }

    public Boolean getDownlink() {
        return downlink;
    }

    public void setDownlink(Boolean downlink) {
        this.downlink = downlink;
    }
}
