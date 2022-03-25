<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/23
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("key1","pageContext");
    session.setAttribute("key2","session");
    application.setAttribute("key3","application");
    request.setAttribute("key4","request");
%>
${pageScope.key1}<br>
${sessionScope.key2}<br>
${applicationScope.key3}<br>
${requestScope.key4}<br>
</body>
</html>
