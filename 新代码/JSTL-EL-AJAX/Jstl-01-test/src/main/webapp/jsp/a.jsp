<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/23
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
保存前:${requestScope.abc}
<c:set scope="request" var="abc" value="abcVallue"/>
保存后:${requestScope.abc}
<c:if test="${12==11}">
    <h1>为真</h1>
</c:if>
</body>
</html>
