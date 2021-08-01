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
    <p>添加店铺</p>
    <form action="addShop.do" method="post">
        <table>
            <tr>
                <td>店铺编号:</td>
                <td><input type="text" name="ID"></td>
            </tr>
            <tr>
                <td>店铺名称:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>商品编号:</td>
                <td><input type="text" name="goods_id"></td>
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
