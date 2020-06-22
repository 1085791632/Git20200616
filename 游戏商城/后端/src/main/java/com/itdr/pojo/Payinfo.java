package com.itdr.pojo;

public class Payinfo {
    private int payinfo_id;
    private int order_id;
    private int user_id;
    private String pay_stat;

    public int getPayinfo_id() {
        return payinfo_id;
    }

    public void setPayinfo_id(int payinfo_id) {
        this.payinfo_id = payinfo_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPay_stat() {
        return pay_stat;
    }

    public void setPay_stat(String pay_stat) {
        this.pay_stat = pay_stat;
    }
}
