<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<div class="wrap_left" id="frmTitle" name="fmTitle">
<!-- Logo -->
<div id="Logo"><span>人单合一</span></div>
<!-- /Logo -->

<!-- menu_list -->
<script>
$(function() {
    $(".menu_list dd");
    $(".menu_list dt").click(function(){
        $(this).toggleClass("open").next().slideToggle("fast");
    });
});
</script>
<div class="menu_list">
<dl>
<dt><span>部门管理</span></dt>
<dd><a href="http://localhost:8080/CompanyFinancial/department/AddDepartment.jsp" title="二级分类">添加部门</a>
<a href="http://localhost:8080/CompanyFinancial/department/tolist.action" title="二级分类">部门列表</a></dd>

<dt><span>负责人管理</span></dt>
<dd><a href="http://localhost:8080/CompanyFinancial/manager/toManager.action" title="二级分类">添加负责人</a>
<a href="http://localhost:8080/CompanyFinancial/manager/listManager.action" title="二级分类">负责人列表</a></dd>

<dt><span>收入管理</span></dt>
<dd><a href="http://localhost:8080/CompanyFinancial/finance/toIncome.action" title="二级分类">添加收入信息</a>
<a href="http://localhost:8080/CompanyFinancial/finance/listIncome.action" title="二级分类">收入列表</a></dd>

<dt><span>支出管理</span></dt>
<dd><a href="http://localhost:8080/CompanyFinancial/finance/toExepend.action" title="二级分类">添加支出信息</a>
<a href="http://localhost:8080/CompanyFinancial/finance/listExepend.action" title="二级分类">支出列表</a></dd>

</div>
<!-- /menu_list -->
</div>
<!-- /wrap_left -->

<!-- picBox -->
<div class="picBox" onclick="switchSysBar()" id="switchPoint"></div>
<!-- /picBox -->


</body>
</html>