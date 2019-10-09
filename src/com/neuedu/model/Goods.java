package com.neuedu.model;

public class Goods {
private int goodsid;
private String goodsname;
private double goodsprice;
private String goodsdesc;
private String pic;
private String detail;
private int typeid;
private String tinypic;
public String getTinypic() {
	return tinypic;
}
public void setTinypic(String tinypic) {
	this.tinypic = tinypic;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public int getGoodsid() {
	return goodsid;
}
public void setGoodsid(int goodsid) {
	this.goodsid = goodsid;
}
public String getGoodsname() {
	return goodsname;
}
public void setGoodsname(String goodsname) {
	this.goodsname = goodsname;
}
public double getGoodsprice() {
	return goodsprice;
}
public void setGoodsprice(double goodsprice) {
	this.goodsprice = goodsprice;
}
public String getGoodsdesc() {
	return goodsdesc;
}
public void setGoodsdesc(String goodsdesc) {
	this.goodsdesc = goodsdesc;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public int getTypeid() {
	return typeid;
}
public void setTypeid(int typeid) {
	this.typeid = typeid;
}
@Override
public String toString() {
	return "Goods [goodsid=" + goodsid + ", goodsname=" + goodsname + ", goodsprice=" + goodsprice + ", goodsdesc="
			+ goodsdesc + ", pic=" + pic + ", detail=" + detail + ", typeid=" + typeid + "]";
}

}
