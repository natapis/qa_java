package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void getKittensTest(){
        try {
            Lion lion = new Lion("Самка", feline);
            Mockito.when(feline.getKittens()).thenReturn(1);
            int actualResult = lion.getKittens();
            int expectedResult = 1;
            Assert.assertEquals(expectedResult,actualResult);
        } catch (Exception e) {System.out.println(e);}
    }

    @Test
    public void getFoodTest(){
        try{
            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> actualResult = lion.getFood();
            List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expectedResult,actualResult);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
