<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/5/11
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个springmvc</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#btnAjax").on("click",function (){
               $.ajax({
                   // url:"return-void-ajax.do",
                   // url:"doStudentJson.do",
                   // url:"doStudentJsonArray.do",
                   url:"/doStringData.do",
                   data:{
                       name:"lixinxin",
                       age:12
                   },
                    dataType:"json",
                   success:function (resp)
                   {
                       alert("resp.name=="+resp.name+"resp.age:"+resp.age);
                   }
               })

            })

        })

    </script>
</head>
<body>
    <a href="some.do">发起test/some.do的请求</a><br>
    <a href="other.do">test/second.do请求</a><br>
    <a href="add.do">add.do的请求</a>
    <form action="receive-property.do">
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>

        <input type="submit" value="提交参数">
    </form>
    <br>
    <br>
    <br>
    <form action="receive-object.do">
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>

        <input type="submit" value="对象接收参数">
    </form>
    <p>控制器方法返回String逻辑视图名称</p>
    <form action="return-string-view.do">
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>

        <input type="submit" value="对象接收参数">
    </form>
<br>
<br>
<br>
    <p>控制器方法返回String完整视图路径</p>
    <form action="return-string-view2.do">
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>

        <input type="submit" value="对象接收参数">
    </form>
<br/>
<br/>
<br/>
<button id="btnAjax">发起ajax请求</button>
<img src="images/1.jpg">
</body>
</html>
