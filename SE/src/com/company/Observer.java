package com.company;

public class Observer {
    private String name;
    private Store store;
    private Integer id;

    public Observer(){

    }

    // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //store
    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
