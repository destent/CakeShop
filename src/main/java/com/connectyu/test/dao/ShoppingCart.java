package com.connectyu.test.dao;

import java.util.ArrayList;
import java.util.List;

import com.connectyu.test.model.Goods;
import com.connectyu.test.model.Item;

public class ShoppingCart {
	//购物车书本的条目
	private List<Item> items=new ArrayList<Item>();
	//购物车所有商品的总价格
	private double sumMoney;
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	//获取购物车所有商品的总价格
	public double getSumMoney() {
		//首先将当前属性sumMoney的值清空
		sumMoney=0;
		//将每个条目中对应的价格加起来等于购物车商品的总价格
		for (int i=0;i<this.items.size();i++) {
			Item item =items.get(i);
			sumMoney=sumMoney+item.getItemMoney();
			
		}
		return sumMoney;
	}
	
	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}
	/**
	 * 功能：向购物车添加商品
	 * @param goods
	 */
	
	public void AddProduct(Goods goods) {
		boolean flag=false;
		for (int i=0;i<this.items.size();i++) {
			Item item =items.get(i);
			//如果购物车中存在相同的商品。将商品的数量+1，该种商品对象的总价格修改为最新价格
			if (item.getGoods().getId()==goods.getId()) {
				item.setNumber(item.getNumber()+1);
				item.setItemMoney(item.getNumber()*goods.getPrice());
				flag =true;
				break;
			}
		}
		//如果新买的商品在购物车中存在不存在，添加一个商品条目信息
		if (flag==false) {
			Item item=new Item();
			//原来items的长度+1作为新的条目ID
			item.setId(this.items.size()+1);
			item.setGoods(goods);
			item.setNumber(1);
			item.setItemMoney(goods.getPrice()*1);
			this.items.add(item);
		}
			
		}
		
	/**
	 * 功能：从购物车移除商品
	 * @param goods
	 */
	
	public void removeProduct(Goods goods) {
		boolean flag=false;
		for (int i=0;i<this.items.size();i++) {
			Item item=items.get(i);
			if (item.getGoods().getId()==goods.getId()) {
				this.items.remove(item);
				flag =true;
				break;
			}
		}
		//更新各个条目编号
		if (flag==true) {//需要重新更新条目的编号
			int n=1;//条目编号从1开始
			for (Item item:this.items) {
				item.setId(n++);
				
			}
			
		}
		
	}


	/**
	 *  功能：修改購物車产品的数量
	 * @param goods 需要更新的产品
	 * @param number +1(添加1个删除)，或者-1 (移除1个)
	 */
	public void updateProductNumber(Goods goods,int number) {
		for (int i=0;i<this.items.size();i++) {
			Item item=items.get(i);
			if (item.getGoods().getId()==goods.getId()) {
				//产品的新数量=原来的数量+number(number的值为+1，或者-1)
				int pnum=item.getNumber()+number;
				if(pnum<=0){
					removeProduct(goods);
					return;
				}
				item.setNumber(pnum);
				item.setItemMoney(item.getNumber()*goods.getPrice());
				break;
			}
		}
		
	}

}
