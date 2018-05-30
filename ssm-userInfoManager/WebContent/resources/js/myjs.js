/*登录页跳转到注册页*/
function gotoRegister(){
	window.location.href="register.jsp";
}
/*注册页跳转到登录页*/
function gotoLogin(){
	window.location.href="login.jsp";
}
/*删除用户前再次确认*/
function sureDelete(){
	
	var msg="您确定要删除该项，注意不可恢复";
	if(confirm(msg)==true){
		return true;
	}else{
		return false;
	}
}