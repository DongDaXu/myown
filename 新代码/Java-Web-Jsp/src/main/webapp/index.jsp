<html>
<body>
<h2>Hello World!</h2>
<%! static {
    System.out.println("Servlet Loading");
}%>
<%
    for (int i = 0; i < 5; i++) {
%>
<h1>Hello${param.i}</h1>
<%
    }
%>

</body>
</html>
