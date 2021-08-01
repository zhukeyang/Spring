<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/21
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    这是登录页面login.jsp
    <form action="http://localhost:8082/_12_filter_war_exploded/loginservlet" method="post"><br>
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="submit"/>
    </form>
</body>
</html>
