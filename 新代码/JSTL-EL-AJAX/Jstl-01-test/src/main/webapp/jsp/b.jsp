<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/23
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("height",178);
%>
<c:choose>
    <c:when test="${requestScope.height >190}">
        <h2>小巨人</h2>
    </c:when>
    <c:when test="${requestScope.height >180}">
        <h2>中巨人</h2>
    </c:when>
    <c:when test="${requestScope.height >170}">
        <h2>大巨人</h2>
    </c:when>
    <c:otherwise>
        <h2>剩下的都在170左右</h2>
    </c:otherwise>
</c:choose>

<c:forEach begin="1" end="10" var="i">
    ${ i }
</c:forEach>
</body>
</html>
