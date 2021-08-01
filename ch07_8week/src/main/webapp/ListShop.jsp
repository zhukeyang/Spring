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
    <title>浏览店铺</title>
    <script type="text/javascript" src="Js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            getShopInfo();
            $("#doAjax").click(function (){
                getShopInfo();
            })
        })
        function getShopInfo()
        {
            $.ajax({
                url:"queryShop.do",
                dataType:"json",
                success:function(resp){
                    $("Shopinfo").empty();
                    $.each(resp,function (i,n)
                    {
                        $("#Shopinfo").append("<tr><td>"+n.id+"</td>" +
                            "<td>"+n.name+"</td>" +
                            "<td>"+n.goods_id+"</td></tr>");


                    })
                }
            })
        }
    </script>

</head>
<body>
<div align="center">
    <p>浏览店铺<button id="doAjax" >获取店铺数据</button></p>
    <table>
        <thead>
        <tr>
            <td>店铺编号</td>
            <td>店铺名称</td>
            <td>店铺商品</td>
        </tr>
        </thead>
        <tbody id="Shopinfo">
        </tbody>
    </table>
</div>
</body>
</html>