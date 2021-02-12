import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.sound.midi.Receiver;

public class Server {
	
public static void main(String[] args) {
		System.out.println("서버 가동 완료");
		
		try {
			ServerSocket ss = new ServerSocket(236);
			Socket s = ss.accept();
			System.out.println(s.getPort());
		} catch (IOException e) {
			System.out.println("Chat exit ^^");
		}
		
	}
}