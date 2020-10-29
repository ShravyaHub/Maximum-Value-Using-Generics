package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        return values[values.length-1];
    }

}
