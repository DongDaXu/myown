<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/21
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick23" method="post" enctype="multipart/form-data">
    名称:<input type="text" name="username"><br>
    文件:<input type="file" name="uploadfile"><br>
    名称:<input type="text" name="username"><br>
    文件:<input type="file" name="uploadfile"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
