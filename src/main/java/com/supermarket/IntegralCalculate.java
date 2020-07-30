package com.supermarket;

import java.util.Arrays;
import java.util.List;

public class IntegralCalculate {
    private List<GoodsName> PromotionalGoods = Arrays.asList(GoodsName.APPLE, GoodsName.BEEF, GoodsName.COLDBOX, GoodsName.TV, GoodsName.WATERMELON);

    public int calculate(User user, int i) {
        user.setIntegral(i);
        int intergral=user.getIntegral();
        return intergral ;
    }

    public int calculate(User user, List<Goods> shoppingList) {
        int Integral = 0;
        for (Goods goods:shoppingList){
            if (PromotionalGoods.contains(goods.getGoodsName())){
                Integral += goods.getPrice() * 2;
            }else {
                Integral += goods.getPrice();
            }
            user.setIntegral(Integral);
        }
        return user.getIntegral();
    }

}
