package com.xi.dao;


import org.apache.ibatis.annotations.Param;

import com.xi.bean.User;

public interface IUserDao {
	User selectUser(@Param("name")String name,@Param("password") String password);
}
