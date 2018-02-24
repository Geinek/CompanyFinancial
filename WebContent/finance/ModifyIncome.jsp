<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>  
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
<!-- Popup -->
<div id="Popup">

<!-- SubPopup -->
<div id="SubPopup">
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
<div class="form_boxC">
<p><s:text name="income.title"/></p>
<s:form action="modifyIncome" namespace="/finance" method="post" enctype="multipart/form-data">

<table cellpadding="0" cellspacing="0">
<tr>

<td>

<s:select name="iv.dv.dep_id" key="income.dept" list="departmentList" listKey="dep_id" listValue="dname"></s:select>

</td>
</tr>
<tr>
<td><s:textfield  name="iv.i_id" key="income.no" value="%{#parameters.id}"  readonly="true"></s:textfield></td>
</tr>
<tr>
<td><s:textfield  name="iv.income" key="income.income" value="%{#parameters.income}"></s:textfield></td>
</tr>
<tr>
<td><s:textfield  name="iv.purpose" key="income.purpose" value="%{#parameters.purpose}"></s:textfield></td>
</tr>
<tr>
<td><s:radio  name="iv.type" list="typeList" key="income.type" value="%{#parameters.type}"></s:radio></td>
</tr>
<tr>
<td><s:select name="iv.year" key="income.year" list="#{'2000':'2000','2001':'2001','2002':'2002','2003':'2003','2004':'2004','2005':'2005','2006':'2006','2007':'2007','2008':'2008','2009':'2009','2010':'2010','2011':'2011','2012':'2012','2013':'2013','2014':'2014','2015':'2015','2016':'2016','2017':'2017'}" headerValue="请选择年份" value="%{#parameters.year}"></s:select></td>
</tr>
<tr>
<td><s:select name="iv.month" key="income.month" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7','8':'8','9':'9','10':'10','11':'11','12':'12'}" headerValue="请选择月份" value="%{#parameters.month}"></s:select></td>
</tr>
</table>
<div id="BtmBtn">
<div class="btn_box floatR"><s:submit value="提交"></s:submit></div>
</div>
</s:form>
</div>
</div>
<!-- SubPopup -->


</div>
<!-- /Popup -->
<%@ include file="../include/footer.jsp" %> 
</body>
</html>