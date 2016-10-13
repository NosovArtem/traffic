package com.nosov.traffic.model;

import com.nosov.traffic.model.User;
import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "USER_TRAFFIC")
public class Traffic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USER_TRAFFIC")
    private int id;

    @NotNull
    @JoinColumn(name = "ID_USER")
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column(name = "DATE_TRAFFIC")
    private Date date;

    @Column(name = "UPLINK_TRAFFIC")
    private String uplink;

    @Column(name = "DOWNLINK_TRAFFIC")
    private  String downlink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
