package com.example.assignment4;

public class Items {

    private  String itemName;
    private  String itemPrice;
    private  String itemImageName;
    private  String itemDescription;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemImageName() {
        return itemImageName;
    }

    public void setItemImageName(String itemImageName) {
        this.itemImageName = itemImageName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Items(String itemName, String itemPrice, String itemImageName, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImageName = itemImageName;
        this.itemDescription = itemDescription;
    }
}
