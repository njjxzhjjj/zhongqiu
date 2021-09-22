<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/19
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>电脑配件列表</title>
    <style>
        td{border: 1px blue solid;width: 200px;}
        table{height: 20px}
    </style>
</head>
<body>
<div style="height: 400px;width: 1000px;border: solid 1px red" id="app">
    <h2 align="center">电脑配件列表</h2>
    <a href="/ind">返回主页</a>
        <table border="1px" bordercolor="blue" cellpadding="0" cellspacing="0">
            <tr>
                <td>序号</td>
                <td>配件名称</td>
                <td>配件类型</td>
                <td>容量</td>
                <td>价格</td>
            </tr>
        </table>
</div>
<script>
    var vm = new Vue({  //create之前.....
        el: '#app',
        data: {
            tTypes: [],
            tBusiness: {}
        },
        created:function () {
            axios.get("/type/selectAll").then((response)=>{
                this.tTypes=response.data.data;
          })
        },
    })
</script>

</body>
</html>
