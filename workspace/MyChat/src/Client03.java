import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Client03 {
	
	public static void UI() {
		TextArea ta=new TextArea();
		TextField tf=new TextField(40);
		Frame f=new Frame("유저3 채팅창");
		Panel p=new Panel();
		Button b = new Button("전송");
		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);	
		p.add(b);
		p.setBackground(Color.gray);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		Client03.UI();
	}

}
