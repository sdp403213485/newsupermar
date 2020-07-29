package com.supermarket;

import org.junit.Test;

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
}
