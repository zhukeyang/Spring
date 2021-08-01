<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/15
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

1.协议：              ${pageContext.request}           <br>
2.服务器ip:           ${pageContext.request.scheme}    <br>
3.服务器端口：         ${pageContext.request.serverName}  <br>
4.获取工程路径：       ${pageContext.request.contextPath}  <br>
5.获取请求方法：       ${pageContext.request.method}       <br>
6.获取客户端ip地址：   ${pageContext.request.remoteHost}    <br>
7.获取会话的id编号：   ${pageContext.request.session.id}    <br>
</body>
</html>
