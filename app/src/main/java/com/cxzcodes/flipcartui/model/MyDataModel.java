package com.cxzcodes.flipcartui.model;


public class MyDataModel {
    private String name;
    private String price;
    private int imageResId;
    private String desc;

    public MyDataModel(String name,String price, int imageResId,String desc) {
        this.price = price;
        this.name = name;
        this.imageResId = imageResId;
        this.desc = desc;

    }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getdesc() {
        return desc;
    }

    public int getImageResId() {
        return imageResId;
    }
}

