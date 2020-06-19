package com.itdr.pojo;

public class User {
    private int user_id;
    private String username;
    private String password;
    private char[] phone;
    private int role;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(char[] phone) {
        this.phone = phone;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public char[] getPhone() {
        return phone;
    }

    public int getRole() {
        return role;
    }
}
