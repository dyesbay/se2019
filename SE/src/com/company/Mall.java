package com.company;

import java.util.ArrayList;

public class Mall {
    private String name;
    private ArrayList<Store> stores;
    private ArrayList<Customer> customers;

    public Mall(){
        // tipa moshnyy konstruktor
    }

    public void enter(Customer c){
        customers.add(c);
    }
    public void exit(Customer c){
        for (int i = 0 ; i < customers.size();i++){
            if (customers.get(i).getId() == c.getId()){
                customers.remove(i);
                return;
            }
        }
    }
    public ShoppingCart getShoppingCart(){
        ShoppingCart sc = new ShoppingCart();
        return sc;
    }
    // zdes dolshen vozvrashatsa enumerator
    public int customers(){
        return customers.size();
    }
    // zdes dolshen vozvrashatsa enumerator
    public int stores(){
        return stores.size();
    }
    public void addStore(Store s){
        stores.add(s);
    }
}
