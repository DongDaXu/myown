<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/23
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key","request");
    session.setAttribute("key","session");
    application.setAttribute("key","application");
    pageContext.setAttribute("key","pagerContext");
%>
${ key }
</body>
</html>
