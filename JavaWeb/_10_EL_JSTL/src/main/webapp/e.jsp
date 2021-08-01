<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/15
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("a.a.a","aaaValue");
        map.put("bbb","bbbValue");
        map.put("ccc","cccValue");
        request.setAttribute("map",map);
    %>
    ${map.[a.a.a]}
</body>
</html>
