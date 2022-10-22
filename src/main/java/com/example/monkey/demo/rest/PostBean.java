package com.example.monkey.demo.rest;

public class PostBean {

    public PostBean(){
        this.value = "horahora";
        this.num = 123;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    private String value;
    private Integer num;

}
