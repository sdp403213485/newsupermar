package com.supermarket;

public class IntegralCalculate {


    public int calculate(User user, int i) {
        user.setIntegral(i);
        int intergral=user.getIntegral();
        return intergral ;
    }
}
