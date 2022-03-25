<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/3/1
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>全局刷新</title>
  </head>
  <body>
 <form action="${pageContext.request.contextPath}/bp" method="get">
   姓名：<input type="text" name="name"><br>
   体重<input type="text" name="w"><br>
   身高<input type="text" name="h"><br>
   <input type="submit" value="提交">
 </form>
  </body>
</html>
