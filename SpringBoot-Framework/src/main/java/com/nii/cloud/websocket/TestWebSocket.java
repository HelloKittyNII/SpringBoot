package com.nii.cloud.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by wzj on 2018/4/14.
 */
@ServerEndpoint(value = "/testWebSocket")
@Component
public class TestWebSocket
{
    /**
     * 在线人数
     */
    public static int onlineNumber = 0;

    /**
     * 所有的对象
     */
    public static List<TestWebSocket> webSockets = new CopyOnWriteArrayList<TestWebSocket>();

    /**
     * 会话
     */
    private Session session;

    /**
     * 建立连接
     *
     * @param session
     */
    @OnOpen
    public void onOpen(Session session)
    {
        onlineNumber++;
        webSockets.add(this);

        this.session = session;

        System.out.println("有新连接加入！ 当前在线人数" + onlineNumber);
    }

    /**
     * 连接关闭
     */
    @OnClose
    public void onClose()
    {
        onlineNumber--;
        webSockets.remove(this);
        System.out.println("有连接关闭！ 当前在线人数" + onlineNumber);
    }

    /**
     * 收到客户端的消息
     *
     * @param message 消息
     * @param session 会话
     */
    @OnMessage
    public void onMessage(String message, Session session)
    {
        System.out.println("来自客户端消息：" + message);

        sendMessage("欢迎连接");
    }

    /**
     * 发送消息
     *
     * @param message 消息
     */
    public void sendMessage(String message)
    {
        try
        {
            session.getBasicRemote().sendText(message);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
