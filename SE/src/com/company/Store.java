package com.company;

import java.util.ArrayList;

public abstract class Store {
    private String name;
    private ArrayList<Item> items;
    private ArrayList<Customer> customers;
    private ArrayList<Observer> observers;
    private Integer storeid;

    public abstract void enter(Customer c);
    public abstract void exit(Customer c);
    // zdes dolshen vozvrashatsa enumerator
    public abstract int customers();
    // zdes dolshen vozvrashatsa enumerator
    public abstract int items();
    public abstract void addObserver(Observer o);
}
