
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<jsp:useBean id="people" scope="page" class="com.kuang.People"/>
<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="name" value="2"/>
<jsp:setProperty name="people" property="address" value="3"/>
<hr>
id：<jsp:getProperty name="people" property="id"/>
姓名：<jsp:getProperty name="people" property="name"/>
地址：<jsp:getProperty name="people" property="address"/>
</body>
</html>
