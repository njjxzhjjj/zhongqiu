<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/19
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加电脑</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
</head>
<body>
<div id="app">
    <h2>添加电脑</h2><br>
    <a href="/ind">返回主页</a><br>
    <form action="" method="post">
        电脑型号: <input type="text" v-model="computer.computerId"><br>
        CPU:<select v-model="computer.cup">
                <option v-for="(item,index) in coms">{{item.cup}}</option>
            </select><br>
        硬盘:<select v-model="computer.hdd">
                <option></option>
            </select><br>
        显卡:<select v-model="computer.videocard">
                <option></option>
            </select><br>
        显示器:<select v-model="computer.display">
                <option></option>
            </select><br>
        价格:<input type="text" name="" v-model="computer.price"><br>
        <a href="/computer/selectAll"><input type="button" value="添加"></a><br>
       <span>{{coms}}</span>
    </form>
</div>
<script>
    var vm = new Vue({  //create之前.....
        el: '#app',
        data: {
            coms: [],
            computer: {}
        },
        created: function () {
            axios.get("/computer/insert").then((response) = > {
                this.coms = response.data.data;
        })
        },
    })
</script>
</body>
</html>
