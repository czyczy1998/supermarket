package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Cart;
import com.neuedu.model.Goods;
import com.neuedu.model.User;

public interface UserService {
	public boolean regist(User user);
	public boolean checkUsername(String username);
	public boolean login(String username, String password);
	public List<Cart> getallcart(String username);
	public List<Goods> getgoods();
	public Goods getgoodsbyid(String sid);
	public boolean addcart(Cart cart);
	public boolean deletecart(String sid,String username);
}
