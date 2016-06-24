package com.oldwang.person.pojo;

public class Customer {
	/**
	 * @author Administrator
	 * 客户类
	 */
	private int id;//编号
	private String name;//姓名
	private String phone;//联系方式
	private String area;//城区
	private int housetype;//意向户型
	private int floor;//意向楼层
	private int price;//价格
	private String equipment;//设施
	private String state;//状态
	//0没有目标房子    1有目标房子但未租    2已经出租
	private int usersid;//业务员
	private String date;//录入时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getHousetype() {
		return housetype;
	}
	public void setHousetype(int housetype) {
		this.housetype = housetype;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
