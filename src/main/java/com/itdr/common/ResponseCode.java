package com.itdr.common;

import java.io.Serializable;

public class ResponseCode<T> implements Serializable {
    private Integer status;
    private String msg;
    private T data;

    private ResponseCode(){}
    private ResponseCode(T data){
        this.status=200;
        this.data=data;
    }
    private ResponseCode(String msg){
        this.status=100;
        this.msg=msg;
    }

    public static <T> ResponseCode toSuccess(T data){
        return new ResponseCode(data);
    }
    public static ResponseCode toFailed(String msg){
        return new ResponseCode(msg);
    }
    public boolean isSuccess(){
        if(this.status==200){
            return true;
        }
        return false;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
