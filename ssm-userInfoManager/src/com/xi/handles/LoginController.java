package com.xi.handles;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xi.services.ILoginService;
import com.xi.services.LoginServiceImpl;
@Controller

public class LoginController {
	@Autowired
	@Qualifier("loginService")
	private ILoginService service;
	public void setService(LoginServiceImpl service) {
		this.service = service;
	}
	
	@RequestMapping("/login.do")
	public String doLogin(String password,String name,HttpSession session ,HttpServletResponse response) throws IOException  {
		
		boolean flag = service.checkLogin(name, password);
		if(flag) {
		 // return ("redirect:/selectAll.do");
			return("/selectAll.do");
		}
		return ("/login.jsp");
	}



}
