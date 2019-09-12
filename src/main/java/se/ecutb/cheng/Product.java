package se.ecutb.cheng;

public abstract class Product {
    private int productNumber;
    private int price;
    private String name;
    private int calorie;
    private String allergens;

    public Product(int productNumber, String name, int price, int calorie, String allergens) {
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.calorie = calorie;
        this.allergens = allergens;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public String examine(){
        return "The product is: " +
                "\nProduct No.: " + getProductNumber() +
                "\tPrice: " + getPrice() +
                "\tName: " + getName() +
                "\tCalorie: " + getCalorie() +
                "\tAllergens: " + getAllergens();
    }

    public abstract String use(int productNumber);

}

