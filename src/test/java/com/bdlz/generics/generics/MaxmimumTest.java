package com.bdlz.generics.generics;

import com.bdlz.generics.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaxmimumTest {
    @Test
    public void integerMax_AtFirstPosition() {
        int actualResult = Maximum.findMaximum(9,3,7);
        Assert.assertEquals(9,actualResult);
    }

    @Test
    public void integerMax_AtSecondPosition() {
        int actualResult = Maximum.findMaximum(3,9,7);
        Assert.assertEquals(9,actualResult);
    }
}

