<%--
  Created by IntelliJ IDEA.
  User: wzj
  Date: 2016/10/8
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>

    <div>你好</div>
    <div id="message"></div>

    <canvas id="canvas" style="border: 1px solid red;"></canvas>
</body>
</html>
<script>

    var webSocket;
    if (window.WebSocket)
    {
        webSocket = new WebSocket("ws://localhost:8080/websocket");

        //连通之后的回调事件
        webSocket.onopen = function()
        {
            webSocket.send("发送数据");
        };

        //接收后台服务端的消息
        webSocket.onmessage = function (evt)
        {
            var received_msg = evt.data;
            alert("数据已接收:" + received_msg);
        };

        //连接关闭的回调事件
        webSocket.onclose = function()
        {
            alert("连接已关闭...");
        };

    }

</script>
