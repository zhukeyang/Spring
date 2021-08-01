<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/15
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    输出请求参数username的值： ${param.username}<br>
    输出请求参数username的值${paramValues.username[1]}
<hr>
    输出请求头信息：${header}
<hr>
    输出cookie:${cookie.JSESSIONID.name}
    <br>
    输出cookie:${cookie.JSESSIONID.value}
</body>
</html>
