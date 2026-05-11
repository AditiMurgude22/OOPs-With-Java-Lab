import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server waiting...");

            Socket s = ss.accept();
            System.out.println("Client connected");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            String msgIn = "", msgOut = "";

            while (!msgIn.equals("exit")) {
                msgIn = dis.readUTF();
                System.out.println("Client: " + msgIn);

                msgOut = br.readLine();
                dos.writeUTF(msgOut);
                dos.flush();
            }

            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}