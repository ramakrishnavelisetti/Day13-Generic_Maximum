package com.bdlz.generics.generics;

import com.bdlz.generics.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaxmimumTest {

    @Test
    public void ggivenmorethen3Integers_WhenGetMaximum_ShouldReturnCorrectValue1() {
        Integer[] inputarray = { 1, 2, 3, 4, 5 };
        int finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals(5, finalResult);
        System.out.println(finalResult);
    }

    @Test
    public void givenmorethen3Integers_WhenGetMaximum_ShouldReturnCorrectValue2() {
        Integer[] inputarray = { 63, 71, 84, 96 ,59};
        int finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals(96, finalResult);
        System.out.println(finalResult);
    }

    @Test
    public void givenmorethen3Integers_WhenGetMaximum_ShouldReturnCorrectValue3() {
        Integer[] inputarray = { 876, 394, 675, 942, 239, 596 };
        int finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals(942, finalResult);
        System.out.println(finalResult);
    }

    @Test
    public void givenmorethen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        Float[] inputarray = { 2.9f, 9.1f, 8.3f, 4.6f, 3.7f};
        float finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals(9.1f, finalResult, 0.0);
        System.out.println(finalResult);

    }

    @Test
    public void givenmorethen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        Float[] inputarray = { 10.12f, 24.56f, 53.2f, 67.2f, 55.7f };
        float finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals(67.2f, finalResult, 0.0);
        System.out.println(finalResult);
    }

    @Test
    public void givenmorethen3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        Float[] inputarray = { 369.4f, 473.5f, 161.9f, 892.4f, 781.6f };
        float finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals(892.4f, finalResult, 0.0);
        System.out.println(finalResult);
    }

    @Test
    public void givenmorethen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
        String[] inputarray = { "Peach", "Apple", "Banana", "Mango", "Grape" };
        String finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals("Peach", finalResult);
        System.out.println(finalResult);

    }

    @Test
    public void givenmorethen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
        String[] inputarray = { "Grape", "Peach", "Mango", "Apple", "Banana" };
        String finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals("Peach", finalResult);
        System.out.println(finalResult);
    }

    @Test
    public void givenmorethen3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
        String[] inputarray = { "Mango", "Peach", "Apple", "Grape", "Banana" };
        String finalResult = Maximum.findMaximum(inputarray);
        Assert.assertEquals("Peach", finalResult);
        System.out.println(finalResult);
    }
}

