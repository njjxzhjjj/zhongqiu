<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/19
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>添加电脑配件</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
</head>
<body>
   <div style="height: 100px;width: 300px" id="app">
       <h2 align="center">添加电脑配件</h2><br>
      配件名称: <input type="text" name=""><br>
       配件类型:<select v-model="cp">
                   <option>CPU</option>
                   <option>显卡</option>
                   <option>显示器</option>
                   <option >内存</option>
                   <option>硬盘</option>
               </select><br>
             <span v-for="(item,index) in cp" :value="item.cp"><br>配件容量:<input type="text">G</span>
       <br>
       配件价格:<input type="text" name=""><br>
       <%--/computer/compo--%>
       <a href="/component/selectAll"><input type="button" value="添加"><br></a>
   </div>
   <script>
       var vm =new Vue({
           el: "#app",
           data: {
               cp: '',
           },
           methods:{
           }
       })
   </script>
</body>
</html>
