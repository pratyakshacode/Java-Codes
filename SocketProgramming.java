//server

import java.io.*;
import java.net.*;

public class SocketProgramming {
    public static void main(String[] args) {
        
        try{
        ServerSocket skt = new ServerSocket(3000);
        Socket sc = skt.accept();

        System.out.println(sc);
        DataInputStream din = new DataInputStream(sc.getInputStream());
        DataOutputStream dout = new DataOutputStream(sc.getOutputStream());

        String msg = (String) din.readUTF();
        System.out.println(msg);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
