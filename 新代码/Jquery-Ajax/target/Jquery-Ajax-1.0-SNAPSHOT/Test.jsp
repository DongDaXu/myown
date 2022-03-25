<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/jquery-3.6.0.min.js"/>
<script type="text/javascript">
    function toa(){
        $.ajax({
            url:"${pageContext.request.contextPath}/a",
            type:"GET",
            data:$("#form_tt").serialize(),
            success:function (result){
               console.log(result)
            }
        })
    }
    $("#btn").click(toa())
</script>
<button id="btn">点击显示内容</button>
</body>
</html>
