<%--
  Created by IntelliJ IDEA.
  User: 董晓轩
  Date: 2022/3/7
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
</head>
<body>
<script type="text/javascript">
    $(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/quick25",
            type:"GET",
            success:function (result){
                $("<h1></h1>").append(result.username).appendTo("#div_a")
            }
        })
    });
</script>
<div id="div_a"><span></span></div>
</body>
</html>
