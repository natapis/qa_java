package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionExceptionParamsTest {
    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public String expectedMessage;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters
    public static Object[][] params() {
        return new Object[][]{
                {"Test", "Используйте допустимые значения пола животного - самец или самка"},
        };
    }

    @Test
    public void doesHaveManeTest() {
        try {
            Lion lion = new Lion(sex, feline);
            lion.doesHaveMane();
        } catch (Exception e) {
            Assert.assertEquals(expectedMessage, e.getMessage());
        }
    }
}
