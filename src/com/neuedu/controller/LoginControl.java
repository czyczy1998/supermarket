package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.model.Cart;
import com.neuedu.model.Goods;
import com.neuedu.service.UserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@Controller
@RequestMapping(value = "/user")
public class LoginControl {
	@Autowired
	private UserService userService;
    
    @RequestMapping("/login")

    public String dologin(@RequestParam("username") String username , @RequestParam("password") String password,HttpServletRequest req) {
    	
    	boolean login = userService.login(username.substring(0,username.length()-1), password);
		if(!login) { //登录失败
		return "error";
		}
		//登录成功
		HttpSession session = req.getSession();
		session.setAttribute("username", username.substring(0,username.length()-1));
		String string= (String)session.getAttribute("username");
		System.out.println(username);
        return "index";
    }
  
    @RequestMapping("/delete")
    public String deletecart(@RequestParam("sid") String sid,HttpSession session) {
    	String username=(String)session.getAttribute("username");
    	userService.deletecart(sid, username);
    	return "redirect://user/cart";
    }
    @RequestMapping("/cartadd")
    public String addcart(HttpSession session) {
    	String sid=(String)session.getAttribute("sid");
		Goods gos=userService.getgoodsbyid(sid);
		String username=(String)session.getAttribute("username");
		Cart cart=new Cart();
		cart.setUsername(username);
		cart.setNum(1);
		cart.setGoodsid(gos.getGoodsid());
		cart.setPic(gos.getTinypic());
		cart.setPrice(gos.getGoodsprice());
		cart.setGoodsname(gos.getGoodsname());
		userService.addcart(cart);
		
		
		return "redirect://user/cart";
    	
    	
    }
    @RequestMapping("/dingdan")
    public String dingdan(HttpSession session,Model m) {
String username=(String)session.getAttribute("username");
		
		//调用service
		
		List<Cart> cart1=userService.getallcart(username);
		
		// ModelAndView modelAndView = new ModelAndView("cartes");  
	     //modelAndView.addObject("cartes", cart1);  
		m.addAttribute("cartes", cart1);
    	
    	return "dingdanzhongxin";
    	
    }
}