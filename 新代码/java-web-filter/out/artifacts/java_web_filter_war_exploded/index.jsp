<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/1/29
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <h1><span>有<%=session.getServletContext().getAttribute("count")%>人在线</span></h1>
  </body>
</html>
