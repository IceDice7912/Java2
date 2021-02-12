import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class UI {
	TextArea ta;
	TextField tf;
	Server ser = new Server();
	int port;
	String msg;
	String smsg;
	
	public void chatMsg() {
		Socket s;
		
		try {
			s = new Socket("localhost", 236);
			
			msg=tf.getText();
			smsg = "User " + port + " : " + msg + "\n";
			tf.setText("");
			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeUTF(smsg);
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			String msg = in.readUTF();
			ta.append(msg);	
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	
	public void onCreate() {
		Frame f=new Frame("채팅창 - 로컬 포트 " + port);
		Panel p=new Panel();
		Button b1=new Button("전송");
		 tf=new TextField(20);
		 ta=new TextArea();		
		 			
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
					
		b1.addActionListener(c -> chatMsg());	
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();
			}
		});
		

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);	
		p.setBackground(Color.gray);	
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}
}
