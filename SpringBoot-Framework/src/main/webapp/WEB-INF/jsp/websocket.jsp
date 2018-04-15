<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebSocket</title>
</head>
<body>

<div>你好</div>
<div id="message"></div>
</body>
</html>

<script>

    var webSocket;
    if (window.WebSocket)
    {
        webSocket = new WebSocket("ws://localhost:8000/testWebSocket");

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