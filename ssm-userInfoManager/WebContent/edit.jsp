<%@ page language="java" contentType="text/html"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/common.css">
</head>
<body>
<div class="content">
<h1>修改页面</h1>
<form action="${pageContext.request.contextPath }/updateStu.do">
	<table class="niceTable"  style="width: 60%; margin:auto">
			<tr>
				<td>ID:</td> <td ><input type="text" name="id"  readonly="readonly"  value="${stu.id }" ></td>
			</tr>
			<tr>
				<td>名字</td> <td><input name="name" value="${stu.name }" 
															placeholder="请在这里输入名字"/></td>
				
			</tr>
			<tr>
				<td>年龄</td> <td><input name="age" value="${stu.age }" 
												placeholder="请在这里输入年龄"/></td>
			</tr>
	</table>
	<input type="submit"  value="修改" />
</form>

<a href="selectAll.do">点击返回主页</a>
</div>

</body>
</html>