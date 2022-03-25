<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name1= (String) pageContext.findAttribute("name1");
    String name2= (String) pageContext.findAttribute("name2");
    String name3= (String) pageContext.findAttribute("name3");
    String name4= (String) pageContext.findAttribute("name4");
%>
<h1>${name1}</h1>
<h1>${name2}</h1>
<h1>${name3}</h1>
<h1>${name4}</h1>
</body>
</html>
