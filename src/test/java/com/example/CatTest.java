package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline feline;
    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest(){
        Cat cat = new Cat(feline);
        try {
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> actualResult = cat.getFood();
            List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
