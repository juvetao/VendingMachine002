package se.ecutb.cheng;

public class Candy extends Product {

    public Candy(int productNumber, String name, int price, int calorie, String allergens) {
        super(productNumber, name, price, calorie, allergens);
    }

    @Override
    public String use(int productNumber) {
        return "The product " + getName() + " is used " + "with " + productNumber;
    }
}
