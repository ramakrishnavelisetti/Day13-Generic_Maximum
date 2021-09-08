package com.bdlz.generics.generics;

import com.bdlz.generics.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaxmimumTest {
    @Test
    public void intMax() {
        int actualResult = Maximum.findMaximum(9,10,5);
        Assert.assertEquals(10,actualResult);
    }
    @Test
    public void floatMax() {
        float actualResult = Maximum.findMaximum(8f,7f,12f);
        Assert.assertEquals(12f,actualResult,0.0);
    }
    @Test
    public void stringMax() {
        String actualResult = Maximum.findMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",actualResult);
    }
}

