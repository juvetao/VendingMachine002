package se.ecutb.cheng;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main
{
    private static Product[] products;
    private static PurchaseInfo purchase;


    public static void main( String[] args )
    {
        products = new Product[6];
        products[0] = new Fruit(1, "Melon", 100, 10, "No allergen");
        products[1] = new Fruit(2, "Banana", 5, 20, "No idea");
        products[2] = new Candy(3, "Thyself rat", 15, 30, "Gluten");
        products[3] = new Candy(4, "Chocolate", 20, 100, "Nuts");
        products[4] = new Drink(5, "Cola", 20, 200, "No allergen");
        products[5] = new Drink(6, "Milk", 25, 140, "Lactose");

        purchase = new PurchaseInfo(products);

        System.out.println("Welcome to Vending Machine!");
        System.out.println("Here are all the products you can purchase");
        //Show all the products in the vending machine
        showAllProducts();

        //Deposit money
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        boolean contineInserting = true;
        int amount = 0;
        String yesOrNo = "";
        do{
            System.out.println("Please deposit money: 1kr, 5kr, 10kr, 20kr, 50kr, 100kr, 500kr, 1000kr.");
            amount = scanner.nextInt();
            purchase.addCurrency(amount);
            System.out.println("The balance in the money pool now is: " + purchase.getBalance()+ " kr");

            System.out.println("Do you want to continue depositing money? y/n");
            yesOrNo = scanner1.nextLine();
            switch (yesOrNo){
                case "n":
                System.out.println("Deposit ends");
                contineInserting = false;
                break;
            }
        }while(contineInserting);

        //Show the credit in money pool
        System.out.println("You have credit of: " + purchase.getBalance()+" kr");

        //Shopping time
        boolean keepShopping = true;
        int productNo = 0;
        do{
            System.out.println("Please enter the product no. of the one you want to purchase");
            productNo = scanner.nextInt();
            purchase.request(productNo);
            System.out.println("The product you purchase is: ");
            System.out.println(purchase.getDescription(productNo));

            System.out.println("Do you want to continue shopping? y/n");
            yesOrNo = scanner1.nextLine();
            switch (yesOrNo) {
                case "n":
                    System.out.println("Shopping ends");
                    keepShopping = false;
                    break;
            }
        }while (keepShopping);

        //Show the credit in money pool
        System.out.println("You have credit of: " + purchase.getBalance()+ " kr");

        //End session
        System.out.println("The amount of change "+ purchase.endSession()+ " kr is returned");

        //Check if the balance is cleared
        System.out.println("You have credit of: " + purchase.getBalance()+" kr");
        System.out.println("Thank you for purchasing! Do come back!");


    }

    public static void showAllProducts(){
        for(int i = 1; i <= products.length;i++){
            System.out.println(purchase.getDescription(i));
        }
    }
}
