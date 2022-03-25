<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <script>
        var userList=new Array();
        userList.push({username:"张三",age:18});
        userList.push({username:"王五",age:20});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/quick15",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        });
    </script>
</head>
<body>

</body>
</html>
