<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<link href="../css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="../css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="../js/jquery-1.10.1.min.js"></script>
<script src="../js/side.js" type="text/javascript"></script>

<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body>
<!-- wrap_left -->
<%@ include file="../include/left.jsp" %> 




<!-- wrap_right -->
<div class="wrap_right">
<%@ include file="../include/top.jsp" %> 

<!-- Contents -->
<div id="Contents">
<script type="text/javascript">
$(function(){
$(".select").each(function(){
var s=$(this);
var z=parseInt(s.css("z-index"));
var dt=$(this).children("dt");
var dd=$(this).children("dd");
var _show=function(){dd.slideDown(200);dt.addClass("cur");s.css("z-index",z+1);};
var _hide=function(){dd.slideUp(200);dt.removeClass("cur");s.css("z-index",z);};
dt.click(function(){dd.is(":hidden")?_show():_hide();});
dd.find("a").click(function(){dt.html($(this).html());_hide();});
$("body").click(function(i){ !$(i.target).parents(".select").first().is(s) ? _hide():"";});})})
</script>
<!-- TopMain -->
<div id="MainForm">
<div class="form_boxA">
<h2>收入列表</h2>
<h2 id="PageNum"><li><a href="http://localhost:8080/CompanyFinancial/finance/toIncome.action">添加收入信息</a></li></h2>

<table cellpadding="0" cellspacing="0">
<tr>
<th>收入编号</th>
<th>部门名称</th>
<th>收入金额</th>
<th>用途</th>
<th>类别</th>
<th>年份</th>
<th>月份</th>
<th>操作</th>
</tr>

<c:forEach var="iv" items="${incomeList }">
<tr>
<td>${iv.i_id}</td>
<td>${iv.dv.dname}</td>
<td>${iv.income}&nbsp;&nbsp;&nbsp;￥</td>
<td>${iv.purpose}</td>
<td>${iv.type}</td>
<td>${iv.year}</td>
<td>${iv.month}</td>
<td><a href="http://localhost:8080/CompanyFinancial/finance/toModifyIncome.action?id=${iv.i_id}
&income=${iv.income}&purpose=${iv.purpose}&type=${iv.type}&year=${iv.year}&month=${iv.month}">修改</a> 
| <a href="http://localhost:8080/CompanyFinancial/finance/deleteIncome.action?id=${iv.i_id}">删除</a></td>
</tr>
</c:forEach>
</table>
<ul id="PageNum">
<li><a href="http://localhost:8080/CompanyFinancial/finance/tomainIncome.action?pageIndex=${pageIndex-1 }">上一页</a></li>
<li><a href="http://localhost:8080/CompanyFinancial/finance/tomainIncome.action?pageIndex=${pageIndex+1 }">下一页</a></li>
</ul>
</div>
</div>

<!-- /footer -->
<%@ include file="../include/footer.jsp" %> 
<!-- /footer -->

</div>
<!-- /wrap_right -->
</body>
</html>