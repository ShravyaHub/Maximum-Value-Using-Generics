package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTestCases {

    @Test
    public void givenFirstValue_WhenMaximum_ShouldReturnFirstValue() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(4, maximumValueTest.maximumValue(4, 3, 2));
    }

    @Test
    public void givenSecondValue_WhenMaximum_ShouldReturnSecondValue() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(3, maximumValueTest.maximumValue(1, 3, 2));
    }

    @Test
    public void givenThirdNumber_WhenMaximum_ShouldReturnNumber() {
        MaximumValueTest maximumValueTest = new MaximumValueTest();
        Assert.assertEquals(5, maximumValueTest.maximumValue(4, 3, 5));
    }

}
