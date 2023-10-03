package com.driver;

public class Main {
  public static void main(String[] args) {

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());

    DeluxePizza dp = new DeluxePizza(false);
    //System.out.println(dp.getPrice());
    //dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    //dp.addTakeaway();
    System.out.println(dp.getBill());
  }
}