package com.cjc.Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        System.out.println("Socket tcp 客户端准备启动...");
        Socket socket = new Socket("192.168.0.115",8080);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我是客户端...".getBytes());
        socket.close();
    }
}
