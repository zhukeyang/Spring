<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/4/13
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--//声明类属性--%>
    <%!
        private Integer id;
        private String name;
        private static Map<String,Object> map;

    %>
<%--   声明static静态代码快 --%>
<%!
        static {
            map=new HashMap<String,Object>();
            map.put("key1","value1");
            map.put("key2","value2");
            map.put("key3","value3");
        }
%>
<%--    声明类的方法--%>
    <%!
            public int abc()
            {
                return 12;
            }

    %>
<%--声明内部类--%>
    <%!
            public static class A {
                private  Integer id=12;
                private String name ="a";
            }
    %>
<%--    输出整型--%>
    <%=12.12%>>
    <%=12.12%>><br>
    <%="我是字符串"%>><br>
    <%=map%>>
<%
    int i=12;
    if(i==12)
    {
        System.out.println("666");
    }

%>
这是html页面
</body>
</html>
