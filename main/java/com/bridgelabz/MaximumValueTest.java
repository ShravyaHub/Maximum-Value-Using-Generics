package com.bridgelabz;

import java.util.Arrays;

public class MaximumValueTest<E extends Comparable<E>> {

    E value1 , value2 , value3 ;

    public MaximumValueTest(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public MaximumValueTest() {}

    public E testMaximum()
    {
        return MaximumValueTest.maximumValue(value1, value2, value3);
    }

    public static <E extends Comparable<E>> E maximumValue(E value1, E value2, E value3) {
        E maximumValue = value1;
        if(value2.compareTo(maximumValue) > 0) {
            maximumValue = value2;
        }
        if((value3).compareTo(maximumValue) > 0) {
            maximumValue = value3;
        }
        printMax(maximumValue);
        return maximumValue;
    }

    public  <E extends Comparable<E>> E max(E... values) {
        Arrays.sort(values);
        printMax(values[values.length-1]);
        return values[values.length-1];
    }

    public static <E> void printMax(E max)
    {
        System.out.println("Maximum value is " + max);
    }

}
