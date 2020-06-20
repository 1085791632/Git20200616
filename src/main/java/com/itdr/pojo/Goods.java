package com.itdr.pojo;

import java.math.BigDecimal;

public class Goods {
    private int goods_id;
    private int variety_id;
    private String name;
    private String main_img;
    private String detail_img;
    private String detail;
    private BigDecimal price;
    private int stock;

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", variety_id=" + variety_id +
                ", name='" + name + '\'' +
                ", main_img='" + main_img + '\'' +
                ", detail_img='" + detail_img + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getVariety_id() {
        return variety_id;
    }

    public void setVariety_id(int variety_id) {
        this.variety_id = variety_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMain_img() {
        return main_img;
    }

    public void setMain_img(String main_img) {
        this.main_img = main_img;
    }

    public String getDetail_img() {
        return detail_img;
    }

    public void setDetail_img(String detail_img) {
        this.detail_img = detail_img;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
