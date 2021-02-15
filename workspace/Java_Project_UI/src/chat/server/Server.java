package chat.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void chatProcess() {
	
		try {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("Server Ready...");
			Socket s = ss.accept();
			System.out.println(s.getInetAddress()+" is Joined");
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			ServerThread t = new ServerThread(in);
			t.start();
			
			String msg = in.readUTF();
			System.out.println(msg);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			

public static void main(String[] args) {
		new Server().chatProcess();
	}
	
	class ServerThread extends Thread{
		DataInputStream in;
		public ServerThread(DataInputStream in2) {
			// TODO Auto-generated constructor stub
		}

		public void Run() {
			this.in = in;
		}
		
		@Override
		public void run(){
			String msg;
			try {
				msg = in.readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg);
		}
	}
}
