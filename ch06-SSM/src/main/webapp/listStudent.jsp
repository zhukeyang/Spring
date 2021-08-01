<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/5/20
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>浏览学生</title>
    <script type="text/javascript" src="Js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            getStudentInfo();
            $("#doAjax").click(function (){
                getStudentInfo();
            })
        })
        function getStudentInfo()
        {
            $.ajax({
                url:"student/queryStudent.do",
                dataType:"json",
                success:function(resp){
                    $("stuinfo").empty();
                    $.each(resp,function (i,n)
                    {
                        $("#stuinfo").append("<tr><td>"+n.id+"</td><td>"
                            +n.name+"</td><td>"
                            +n.age+"</td></tr>");
                    })
                }
            })
        }
    </script>

</head>
<body>
    <div align="center">
        <p>浏览学生<button id="doAjax" >获取学生数据</button></p>
        <table>
            <thead>
                <tr>
                    <td>id</td>
                    <td>姓名</td>
                    <td>年龄</td>
                </tr>
            </thead>
            <tbody id="stuinfo">

            </tbody>
        </table>
    </div>
</body>
</html>
