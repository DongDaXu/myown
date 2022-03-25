<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Ajax</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"/>
<script type="text/javascript">
    function a2(){
        $.ajax({
            url:"${pageContext.request.contextPath}/ajax/a1",
            data:{'name':$("#txtName").val()},
            success:function (data,status){
                alert(data);
                alert(status);
            }
        });
    }
</script>
<body>
<input type="text" id="txtName" onblur="a2()">
</body>
</html>
