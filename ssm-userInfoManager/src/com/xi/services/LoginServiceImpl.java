package com.xi.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xi.bean.User;
import com.xi.dao.IUserDao;
@Service("loginService")
public class LoginServiceImpl implements ILoginService {
	@Resource(name="IUserDao")
	private IUserDao dao;
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	@Override
	@Transactional
	public boolean checkLogin(String name, String password) {
		User user = dao.selectUser(name, password);
		System.out.println(user);
		if(user!=null) {
			return true;
		}
		return false;
	}



}
