<%@ page language="java" contentType="text/html"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/common.css">
<script type="text/javascript" src="resources/js/myjs.js"></script>
</head>
<body>
<div class="head" >
	<img alt="头部图片" src="resources/imgs/head.jpg"  id="headimg">
	<h1>欢迎使用</h1>
</div>
<div class="content">
	
<form action="${pageContext.request.contextPath }/login.do" method="post">
<!-- 表单参数名与实体类属性名一致 -->
	姓名：<input type="text"  name="name"/></br>
	<p id="text1"></p>
	密码：<input type="password"  name="password" /></br>
	<p id="text2"></p>

	<div class="myButton">
	<input type="submit"  value="登录" class="signup-button"/>&nbsp &nbsp
	<input type="button"  value="注册" class="signup-button" id="bt_reg" 
		onclick="gotoRegister()" />
	</div>
</form>
</div>

</body>
</html>