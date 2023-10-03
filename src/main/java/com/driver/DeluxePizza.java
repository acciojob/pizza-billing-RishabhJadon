package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        Pizza pza = new Pizza(isVeg);
        pza.addExtraCheese();
        pza.addExtraToppings();
        // your code goes here
    }
}
