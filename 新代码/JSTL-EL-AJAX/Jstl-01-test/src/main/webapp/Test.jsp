<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>练习</title>
</head>
<body>
<%--制造测试数据--%>
<%
request.setAttribute("key","abc");
%>
<%--Java命令读取request数据并写入到响应体中--%>
<%
String value=(String) request.getAttribute("key");
%>
Java命令写入的结果<%=value%><br>
<%--EL表达式写入的结果--%>
${requestScope.key}
</body>
</html>
