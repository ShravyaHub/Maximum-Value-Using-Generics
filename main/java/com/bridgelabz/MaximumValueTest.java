package com.bridgelabz;

public class MaximumValueTest {

    public int maximumValue(Integer value1, Integer value2, Integer value3) {
        int maximumValue = value1;
        if(value2.compareTo(maximumValue) > 0) {
            maximumValue = value2;
        }
        if((value3).compareTo(maximumValue) > 0) {
            maximumValue = value3;
        }
        return maximumValue;
    }

}
