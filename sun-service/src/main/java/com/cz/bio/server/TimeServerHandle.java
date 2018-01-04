package com.cz.bio.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * Created by 陈钊 on 2017/1/3.
 *
 * @description
 */
public class TimeServerHandle implements Runnable {

    private Socket socket;

    public TimeServerHandle(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            String currentTime = null;
            String body = null;
            while (true) {
                body = in.readLine();
                if (body == null) {
                    break;
                }
                System.out.println("The time server receive order ;" + body);
                currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? new Date(System.currentTimeMillis()).toString() : "BAD ORDER";
                out.println(currentTime);
            }
        } catch (IOException e) {
           if(in!=null){
               try {
                   in.close();
               } catch (IOException e1) {
                   e1.printStackTrace();
               }
           }
           if(out!=null){
               out.close();
               out = null;
           }
           if(this.socket!=null){
               try {
                   socket.close();
                   socket = null;
               } catch (IOException e1) {
                   e1.printStackTrace();
               }
           }
        }
    }
}
