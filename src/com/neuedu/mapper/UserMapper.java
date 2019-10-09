package com.neuedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.model.Cart;
import com.neuedu.model.Goods;
import com.neuedu.model.User;

public interface UserMapper {
public User getUserByUname(@Param("username")String username);

public int save(User user);

public User getPassByUname(@Param("username")String username,@Param("password")String password);

public List<Cart> getcart(String username) ;
public List<Goods> getgoods();
public int deletecartbyid(String sid,String username);
public int savecart(Cart cart);
public Goods getgoodsbyid(String sid);
}
