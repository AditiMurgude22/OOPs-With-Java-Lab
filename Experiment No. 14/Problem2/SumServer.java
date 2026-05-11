import java.io.*;
import java.net.*;

public class SumServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6000);
            System.out.println("Server started");

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            int num1 = dis.readInt();
            int num2 = dis.readInt();

            int sum = num1 + num2;

            dos.writeInt(sum);
            dos.flush();

            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}