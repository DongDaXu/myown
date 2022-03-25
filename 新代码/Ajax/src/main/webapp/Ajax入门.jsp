<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript">
    //1.创建Ajax对象
    var xhl = new  XMLHttpRequest();
    //2.告诉Ajax对象要向哪发送请求，以什么方式发送请求
    //open第一个参数使请求参数，第二个使请求地址
    xhr.open('get','http://localhost:8080/010/first.jsp');
    // 3.发送请求
    xhr.send('hello,Ajax');
    //4.获取服务器端响应到客户端的数据
    xhr.onload=function (){
        //xhr.responseText
        console.log(xhr.responseText);
    }
</script>
</body>
</html>
