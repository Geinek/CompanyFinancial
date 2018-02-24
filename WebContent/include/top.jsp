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
<header>
<!-- Header -->
<div id="Header">
<!-- Head -->
<div id="Head">
<img src="http://localhost:8080/CompanyFinancial/user/photoshow.action?username=${user.username}" height=50px width=50px align="right"/>
<script language="javascript">
function showmenu(id){id.style.visibility = "visible";}


</script>
<div class="user"><a href="javascript:showmenu(UserList)">${user.username}</a>
<div id="UserList"></a>
<a href="http://localhost:8080/CompanyFinancial/user/logout.action">注销</a></div>
</div>
</div>
<!-- /Head -->
<nav>
<ul id="Navi">
<li><a href="http://localhost:8080/CompanyFinancial/home/home.jsp"><img src="../images/common/navi01.png" width="30" height="36" alt="主页管理"><span>主页</span></a></li>
<li><a href="http://localhost:8080/CompanyFinancial/department/tolist.action"><img src="../images/common/navi02.png" width="36" height="36" alt="系统管理"><span>部门信息</span></a></li>
<li><a href="http://localhost:8080/CompanyFinancial/manager/listManager.action"><img src="../images/common/navi03.png" width="26" height="36" alt="合同信息"><span>负责人信息</span></a></li>
<li><a href="http://localhost:8080/CompanyFinancial/finance/tomainIncome.action"><img src="../images/common/navi04.png" width="34" height="36" alt="基础数据"><span>收入信息</span></a></li>
<li><a href="http://localhost:8080/CompanyFinancial/finance/tomainExepend.action"><img src="../images/common/navi05.png" width="24" height="36" alt="预算管理"><span>支出信息</span></a></li>
<li><a href="http://localhost:8080/CompanyFinancial/finance/SearchIncome.jsp"><img src="../images/common/navi06.png" width="36" height="36" alt="项目管理"><span>收入查询</span></a></li>
<li><a href="http://localhost:8080/CompanyFinancial/finance/SearchExepend.jsp"><img src="../images/common/navi07.png" width="34" height="36" alt="资金支付-发票"><span>支出查询</span></a></li>
<li><a href="http://localhost:8080/CompanyFinancial/finance/analysis.jsp"><img src="../images/common/navi08.png" width="34" height="36" alt="产品管理信息"><span>信息统计</span></a></li>
</ul>
</nav>
</div>
<!-- /Header -->
</header>
</body>
</html>