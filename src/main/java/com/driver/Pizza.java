package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private int extraCheese=0;

    private int extraToppings=0;

    private int takeAway=0;

    private int totalSum = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price = 300;
        }
        else {
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
            extraToppings = 70;
        }
        else {
            extraToppings = 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeAway = 20;
    }

    public String getBill(){
        // your code goes here
        totalSum = price + extraCheese + extraToppings + takeAway;
        if(price!=0)
        {
            bill = bill + "Base Price Of The Pizza: " + price + "\n";
        }
        if(extraCheese!=0)
        {
            bill = bill + "Extra Cheese Added: " + extraCheese + "\n";
        }
        if(extraToppings!=0)
        {
            bill = bill + "Extra Toppings Added: " + extraToppings + "\n";
        }
        if(takeAway!=0)
        {
            bill = bill + "Paperbag Added: " + takeAway + "\n";
        }
            bill = bill + "Total Price: " + totalSum + "\n";
        return this.bill;
    }
}
