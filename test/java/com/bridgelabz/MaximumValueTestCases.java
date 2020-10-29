package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTestCases {

    @Test
    public void givenFirstInteger_WhenMaximum_ShouldReturnFirstInteger() {
        MaximumValueTest maximumValueTest = new MaximumValueTest(4, 3, 2);
        Assert.assertEquals(4, maximumValueTest.testMaximum());
    }

    @Test
    public void givenSecondInteger_WhenMaximum_ShouldReturnSecondInteger() {
        MaximumValueTest maximumValueTest = new MaximumValueTest(1, 3, 2);
        Assert.assertEquals(3, maximumValueTest.testMaximum());
    }

    @Test
    public void givenThirdInteger_WhenMaximum_ShouldReturnThirdInteger() {
        MaximumValueTest maximumValueTest = new MaximumValueTest(4, 3, 5);
        Assert.assertEquals(5, maximumValueTest.testMaximum());
    }

    @Test
    public void givenFirstFloat_WhenMaximum_ShouldReturnFirstFloat() {
        MaximumValueTest maximumValueTest = new MaximumValueTest(4f, 3f, 2f);
        Assert.assertEquals(4f, maximumValueTest.testMaximum());
    }

    @Test
    public void givenSecondFloat_WhenMaximum_ShouldReturnSecondFloat() {
        MaximumValueTest maximumValueTest = new MaximumValueTest(1f, 3f, 2f);
        Assert.assertEquals(3f, maximumValueTest.testMaximum());
    }

    @Test
    public void givenThirdFloat_WhenMaximum_ShouldReturnThirdFloat() {
        MaximumValueTest maximumValueTest = new MaximumValueTest(4f, 3f, 5f);
        Assert.assertEquals(5f, maximumValueTest.testMaximum());
    }

    @Test
    public void givenFirstString_WhenMaximum_ShouldReturnFirstString() {
        MaximumValueTest maximumValueTest = new MaximumValueTest("Hi", "Hello", "Hey");
        Assert.assertEquals("Hi", maximumValueTest.testMaximum());
    }

    @Test
    public void givenSecondString_WhenMaximum_ShouldReturnSecondString() {
        MaximumValueTest maximumValueTest = new MaximumValueTest("Apple", "Mango", "Grape");
        Assert.assertEquals("Mango", maximumValueTest.testMaximum());
    }

    @Test
    public void givenThirdString_WhenMaximum_ShouldReturnThirdString() {
        MaximumValueTest maximumValueTest = new MaximumValueTest("Pink", "Blue", "Red");
        Assert.assertEquals("Red", maximumValueTest.testMaximum());
    }

    @Test
    public void givenMoreThanThreeIntegers_WhenMaximum_ShouldReturnMax() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(7, maximumValueTest.max(4, 2, 5, 7, 6));
    }

    @Test
    public void givenMoreThanThreeFloats_WhenMaximum_ShouldReturnMax() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(7f, maximumValueTest.max(4f, 2f, 5f, 7f, 6f));
    }

    @Test
    public void givenMoreThanThreeStrings_WhenMaximum_ShouldReturnMax() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals("Red", maximumValueTest.max("Red", "Blue", "Orange", "Pink"));
    }

}
