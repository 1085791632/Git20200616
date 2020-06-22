package com.itdr.pojo;

public class Address {
    private int address_id;
    private int user_id;
    private String receive_name;
    private String receive_province;
    private String receive_city;
    private String receive_address;

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setReceive_name(String receive_name) {
        this.receive_name = receive_name;
    }

    public void setReceive_province(String receive_province) {
        this.receive_province = receive_province;
    }

    public void setReceive_city(String receive_city) {
        this.receive_city = receive_city;
    }

    public void setReceive_address(String receive_address) {
        this.receive_address = receive_address;
    }

    public int getAddress_id() {
        return address_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getReceive_name() {
        return receive_name;
    }

    public String getReceive_province() {
        return receive_province;
    }

    public String getReceive_city() {
        return receive_city;
    }

    public String getReceive_address() {
        return receive_address;
    }
}
