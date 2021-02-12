import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	int un;
	
public static void main(String[] args) {
		System.out.println("서버 가동 완료");
		
		try {
			ServerSocket ss = new ServerSocket(236);
			Socket s = ss.accept();
			System.out.println(s.getPort());
			System.out.println(s.getInetAddress()+"connect ok");
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			String msg = in.readUTF();
			System.out.println(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}