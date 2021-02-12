import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
public static void main(String[] args) {
		System.out.println("서버 가동 완료");
		
		try {
			ServerSocket ss = new ServerSocket(236);
			
			while(true) {
			Socket s = ss.accept();
			s.getPort();
			s.getInetAddress();
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			String msg = in.readUTF();
			System.out.print(msg);
			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF(msg);
		}
			
		} catch (IOException e) {
			System.out.println("Chat exit ^^");
		}	
		
	}
}