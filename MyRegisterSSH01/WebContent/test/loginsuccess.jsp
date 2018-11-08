<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<s:if test="#loginresult=='case1'">
   <h1>用户名和密码正确，欢迎欢迎！</h1>
</s:if>
<s:elseif test="#loginresult=='case2'">
   <h1>用户名正确，密码不正确，请重新输入密码！</h1>
</s:elseif>
<s:else>
 <h1>没有此用户名，请注册！</h1>
</s:else>

</body>
</html>