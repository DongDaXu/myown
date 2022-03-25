<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/18
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick12" method="get">
用户名:<input type="text" name="username">
年龄:<input type="text" name="age">
<input type="submit" value="提交">
</form>
</body>
</html>
