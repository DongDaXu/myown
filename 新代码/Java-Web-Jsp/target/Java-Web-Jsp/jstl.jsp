<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入核心标签库我们才能拿来使用--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>if测试</h4>
<form action="" method="get">
<%--获取表单中的数据--%>
<%--${param.参数名}}--%>
    <hr>
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
    <hr>
    <c:if test="${param.username=='admin'}" var="isAdmin">
        <c:out value="管理员欢迎您"></c:out>
    </c:if>
    <c:out value="${isAdmin}"></c:out>
</form>
</body>
</html>
