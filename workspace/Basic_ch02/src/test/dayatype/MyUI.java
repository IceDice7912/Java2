package test.dayatype;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class MyUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button D = new Button("나와라 한글");
		Frame F = new Frame();
		F.setVisible(true);
		F.setSize(500, 400);
		F.add(D, BorderLayout.SOUTH);
	}

}
