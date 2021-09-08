package com.bdlz.generics.generics;

import com.bdlz.generics.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaxmimumTest {
    @Test
    public void floatMax_AtFirstPosition() {
        float actualResult = Maximum.findMaximum(9.3f,3.5f,7.2f);
        Assert.assertEquals(9.3f,actualResult,0.0);
    }


}

