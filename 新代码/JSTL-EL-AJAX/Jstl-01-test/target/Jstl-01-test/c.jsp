<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/2/23
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//1.值为null值的时候,为空
    request.setAttribute("emptyNull",null);
//2.值为空串的时候
    request.setAttribute("emptystr","");
%>

${empty emptyNull}
${empty emptystr}
${12==13 ? "机阿里山扩大" : "ajsldj"}
</body>
</html>
