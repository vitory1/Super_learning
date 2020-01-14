package com.cjc.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("socket tcp 启动...");
        ServerSocket serverSocket = new ServerSocket(8080);
//        等待客户端连接，阻塞状态
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        String str = new String(buf,0,len);
        System.out.println("str:"+str);
        serverSocket.close();
    }
}
