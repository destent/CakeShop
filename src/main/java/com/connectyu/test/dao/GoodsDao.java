package com.connectyu.test.dao;

import com.connectyu.test.model.Goods;

import java.util.ArrayList;

public class GoodsDao {

    public ArrayList<Goods> findAllGoods(){
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        for (int i = 0; i <= 10 ; i++) {
            Goods goods=new Goods();
            goods.setId(i);
            goods.setName("草莓冰淇淋");
            goods.setImage1("picture/9-1.jpg");
            goods.setPrice(299);
            goodsList.add(goods);
        }
        return goodsList;
    }
}
