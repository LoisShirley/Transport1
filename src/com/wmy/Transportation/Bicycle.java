package com.wmy.Transportation;

/**
 * @description:自行车
 * @author: wmy
 * @date: Created on 2020/5/18
 * @version: 1.0
 * @modified By:
 */
public class Bicycle {

    public void bicycle() {
        System.out.println("Riding a bike is very leisurely.");
    }

    private String ownership;
    private String GPSPosition;
    private String price;
    private String dateOfPurchase;
    private String id;

    public void drivingMethod(String ownership, String GPSPosition, String price,String dateOfPurchase, String id){

        System.out.println("驾驶员："+ownership);
        System.out.println("地理位置："+GPSPosition);
        System.out.println("票价："+price);
        System.out.println("交易日期："+dateOfPurchase);
        System.out.println("该车编号："+id);
        System.out.println("**************************");
    }

    public String getOwnership() {
        return ownership;
    }
    public String getGPSPosition() {
        return GPSPosition;
    }
    public String getPrice() {
        return price;
    }
    public String getDateOfPurchase() {
        return dateOfPurchase;
    }
    public String getId() {
        return id;
    }


    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }
    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setDateOfPurchase(String dateOfPurchase) {
        this.id = id;
    }
    public void setId(String id) {
        this.id = id;
    }
}