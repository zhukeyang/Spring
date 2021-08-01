<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/16
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <c:forEach end=""> --%>
<%--        --%>
<%--        --%>
<%--    </c:forEach>--%>
<%--test属性表示判断条件
    没有else只有if
--%>
    <c:if test="${12==12}">
        <h1>if表达式 12=12</h1>

    </c:if>
    <%
        request.setAttribute("height",178);
    %>
    <c:choose>
        <c:when test="${requestScope.height>190}">
            <h2>很高</h2>
        </c:when>
        <c:when test="${requestScope.height>180}">
            <h2>高</h2>
        </c:when>
        <c:when test="${requestScope.height>170}">
            <h2>还可以</h2>
        </c:when>
        <c:otherwise>
            <h2>remark</h2>
        </c:otherwise>
    </c:choose>
</body>
</html>
