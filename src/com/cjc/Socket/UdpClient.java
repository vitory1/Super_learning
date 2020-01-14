package com.cjc.Socket;

import java.io.IOException;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        System.out.println("udp 客户端发送数据");
        DatagramSocket ds = new DatagramSocket();
        String str = "客户端发送数据。。。";
        byte[] bytes = str.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.0.115"),8080);
        ds.send(dp);
        ds.close();
    }
}
