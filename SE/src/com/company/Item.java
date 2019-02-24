package com.company;

public class Item {
    private String name;
    private Integer id;
    private Integer storeid;
    private Double price;

    public Item(){

    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //storeid
    public Integer getStoreid() {
        return storeid;
    }
    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    //price
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //vozmoshno sdes nalashal, ne pomnu concat
    @Override
    public String toString() {
        return name + price;
    }
}
