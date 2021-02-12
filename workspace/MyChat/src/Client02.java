import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client02 {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost", 236);
			int port;
			port = s.getLocalPort();
			UI ui=new UI();
			ui.port=port;
			ui.onCreate();
			System.out.println("chatroom connect success");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Server not open : " + e);
			System.out.println("Chat exit ^^");
			System.exit(0);
		}
		
	}
}