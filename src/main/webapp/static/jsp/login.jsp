<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ include file="common.jsp" %> 
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>登陆页面</title>
<base href="<%=basePath%>">

<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/login.css">
<script type="text/javascript" src="<%=basePath%>/static/js/login.js"></script>

</head>
<body>

	<div>
		<from class="layui-form" action="">
			<div class="layui-inline">
				<label class="layui-form-label">验证手机</label>
				<div class="layui-input-inline">
					<input type="tel" name="phone" lay-verify="required|phone"
						autocomplete="off" class="layui-input">
				</div>
			</div>
			</br>
			<div class="layui-inline">
				<label class="layui-form-label">验证邮箱</label>
				<div class="layui-input-inline">
					<input type="text" name="email" lay-verify="email"
						autocomplete="off" class="layui-input">
				</div>
			</div>
			</br>
			<div class="layui-inline">
				<label class="layui-form-label">密码</label>
				<div class="layui-input-inline">
					<input type="password" name="password" placeholder="请输入密码"
						autocomplete="off" class="layui-input">
				</div>		
			</div>
	
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
				</div>
			</div>
			
		</from>
	</div>
</body>
</html>