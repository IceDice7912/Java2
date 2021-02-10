package client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("localhost", 1234);
			System.out.println("server connected");
			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF("Hello?");
			
		}  catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
