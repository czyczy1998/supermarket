package com.neuedu.model;

public class Cart {
private int cartid;
private int userid;
private int num;
private int goodsid;
private double price;
private String pic;
private String goodsname;
private String username;
public int getCartid() {
	return cartid;
}
public void setCartid(int cartid) {
	this.cartid = cartid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}

public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public int getGoodsid() {
	return goodsid;
}
public void setGoodsid(int goodsid) {
	this.goodsid = goodsid;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public String getGoodsname() {
	return goodsname;
}
public void setGoodsname(String goodsname) {
	this.goodsname = goodsname;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "Cart [cartid=" + cartid + ", userid=" + userid + ", num=" + num + ", goodsid=" + goodsid + ", price="
			+ price + ", pic=" + pic + ", goodsname=" + goodsname + ", username=" + username + "]";
}


}
