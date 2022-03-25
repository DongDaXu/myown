<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/23
  Time: 11:01
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
    request.setAttribute("arr",new String[]{"1564534","54534564","74545454"});
%>
<c:forEach items="${requestScope.arr}" var="arr">
<h3>${arr}</h3>
</c:forEach>
<%
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("key1","value1");
    map.put("key2","value2");
    map.put("key3","value3");
    request.setAttribute("map",map);
%>
<c:forEach items="${requestScope.map}" var="aaa">
    <h3>${aaa.value}</h3>
</c:forEach>
</body>
</html>
