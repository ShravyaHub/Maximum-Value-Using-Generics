package com.bridgelabz;

import java.util.Arrays;

public class MaximumValueTest<E extends Comparable<E>> {

    E value1 , value2 , value3 ;

    public MaximumValueTest(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    public E testMaximum()
    {
        return (E) MaximumValueTest.maximumValue(value1, value2, value3);
    }

    public static <E extends Comparable<E>> E maximumValue(E value1, E value2, E value3) {
        E maximumValue = value1;
        if(value2.compareTo(maximumValue) > 0) {
            maximumValue = value2;
        }
        if((value3).compareTo(maximumValue) > 0) {
            maximumValue = value3;
        }
        return maximumValue;
    }

    public static <E extends Comparable<E>> E maximumForMoreThanThreeValues(E... values) {
        Arrays.sort(values);
        printMax(values[values.length-1]);
        return values[values.length-1];
    }

    public static < E > void printMax(E max)
    {
        System.out.println("maximum value is " + max);
    }

    public static void main(String[] args) {
        maximumForMoreThanThreeValues(12, 2, 34, 21);
        maximumForMoreThanThreeValues(4f, 3f, 7f, 5f);
        maximumForMoreThanThreeValues("Yellow", "Blue", "Red", "Purple");
    }

}
