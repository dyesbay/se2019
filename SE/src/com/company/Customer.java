package com.company;

public class Customer {
    private ShoppingCart shoppingCart;
    private String name;
    private Store store;
    private Integer id;

    public Customer(){

    }
    // shopping cart
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
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
