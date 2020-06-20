package com.itdr.pojo;

public class Cart {
    private int cart_id;
    private int goods_id;
    private int user_id;
    private int goods_quantity;
    private boolean checked;

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", goods_id=" + goods_id +
                ", user_id=" + user_id +
                ", goods_quantity=" + goods_quantity +
                ", checked=" + checked +
                '}';
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
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

    public int getGoods_quantity() {
        return goods_quantity;
    }

    public void setGoods_quantity(int goods_quantity) {
        this.goods_quantity = goods_quantity;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
