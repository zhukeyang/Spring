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
        <p>注册学生</p>
        <form action="student/addStudent.do" method="post">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>姓名:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>年龄:</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>操作:</td>
                    <td><input type="submit" value="注册"></td>
                </tr>
            </table>
        </form>

    </div>
</body>
</html>
