import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
public static void main(String[] args) {
		System.out.println("Server Start");
		
		try {
			ServerSocket ss = new ServerSocket(236);
			int port = 0;
			UI ui=new UI();
			ui.port=port;
			ui.onCreate();
			
			while(true) {
			Socket s = ss.accept();
			s.getPort();
			s.getInetAddress();
			s.getChannel();
			s.getLocalPort();
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			String msg = in.readUTF();
			ui.ta.append(msg);
			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF(msg);
			}
		}	catch (IOException e) {
			System.out.println("Chat exit ^^");
		}	
		
	}
}