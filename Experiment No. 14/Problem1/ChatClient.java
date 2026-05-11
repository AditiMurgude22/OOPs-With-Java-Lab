import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            String msgIn = "", msgOut = "";

            while (!msgIn.equals("exit")) {
                msgOut = br.readLine();
                dos.writeUTF(msgOut);
                dos.flush();

                msgIn = dis.readUTF();
                System.out.println("Server: " + msgIn);
            }

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}