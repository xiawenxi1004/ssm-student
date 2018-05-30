<%@ page language="java" contentType="text/html"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/common.css">
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/myjs.js"></script>
<script>
        $(function () {
        	
                $("ul.pagination li.disabled a").click(function () {
              	  $(".li1").css("display","none"); 
              	 return false; 
               
              });
        	
         /* 	$(".li1").css("display","none"); */

        });
    </script>
</head>
<body>
<div class="content" style="height:500px">

<div class="stuTable" >
<p>学生列表 - 共${page.total}人</p>
<table class="niceTable"  style="width: 60%; margin:auto">
	<tr>
	 <th >id:</th>
	 <th >名字：</th>
	 <th>年龄：</th>
	 <th>编辑</th>
	 <th>删除</th>
	</tr>
	<c:forEach items="${students}" var="stu" varStatus="status">
	<tr>
			<td>${stu.id}</td>
		 	<td>${stu.name}</td>
            <td>${stu.age}</td>
            <td><a href="editStu.do?id=${stu.id}" >修改</a></td>

            <td><a href="deleteStu.do?id=${stu.id}" onclick="return sureDelete()">删除</a></td>
	</tr> 
	 	</c:forEach>
</table>
<a href="login.jsp">返回登录页面</a>
	</div>
	<div class="pageDIV">
		<ul class="pagination">
		  <li class="li1" <c:if test="${!page.hasPreviouse}">class="disabled"</c:if>>
			    <a href="?page.start=0">
			   <%--  <span>${!page.hasPreviouse}</span> --%>
                	<span>«</span>
          		  </a>
		  </li>
			<li class="li1" <c:if test="${!page.hasPreviouse}">class="disabled"</c:if>>
			  <a href="?page.start=${page.start-page.count}">
                <span><</span>
            </a>
			</li>
			    <c:forEach begin="0" end="${page.totalPage-1}" varStatus="status">

            <c:if test="${status.count*page.count-page.start<=30 && status.count*page.count-page.start>=-10}">
                <li <c:if test="${status.index*page.count==page.start}">class="disabled"</c:if>>
                    <a
                            href="?page.start=${status.index*page.count}"
                            <c:if test="${status.index*page.count==page.start}">class="current"</c:if>
                    >${status.count}</a>
                </li>
            </c:if>
        </c:forEach>
				  <li <c:if test="${!page.hasNext}">class="disabled"</c:if> >
                       <a href="?page.start=${page.start+page.count}">
                      <span>›</span>
                       </a>
                   </li>
      			  <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
            		<a href="?page.start=${page.last}">
               		 <span>» </span>
            		</a>
        			</li>
		</ul>
		
	</div>

</div>

</body>
</html>