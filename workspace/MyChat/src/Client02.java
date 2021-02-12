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
			System.out.println("server connected");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Server not open : " + e);
			System.out.println("Chat exit ^^");
			System.exit(0);
		}
		
		int un = 2;
		UI ui=new UI();
		ui.un=un;
		ui.onCreate();
	}
}