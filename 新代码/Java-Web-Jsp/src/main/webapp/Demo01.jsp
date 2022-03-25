<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name1","01");
    request.setAttribute("name2","02");
    session.setAttribute("name3","03");
    application.setAttribute("name4","04");
    pageContext.forward("/Demo02.jsp");
%>
</body>
</html>
