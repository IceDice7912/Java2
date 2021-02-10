//package imsi;
//
//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.Color;
//import java.awt.Frame;
//import java.awt.Panel;
//import java.awt.TextArea;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
//import javax.swing.plaf.synth.SynthSeparatorUI;
//
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Frame f = new Frame();
//		TextArea ta = new TextArea();
//		
//		A handler = new A();
//		ta.addMouseListener(handler);
//		
//		ta.setBackground(Color.LIGHT_GRAY);
//		f.add(ta, BorderLayout.CENTER);
//		Panel p = new Panel();
//		p.setSize(500, 100);
//		p.setBackground(Color.GREEN);
//		f.add(p, BorderLayout.SOUTH);
//		f.setSize(500, 300);
//		f.setVisible(true);
//	}
//
//}
//
//class A implements MouseListener{
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("마우스 클릭");
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("마우스가 눌림");
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("마우스를 뗌");
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("마우스가 영역에 들어옴");
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("마우스가 영역 밖으로 나감");
//	}
//	
//}

package imsi;

public class Test {
	public static void main(String[] args) {
		int out = 10;
		
		class A {
			public int count() {
				int cnt = 0;
				for(int i=0; i<10; i++)
				{
					cnt = cnt + i;
				}
				return cnt;
			}
		}
		
		A a = new A();
		System.out.println(a.count());
	}
}