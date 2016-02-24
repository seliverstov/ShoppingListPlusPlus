package com.udacity.firebase.shoppinglistplusplus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firebase.client.ServerValue;

import java.util.HashMap;

/**
 * Created by a.g.seliverstov on 24.02.2016.
 */
public class ShoppingList {
    private String listName;
    private String owner;
    private HashMap<String,Object> dateLastChanged;

    public ShoppingList() {
        this.dateLastChanged = new HashMap<String,Object>();
        this.dateLastChanged.put("date", ServerValue.TIMESTAMP);
    }

    public ShoppingList(String listName, String owner) {
        this.setListName(listName);
        this.setOwner(owner);
        this.dateLastChanged = new HashMap<String,Object>();
        this.dateLastChanged.put("date", ServerValue.TIMESTAMP);
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDateLastChanged(HashMap<String, Object> dateLastChanged) {
        this.dateLastChanged = dateLastChanged;
    }

    public HashMap<String,Object> getDateLastChanged(){
        return this.dateLastChanged;
    }

    @JsonIgnore
    public Long getDateLastChangedLong(){
        Object date = getDateLastChanged().get("date");
        if (date instanceof Long){
            return (Long)date;
        }else{
            return null;
        }
    }
}
