<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
        <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.7.2.min.js"></script>
		<title>用户注册</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">

	</head>
	<body>
		<form  method="post" action="${pageContext.request.contextPath }//user/regist">
		<div class="regist">
			<div class="regist_center">
				<div class="regist_top">
					<div class="left fl">会员注册</div>
					<div class="right fr"><a href="./index.html" target="_self">小米商城</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				
		用户名：<input type="text" name="username" id="username" /> <span id="usernamespan"></span><br />
		密码： <input type="password" name="password" /> <br />
		确认密码：<input type="password"  name="password" value=${password}/> <br />
		手机号： <input type="text" name="phone" />  <br />
		邮箱： <input type="email" name="email" /> 		 <br />	
		<input type="submit" value="立即注册"/>
	
				
			</div>
		</div>
		</form>
		<script type="text/javascript">
$(function(){
	$('#username').change(function(){
		var username = $('#username').val();
		
		$.post(
			'${pageContext.request.contextPath }//user/checkUsername',
			{"username":username},
			function(data){
				
				$('#usernamespan').text(data);
			}
		);
	});
})
</script>
	</body>
</html>