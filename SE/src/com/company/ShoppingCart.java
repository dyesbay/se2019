package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart(){

    }

    public void addItem(Item im){
        items.add(im);
    }
    public void removeItem(Item im){
        for (int i = 0; i<items.size() ; i++){
            if( items.get(i).getId() == im.getId() ){
                items.remove(i);
                return;
            }
        }
    }

    //zdes dolshen byt enumerator
    public void items(){
        for (int i = 0 ; i<items.size();i++){
            System.out.println(items.get(i).toString());
        }
    }
}
