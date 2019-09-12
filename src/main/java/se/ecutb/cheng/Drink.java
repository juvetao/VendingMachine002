package se.ecutb.cheng;

import se.ecutb.cheng.Product;

public class Drink extends Product {

    public Drink(int productNumber, String name, int price, int calorie, String allergens) {
        super(productNumber, name, price, calorie, allergens);
    }

    @Override
    public String use(int productNumber) {
        return "The product " + getName() + " is used " + "with " + productNumber;
    }
}
