package se.ecutb.cheng;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandyTest {
    Product [] products;
    @Before
    public void init() {
        products = new Product[2];
        products[0] = new Candy(1, "Chocolate", 15, 1000, "Nötter");
        products[1] = new Candy(2, "Seg råtta", 12, 110, "Gluten");
    }

    @Test
    public void test_fruit_test(){
        String expectedOutput = "The product Seg råtta is used with 2";
        Assert.assertEquals(expectedOutput, products[1].use(2));
    }
}
