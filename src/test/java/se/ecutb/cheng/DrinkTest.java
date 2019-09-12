package se.ecutb.cheng;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DrinkTest {
    Product [] products;
    @Before
    public void init() {
        products = new Product[3];
        products[0] = new Drink(1, "Cola", 20, 1000, "No allergen");
        products[1] = new Drink(2, "Juice", 12, 110, "No idea");
        products[2] = new Drink(3, "Milk", 15, 100, "Lactose");
    }

    @Test
    public void test_fruit_test(){
        String expectedOutput = "The product Cola is used with 1";
        Assert.assertEquals(expectedOutput, products[0].use(1));
    }

}
