package se.ecutb.cheng;

public class PurchaseInfo implements VendingMachine {
    private Product[] products;
    private int moneyPool;

    public PurchaseInfo(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) {
        for (Denomination denomination : Denomination.values()) {
            if (amount == denomination.getDenominationValue()) {
                moneyPool += amount;
            }
        }
    }

    @Override
    public Product request(int productNumber) {
        for (Product product : products) {
            if (product.getProductNumber() == productNumber) {
                if (product.getPrice() <= moneyPool){
                    moneyPool -= product.getPrice();//****
                    System.out.println("The product you purchase is: ");
                    System.out.println(getDescription(productNumber));
                    return product;
                }else
                    System.out.println("you must deposit money ");
            }
        }
        System.out.println("product is not available");
        return null;
    }

    @Override
    public int endSession() {
        int change = moneyPool;
        moneyPool = 0;
        return change;
    }

    @Override
    public String getDescription(int productNumber) {
        for (Product p : products) {
            if (p.getProductNumber() == productNumber)
                return p.examine();
        }
        return null;
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts() {
        String[] productsAsString = new String[products.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.length; i++) {
            sb.append(products[i].examine());
            sb.append("\n");
            productsAsString[i] = sb.toString();
        }
        return productsAsString;

    }
}
