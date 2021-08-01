<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/5/19
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<div align="center">
    <p>添加商品</p>
    <form action="addGoods.do" method="post">
        <table>
            <tr>
                <td>商品编号:</td>
                <td><input type="text" name="Id"></td>
            </tr>
            <tr>
                <td>名称:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>生产地:</td>
                <td><input type="text" name="area"></td>
            </tr>
            <tr>
                <td>操作:</td>
                <td><input type="submit" value="添加"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
