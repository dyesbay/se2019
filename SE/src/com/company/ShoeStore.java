package com.company;

import java.util.ArrayList;

public class ShoeStore extends Store {
    private String name;
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;
    private ArrayList<Observer> observers;
    private Integer storeid;

    public ShoeStore(){
    }

    public void enter(Customer c){
        customers.add(c);
    }
    public void exit(Customer c) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == c.getId()) {
                customers.remove(i);
                return;
            }
        }
    }
    // zdes dolshen vozvrashatsa enumerator
    public int customers(){
        return customers.size();
    }
    // zdes dolshen vozvrashatsa enumerator
    public int items(){
        return items.size();
    }
    public void addObserver(Observer o){
        observers.add(o);
    }
}
