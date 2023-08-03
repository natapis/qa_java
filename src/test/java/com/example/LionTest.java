package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.List;


public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void getKittensTest(){
        try {
            Lion lion = new Lion("Самка", feline);
            Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(1);
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
            List<String> expectedResult = lion.getFood();
            List<String> actualResult = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expectedResult,actualResult);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
