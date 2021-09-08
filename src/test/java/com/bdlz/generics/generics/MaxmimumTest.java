package com.bdlz.generics.generics;

import com.bdlz.generics.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaxmimumTest {
    @Test
    public void floatMax_AtFirstPosition() {
        float actualResult = Maximum.findMaximum(8.2f,2.4f,6.1f);
        Assert.assertEquals(8.2f,actualResult,0.0);
    }
    @Test
    public void floatMax_AtSecondPosition() {
        float actualResult = Maximum.findMaximum(2.4f,8.2f,6.1f);
        Assert.assertEquals(8.2f,actualResult,0.0);
    }
    @Test
    public void floatMax_AtThirdPosition() {
        float actualResult = Maximum.findMaximum(2.4f,6.1f,8.2f);
        Assert.assertEquals(8.2f,actualResult,0.0);
    }
}

