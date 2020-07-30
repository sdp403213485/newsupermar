package com.supermarket;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegralCalculateTest {
    @Test
    public void should_return_100_when_IntegralCalculate_given_cost_100_UserId_1() {
        //given
        User user = new User(1);
        IntegralCalculate integralCalculate = new IntegralCalculate();

        //when
        int integral = integralCalculate.calculate(user,100);

        //then
        assertEquals(100,integral);
    }

    @Test
    public void should_return_100_when_IntegralCalculate_given_cost_list_UserId_1() {
        //given
        Goods goods1 = new Goods( GoodsName.APPLE, 10);
        Goods goods2 = new Goods( GoodsName.WATERMELON, 30);
        Goods goods3 = new Goods( GoodsName.OTHER, 20);
        User user = new User(1);
        IntegralCalculate integralCalculate = new IntegralCalculate();
        List<Goods> shoppingList = Arrays.asList(goods1,goods2,goods3);

        //when
        int integral = integralCalculate.calculate(user,shoppingList);

        //then
        assertEquals(100,integral);
    }



}
