package com.kabank.mvc.domain;

import lombok.Data;

@Data
public class FoodBean {
	private String menu,price,count;

	@Override
	public String toString() {
		return "메뉴[상품명=" + menu + ", 가격=" + price + "원, 수량=" + count + "]";
	}
	
}
