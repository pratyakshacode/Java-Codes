//client

import java.io.*;
import java.net.*;

public class SocketClient {
    
    public static void main(String[] args) {

        try{
        Socket s = new Socket("127.0.0.1", 3000);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello this is the msg sent by me");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
