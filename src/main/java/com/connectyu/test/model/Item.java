package com.connectyu.test.model;
/**
 * @author Huangcx
 *
 */
public class Item {
	//条目的id，从1开始记录
	private int id;
	//每种产品信息
	private Goods goods;
	//每种产品的数量
	private int number;
	//每种产品的总价格
	private double itemMoney;
	//对应提供set和get方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getItemMoney() {
		return itemMoney;
	}
	public void setItemMoney(double itemMoney) {
		this.itemMoney = itemMoney;
	}
	

}
