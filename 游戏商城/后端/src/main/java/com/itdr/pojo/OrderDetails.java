package com.itdr.pojo;

public class OrderDetails {
    private int orderdetails_id;
    private int goods_id;
    private int user_id;
    private int order_id;
    private int quantity;

    public int getOrderdetails_id() {
        return orderdetails_id;
    }

    public void setOrderdetails_id(int orderdetails_id) {
        this.orderdetails_id = orderdetails_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
