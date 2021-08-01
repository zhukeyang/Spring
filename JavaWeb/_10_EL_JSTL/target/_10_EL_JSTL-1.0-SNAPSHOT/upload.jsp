<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/19
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    enctype="multipart/form-data
    表示提交的数据，以多段式的形式进行拼接，，然后以二进制流的形式发送给服务器
--%>
    <form action="http://localhost:8082/_10_EL_JSTL_war_exploded/uploadservlet" method="post" enctype="multipart/form-data">
        用户名：<input type="text" name="username" /><br>
        头像：<input type="file" name="photo"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
