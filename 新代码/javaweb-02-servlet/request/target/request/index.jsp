<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div style="text-align: center">
<%--这里表单的意思是：以post方式提交表单，提交到我们的login请求--%>
    <form action="${pageContext.request.contextPath}/reque" method="get">
        用户名：<input type="text" name="username"><br>~
        密码: <input type="password" name="password"><br>
        <input type="checkbox" name="hobby" value="1">1
        <input type="checkbox" name="hobby" value="2">2
        <input type="checkbox" name="hobby" value="3">3
        <input type="checkbox" name="hobby" value="4">4
        <br>
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>
