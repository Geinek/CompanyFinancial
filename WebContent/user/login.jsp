<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>lOGIN</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Plans & Pricing Tables Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!--web-fonts-->
<link href='//fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700' rel='stylesheet' type='text/css'>
</head>
<body>


<div class="main">
				<div class="login">
					<div class="login-top">
						<img src="../images/p.png">
					</div>
					<h1>Portal Login</h1>
					<div class="login-bottom">
					
					<s:form action="login" namespace="/user" method="post" enctype="multipart/form-data" >
						<input name="username" type="text" placeholder="Username" required=" ">		<s:fielderror fieldName="username"/> 			
						<input name="password" type="password" class="password" placeholder="Password" required=" ">	<s:fielderror fieldName="password"/> 					
						<input type="submit" value="login">
					</s:form>
						</br>
						<a href="http://localhost:8080/CompanyFinancial/user/register.jsp"><input type="submit" value="register"></a>
						
				

					</div>
				</div>
			</div>
		<div class="footer">
			<p>&copy 2015 Flat Portal Login Form . All rights reserved | Design by <a href="http://w3layouts.com">W3layouts.</a></p>
		</div>


</body>
</html>