<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/15
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
            request.setAttribute("key","value");
    %>
    表达式脚本输出：
        <%= request.getAttribute("key")%>
    EL表达式：
        ${key}
    三元运算：
        ${12==12?"好看":"不行"}
</body>
</html>
