package com.github.abhilash.MathOps;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationTest {

    @Test
    public void addTest() {
        MathOperations mathOperation = new MathOperations();
        int result = mathOperation.add(3,4);
        Assert.assertEquals(7, result);
    }
}
