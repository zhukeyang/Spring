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
    <title>浏览商品</title>
    <script type="text/javascript" src="Js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            getGoodsInfo();
            $("#doAjax").click(function (){
                getGoodsInfo();
            })
        })
        function getGoodsInfo()
        {
            $.ajax({
                url:"queryGoods.do",
                dataType:"json",
                success:function(resp){
                    $("Goodsinfo").empty();
                    $.each(resp,function (i,n)
                    {
                        $("#Goodsinfo").append("<tr><td>"+n.id+"</td><td>"
                            +n.name+"</td><td>"
                            +n.area+"</td></tr>");
                    })
                }
            })
        }
    </script>

</head>
<body>
<div align="center">
    <p>浏览商品<button id="doAjax" >获取商品数据</button></p>
    <table>
        <thead>
        <tr>
            <td>商品编号</td>
            <td>商品名称</td>
            <td>商品产地</td>
        </tr>
        </thead>
        <tbody id="Goodsinfo">

        </tbody>
    </table>
</div>
</body>
</html>