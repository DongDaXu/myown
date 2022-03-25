<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/1/24
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="common/001.jsp"%>
<h1>中间页面</h1>
<%@ include file="common/002.jsp"%>
<hr>
<jsp:include page="common/001.jsp"></jsp:include>
    <h1>网页主体</h1>
<jsp:include page="common/002.jsp"></jsp:include>
</body>
</html>
