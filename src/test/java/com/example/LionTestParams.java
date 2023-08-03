package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)

public class LionTestParams {
    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Mock
    Feline feline;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters
    public static Object [][] params(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Test", null},
        };
    }
    @Test
    public void doesHaveManeTest(){
        try{
            Lion lion = new Lion(sex, feline);
            boolean actualResult = lion.doesHaveMane();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
