package com.connectyu.test.model;

import java.util.Date;

public class Order {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Double total;

    /**
     *
     */
    private Integer amount;

    /**
     *
     */
    private int status;

    /**
     *
     */
    private int paytype;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String phone;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private Date datetime;

    /**
     *
     */
    private Integer userId;
    public void setStatus(int status) {
        this.status = status;
    }

    public void setPaytype(int paytype) {
        this.paytype = paytype;
    }

    public int getStatus() {
        return status;
    }

    public int getPaytype() {
        return paytype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

