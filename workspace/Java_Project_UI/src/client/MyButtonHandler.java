package client;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonHandler implements ActionListener{
	TextArea ta;
	TextField tf;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
		String msg = tf.getText();
		ta.append(msg +"\n");
		tf.setText("");
	}
	
	public void setTextArea(TextArea ta) {
		this.ta = ta;
	}
	
	public void setTextField(TextArea ta,  TextField tf ) {
		this.tf = tf;
	}

	public void setResource(TextArea ta2, TextField tf2) {
		// TODO Auto-generated method stub
		
	}
}
