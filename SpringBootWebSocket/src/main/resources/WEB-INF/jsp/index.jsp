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

    <canvas id="canvas" style="border: 1px solid red;"></canvas>
</body>
</html>
<script>

    var canvas = document.getElementById('canvas')
            , g = canvas.getContext('2d')

    //注册事件
    canvas.addEventListener("mousedown",doMouseDown,false);
    canvas.addEventListener("mouseup",doMouseUp,false);
    canvas.addEventListener("mousemove",doMouseMove,false);
    canvas.addEventListener("mouseout",doMouseOut,false);

    //鼠标按下响应事件
    function mousedown(event) {
        var x = event.pageX;
        var y = event.pageY;

        var loc = getLocation(x,y)
    }

    function doMouseUp(event) {
        var x = event.pageX;
        var y = event.pageY;

        var loc = getLocation(x,y)
    }
    function doMouseMove(event) {
        var x = event.pageX;
        var y = event.pageY;

        var loc = getLocation(x,y)
    }
    function doMouseOut(event) {
        var x = event.pageX;
        var y = event.pageY;

        var loc = getLocation(x,y)
    }

    //获取当前鼠标点击的坐标
    function getLocation(x, y) {
        var bbox = canvas.getBoundingClientRect();
        return {
            x: (x - bbox.left) * (canvas.width / bbox.width),
            y: (y - bbox.top) * (canvas.height / bbox.height)
        };
    }

</script>
