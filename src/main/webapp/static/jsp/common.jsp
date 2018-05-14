<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 引入项目路径 -->
 <%
	String path= request.getContextPath();//项目名称
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公共的jsp</title>

<base href="<%=basePath%>">

<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/layer/css/layui.css">
<script tyep="text/javascript" src="<%=basePath%>/static/layer/layui.js"></script>  
<script type="text/javascript" src="<%=basePath%>/static/js/commosjs/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/commosjs/jquery.json-2.4.js"></script>
</head>
<body>
	<%-- <h1>这个公共的页面<%=basePath%></h1> --%>
</body>
</html>
</html>