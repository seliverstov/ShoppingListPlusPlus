package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by a.g.seliverstov on 24.02.2016.
 */
public class ShoppingList {
    private String listName;
    String owner;

    public ShoppingList() {
    }

    public ShoppingList(String listName, String owner) {
        this.setListName(listName);
        this.setOwner(owner);
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
}
