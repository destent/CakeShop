package com.connectyu.test.model;

import java.util.List;

public class Page {
    private int pageNo = 0; //当前页码
    private int pageNum; //页总数
    private List<Goods> goodsList; //商品列表
    private int goodsNum=8; //每页的商品数

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getPageNum() {
        return pageNum;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }


    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

}
