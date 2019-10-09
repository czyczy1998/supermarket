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
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.model.Cart;
import com.neuedu.model.Goods;
import com.neuedu.model.User;
import com.neuedu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/showRegist")
	public String showRegist() {
		return "regist";
	}
	
	@RequestMapping("/checkUsername")
	@ResponseBody
	public String checkUsername(@RequestParam("username")String username,HttpServletResponse response) {
	
		boolean flag = userService.checkUsername(username);
		if(flag) {
			return "ok";
		}
		
		return "error";
	}
	
	@RequestMapping("/regist")
	public String regist(User user,HttpServletRequest req) {

		boolean flag = userService.regist(user);
		if(flag) {
			HttpSession session = req.getSession();
			session.setAttribute("username",user.getUsername());
			return "index";
		}
		
		return FAIL;
		
	}
	@RequestMapping("/cart")
	public String cart(HttpSession session,Model m) {
		double sum=0;
		int totalnum=0;
		String username=(String)session.getAttribute("username");
		
		//µ÷ÓÃservice
		
		List<Cart> cart1=userService.getallcart(username);
		
		// ModelAndView modelAndView = new ModelAndView("cartes");  
	     //modelAndView.addObject("cartes", cart1);  
		m.addAttribute("cartes", cart1);
		for(int i=0;i<cart1.size();i++)
			{sum+=cart1.get(i).getPrice()*cart1.get(i).getNum();
			totalnum+=cart1.get(i).getNum();
					}
		System.out.println(totalnum);
		m.addAttribute("sum", sum);
		m.addAttribute("totalnum", totalnum);
		return "cart";
		
	}
	@RequestMapping("/liebiao")
	public String showliebiao(Model m) {
	List<Goods> ga=userService.getgoods();
	m.addAttribute("goodes", ga);
		
		return "liebiao";
		
	}
	
	@RequestMapping("/xiangqing")
	public String showxiangqing(Model m,@RequestParam("sid") String sid,HttpServletRequest req) {
	Goods goods=userService.getgoodsbyid(sid);
	HttpSession session = req.getSession();
	session.setAttribute("sid",sid);
	m.addAttribute("good", goods);
		
		
		
		return "xiangqing";
		
	}
}