<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--设置参数--%>
<jsp:forward page="jsp02.jsp">
    <jsp:param name="name" value="kuangshen"/>
    <jsp:param name="user" value="123"/>
</jsp:forward>

</body>
</html>
