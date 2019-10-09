package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.UserMapper;
import com.neuedu.model.Cart;
import com.neuedu.model.Goods;
import com.neuedu.model.User;
import com.neuedu.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	
	public boolean checkUsername(String username) {
		User u = userMapper.getUserByUname(username);
		if(u != null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean regist(User user) {
		int flag = userMapper.save(user);
		if(flag > 0) {
			return true;
		}		
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		
		User u=userMapper.getPassByUname(username, password);
		
		if(u!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Cart> getallcart(String username) {
		// TODO Auto-generated method stub
		return userMapper.getcart(username);
	}

	@Override
	public List<Goods> getgoods() {
		// TODO Auto-generated method stub
		return userMapper.getgoods();
	}

	@Override
	public Goods getgoodsbyid(String sid) {
		// TODO Auto-generated method stub
		return userMapper.getgoodsbyid(sid);
	}

	@Override
	public boolean addcart(Cart cart) {
		// TODO Auto-generated method stub
		int flag= userMapper.savecart(cart);
		if(flag > 0) {
			return true;
		}		
		return false;
	}

	@Override
	public boolean deletecart(String sid, String username) {
		int flag= userMapper.deletecartbyid(sid, username);
		if(flag > 0) {
			return true;
		}		
		return false;
	}

	
}
