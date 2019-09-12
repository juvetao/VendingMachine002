package se.ecutb.cheng;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTest {
    Product [] products;
    @Before
    public void init() {
        products = new Product[3];
        products[0] = new Fruit(1, "Apple", 10, 100, "No allergen");
        products[1] = new Fruit(2, "Orange", 12, 110, "No allergen");
        products[2] = new Fruit(3, "Melon", 110, 100, "No allergen");
    }

    @Test
    public void test_fruit_test(){
        String expectedOutput = "The product Apple is used with 1";
        Assert.assertEquals(expectedOutput, products[0].use(1));
    }
}
