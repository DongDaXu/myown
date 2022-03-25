<%@ page import="com.dong.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person=new Person();
    person.setName("ajs");
    person.setPhones(new String[]{"135465464","54434","54645"});
    List<String> list =new ArrayList<>();
    list.add("背景");
    list.add("上海");
    list.add("深圳");
    person.setCities(list);
    Map<String,Object> map=new HashMap<>();
    map.put("key1","value");
    map.put("key2","value");
    map.put("key3","value");
    person.setMap(map);
    pageContext.setAttribute("person",person);
%>
输出person:${person.name}
</body>
</html>
