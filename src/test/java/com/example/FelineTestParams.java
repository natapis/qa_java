package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class FelineTestParams {
    @Parameterized.Parameter
    public int i;
    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Object[][] params(){
        return new Object[][]{
                {2,2},
                {3,3},
        };
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int actualResult = feline.getKittens(i);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
