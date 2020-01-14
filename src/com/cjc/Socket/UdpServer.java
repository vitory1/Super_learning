package com.cjc.Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Socket udp服务器端
 * udp是面向无连接，协议不可靠
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("udp 服务器端启动......");
        int port = 8080 ;
        DatagramSocket ds = new DatagramSocket(port);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //等待客户端进行发送内容，如果客户端不发送内容，一直等待。（阻塞效果）
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println("客户端发送的数据是："+str);
        ds.close();
    }
}
