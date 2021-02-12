import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	
	static String msg= "C01 in\n";
		
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost", 236);
			int port;
			port = s.getLocalPort();
			UI ui=new UI();
			ui.port=port;
			ui.onCreate();
			System.out.println("chatroom connect success");
			
			while(true) {
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF(msg);
		}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("Server not open : " + e);
			System.out.println("Chat exit ^^");
			System.exit(0);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Server not open : " + e);
			System.out.println("Chat exit ^^");
			System.exit(0);
		}

	}
}