<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<script type="text/javascript" src="../js/jquery-1.7.2.js"/>
<head>
    <title>ajax</title>
</head>
<script type="text/javascript">
   document.getElementById("btn").onclick=function (){
       $.ajax(
           {
               url:"${pageContext.request.contextPath}/province/province01",
               data:{"name":$("#one").val},
               success:function (data){
                   console.log(data);
                   console.log(status)
               }
           }
       )
   }
</script>
<body>
请输入数字<input type="text" name="one" id="one">
        <input type="button" id="btn" value="提交">
<div id="two">
    结果是
</div>
</body>
</html>
