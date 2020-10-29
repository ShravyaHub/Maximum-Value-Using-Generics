package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTestCases {

    @Test
    public void givenFirstInteger_WhenMaximum_ShouldReturnFirstInteger() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(4, maximumValueTest.maximumValue(4, 3, 2));
    }

    @Test
    public void givenSecondInteger_WhenMaximum_ShouldReturnSecondInteger() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(3, maximumValueTest.maximumValue(1, 3, 2));
    }

    @Test
    public void givenThirdInteger_WhenMaximum_ShouldReturnThirdInteger() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(5, maximumValueTest.maximumValue(4, 3, 5));
    }

    @Test
    public void givenFirstDouble_WhenMaximum_ShouldReturnFirstDouble() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(4.4, maximumValueTest.maximumValue(4.4, 4.2, 2.0), 0);
    }

    @Test
    public void givenSecondDouble_WhenMaximum_ShouldReturnSecondDouble() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(3.1, maximumValueTest.maximumValue(1.1, 3.1, 2.1), 0);
    }

    @Test
    public void givenThirdDouble_WhenMaximum_ShouldReturnThirdDouble() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(4.6, maximumValueTest.maximumValue(4.5, 4.3, 4.6), 0);
    }

    @Test
    public void givenFirstString_WhenMaximum_ShouldReturnFirstString() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals("Hi", maximumValueTest.maximumValue("Hi", "Hello", "Hey"));
    }

    @Test
    public void givenSecondString_WhenMaximum_ShouldReturnSecondString() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals("Mango", maximumValueTest.maximumValue("Apple", "Mango", "Grape"));
    }

    @Test
    public void givenThirdString_WhenMaximum_ShouldReturnThirdString() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals("Red", maximumValueTest.maximumValue("Pink", "Blue", "Red"));
    }

}
