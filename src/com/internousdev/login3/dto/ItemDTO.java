package com.internousdev.login3.dto;

public class ItemDTO {
	private String id;
	private String item_name;
	private int cost;

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	/**
	 * @return item_name
	 */
	public String getItem_name() {
		return item_name;
	}
	/**
	 * @param item_name セットする item_name
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	/**
	 * @return cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost セットする cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

}
