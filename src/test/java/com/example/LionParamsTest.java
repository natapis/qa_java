package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)

public class LionParamsTest {
    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expectedResult;

    private Lion lion;

    @Mock
    Feline feline;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "Если {0}, то {1}")
    public static Object [][] params(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    public void initLion(){
        try {
            lion = new Lion(sex, feline);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @Test
    public void doesHaveManeTest(){
        initLion();
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
