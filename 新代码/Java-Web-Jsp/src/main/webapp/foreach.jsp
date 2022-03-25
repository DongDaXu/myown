<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/1/28
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<String> people = new ArrayList<>();
    people.add(0,"张三");//注意：下标必须从0开始
    people.add(1,"李四");
    people.add(2,"王五");
    people.add(3,"赵六");
    request.setAttribute("list",people);
%>
<c:forEach var="people" items="${list}">
    <c:out value="${people}"></c:out>
</c:forEach>
</body>
</html>
