package com.supermarket;

public class Goods {
    private GoodsName goodsName;
    private int price;

    public Goods(GoodsName goodsName, int i) {
        this.goodsName = goodsName;
        this.price = i;
    }


    public GoodsName getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(GoodsName goodsName) {
        this.goodsName = goodsName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
