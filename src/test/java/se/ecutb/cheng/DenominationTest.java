package se.ecutb.cheng;

import org.junit.Assert;
import org.junit.Test;

public class DenominationTest {

    @Test
    public void denomination_value_test() {
        int expectedValue = 500;
        Assert.assertEquals(expectedValue, Denomination.fivehundred.getDenominationValue());
    }

    @Test
    public void denomination_value_of_test(){
        String expectedvalueOf = "one";
        Assert.assertEquals(expectedvalueOf, Denomination.one.toString());
    }
}
