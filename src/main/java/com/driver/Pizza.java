package com.driver;

public class Pizza {

    private int price;
    private int basePrice;
    private Boolean isVeg;
    private String bill = "";

    private int extraCheese=0;
    private boolean isExtraCheeseAdded;

    private int extraToppings=0;

    private boolean isExtraToppings;

    private int takeAway=0;
    private boolean istakeAway;

    private boolean isBilled;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            basePrice = 300;
            extraToppings = 70;
        }
        else {
            basePrice = 400;
            extraToppings = 120;
        }
        extraCheese = 80;
        takeAway = 20;
        this.price = basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded==false)
        {
            isExtraCheeseAdded = true;
            this.price += extraCheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
            if(isExtraToppings==false) {
                isExtraToppings = true;
                this.price += extraToppings;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeAway==false)
        {
            istakeAway = true;
            this.price += takeAway;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBilled)
        {
            this.bill = this.bill + "Base Price Of The Pizza: " + basePrice + "\n";
            if(this.isExtraCheeseAdded)
            {
                this.bill = this.bill + "Extra Cheese Added: " + extraCheese + "\n";
            }
            if(this.isExtraToppings)
            {
                this.bill = this.bill + "Extra Toppings Added: " + extraToppings + "\n";
            }
            if(this.istakeAway)
            {
                this.bill = this.bill + "Paperbag Added: " + takeAway + "\n";
            }
            this.bill = this.bill + "Total Price: " + price + "\n";
            isBilled = true;
        }

        return this.bill;
    }
}
