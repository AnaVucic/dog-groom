package com.napredno.doggroom.domain;

import java.math.BigDecimal;

public class Service {

    private Long serviceID;
    private String name;
    private BigDecimal fee;
    private int duration;

    public Service() {
    }

    public Service(Long serviceID, String name, BigDecimal fee, int duration) {
        this.serviceID = serviceID;
        this.name = name;
        this.fee = fee;
        this.duration = duration;
    }

    public Service(String name, BigDecimal fee, int duration) {
        this.name = name;
        this.fee = fee;
        this.duration = duration;
    }

    public Long getServiceID() {
        return serviceID;
    }

    public void setServiceID(Long serviceID) {
        this.serviceID = serviceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceID=" + serviceID +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                ", duration=" + duration +
                '}';
    }
}
