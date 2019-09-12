package se.ecutb.cheng;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PurchaseInfoTest {
    Product [] products;
    PurchaseInfo testObject;

    @Before
    public void before_test(){
        products = new Product[3];
        products[0]  = new Fruit(1, "Apple", 10, 100, "No allergen");
        products[1]  = new Fruit(2, "Orange", 12, 110, "No allergen");
        products[2]  = new Fruit(3, "Melon", 110, 100, "No allergen");
        testObject = new PurchaseInfo(products);
    }

    @Test
    public void add_currency_test(){

        int expectedValue = 100;
        testObject.addCurrency(100);
        Assert.assertEquals(expectedValue, testObject.getBalance());

        int expectedValue1 = 105;
        testObject.addCurrency(5);
        Assert.assertEquals(expectedValue1, testObject.getBalance());

        int expectedVale2 = 105;
        testObject.addCurrency(2);
        Assert.assertEquals(expectedVale2, testObject.getBalance());
    }
    @Test
    public void test_request(){
        testObject.addCurrency(100);
        int expectedValue1 = 90;
        testObject.request(1);
        Assert.assertEquals(expectedValue1, testObject.getBalance());

        int expectedValue2 = 78;
        testObject.request(2);
        Assert.assertEquals(expectedValue2, testObject.getBalance());

        int expectedValue3 = 78;
        testObject.request(3);
        Assert.assertEquals(expectedValue3, testObject.getBalance());

        Assert.assertNotNull(testObject.request(1));
        Assert.assertNull(testObject.request(4));
    }

    @Test
    public void test_end_session(){
        testObject.addCurrency(500);
        testObject.request(1);
        testObject.request(2);
        int expectedValue1 = 478;
        Assert.assertEquals(expectedValue1, testObject.endSession());

        PurchaseInfo testObject1 = new PurchaseInfo(products);
        testObject1.addCurrency(10);
        testObject1.request(1);
        int expectedValue2 = 0;
        Assert.assertEquals(expectedValue2, testObject1.endSession());
    }

    @Test
    public void test_examine(){
        String expectedOutput1 ="The product is: \nPrice: 12\nName: Orange\nCalorie: 110\nAllergens: No allergen";
        Assert.assertEquals(expectedOutput1, testObject.getDescription(2).trim());

        Assert.assertNull(testObject.getDescription(5));
    }

    @Test
    public void test_get_product(){
        /*
        String[] expectedOutput = new String[3];
        expectedOutput[0] = "The product is: \nPrice: 10\nName: Apple\nCalorie: 100\nAllergens: No allergen\n";
        expectedOutput[1] = "The product is: \nPrice: 12\nName: Orange\nCalorie: 110\nAllergens: No allergen\n";
        expectedOutput[2] = "The product is: \nPrice: 110\nName: Melon\nCalorie: 100\nAllergens: No allergen\n";
        */

        int expectedLength = 3;
        Assert.assertEquals(expectedLength, testObject.getProducts().length);
    }
}
