<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>局部刷新Ajax</title>
</head>
<script type="text/javascript">
    function doAjax(){
        //使用内存中的异步对象，代替浏览器发起请求。异步对象使用js创建和管理的
        //1.创建异步对象
        var xml = new XMLHttpRequest();
        //2.绑定事件
        xml.onreadystatechange=function (){
            //处理服务器返回的数据，更新当前页面
            if (xml.readyState==4&&xml.status==200){
                //alert(xml.responseText);
                var data=xml.responseText;
                //更新dom对象,更新页面数据
                document.getElementById("mydata").innerText=data;
            }
        }
        //初始请求参数
        //获取dom对象的value属性值
        var name = document.getElementById("name").value;
        var w = document.getElementById("w").value;
        var h = document.getElementById("h").value;

        var  param="name="+name+"&w="+w+"&h="+h;
        // alert(param)
        xml.open("get","bmiAjax?"+param,true)
        //发起请求
        xml.send();
    }

</script>
<body>
<div>
    <%--  没有使用form--%>
    姓名 <input type="text" id="name" name="name"><br>
    体重 <input type="text" id="w" name="w"><br>
    身高 <input type="text" id="h" name="h"><br>
    <input type="button" value="计算bmi" onclick="doAjax()">
    <br>
    <div id="mydata">
        等待加载数据....
    </div>
</div>
</body>
</html>
