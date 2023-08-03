package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;
    @Test
    public void eatMeatTest(){
        try{
            List<String> actualResult = feline.eatMeat();
            List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expectedResult,actualResult);
        } catch (Exception e){
            System.out.println(e);
        }

    }

    @Test
    public void getFamilyTest(){
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(feline.getKittens(), feline.getKittens(1));
    }

}
