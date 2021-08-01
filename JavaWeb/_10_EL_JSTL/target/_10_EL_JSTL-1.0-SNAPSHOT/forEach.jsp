<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/16
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
       遍历1-10
       begin设置属性开始的索引
       end属性设置结束的索引
       var属性表示遍历循环的变量(也是当前正在遍历的数据)
            --%>
    <c:forEach begin="1" end="10" var="i">
        <tr border="1">
            <td>第${i}行</td>
        </tr>
    </c:forEach>
<%--        遍历Object数组
            items 表示遍历的数据源（遍历的集合）

--%>
        <%
            request.setAttribute("arr",new String[]{"11111","222222"});
        %>
        <c:forEach items="${requestScope.arr}" var="item">
            ${item}
            <br>
        </c:forEach>
<%--
        遍历Map
--%>
        <%
            Map<String,Object> map =new HashMap<String,Object>();
            map.put("key1","value1");
            map.put("key2","value2");
            map.put("key3","value3");
            map.put("key4","value4");
            request.setAttribute("map",map);
        %>
        <c:forEach items="${requestScope.map}" var="entry">
            <h1>${entry.key}</h1>
        </c:forEach>

        <%
            List<Student> studentList = new ArrayList<Student>();
            for (int i = 0; i < 10; i++) {
                 studentList.add(new Student(1,"username"+i,"pass"+i,18+i,"phone"+i));

            }
            request.setAttribute("stus",studentList);
        %>
        <table>
            <tr>
                <th>编号</th>
                <th>用户名</th>
                <th>密码</th>
                <th>年龄</th>
                <th>电话</th>
                <th>操作</th>
            </tr>

<%--
            begin表示遍历的的开始索引值
            step表示遍历的步长值
            varStatus 属性表示当前遍历到的数据的状态
--%>
        <c:forEach begin="0" items="${requestScope.stus}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.username}</td>
                <td>${stu.password}</td>
                <td>${stu.age}</td>
                <td>${stu.phone}</td>
                <td>删除，修改</td>
            </tr>

        </c:forEach>
</table>
</body>
</html>
