<%@ page import="com.dong.pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/23
  Time: 11:11
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
    Student student=new Student();
    List<Student> studentList=new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        studentList.add(new Student(i,"ad","asljd",20,"alsjd"));
    }
        request.setAttribute("stus",studentList);
%>
<table border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>学号</th>
        <th>年龄</th>
        <th>电话</th>
    </tr>
        <c:forEach items="${requestScope.stus}" var="stu">
    <tr>
        <td>${stu.id}</td>
        <td>${stu.name}</td>
        <td>${stu.pwd}</td>
        <td>${stu.age}</td>
        <td>${stu.phone}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
