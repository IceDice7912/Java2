
package chat.client;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ClientUI {
	TextArea ta;
	TextField tf;	
	DataOutputStream out;
	DataInputStream in;
	String chatId;
	
	class ClientThread extends Thread{
		@Override
		public void run() {
			while(true) {
				try {
				
					ta.append(in.readUTF()+"\n");//채팅 메세지 읽기
				
				} catch (IOException e) {				
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	public void chatMsg() {
		String msg=tf.getText();
		try {
			out.writeUTF(chatId+msg);//채팅 메세지 보내기 [은수]안녕?
		} catch (IOException e) {			
			e.printStackTrace();
		}
		tf.setText("");
	}
	
	public void onCreate() {
		Frame f=new Frame("나의 채팅");
		Panel p=new Panel();
		Button b1=new Button("채팅");
		 tf=new TextField(20);
		 ta=new TextArea();		
		MenuBar mb=new MenuBar();
		Menu file_menu=new Menu("파일");
		Menu edit_menu=new Menu("편집");
		MenuItem open_item=new MenuItem("열기");
		MenuItem save_item=new MenuItem("저장");
		
		file_menu.add(open_item);
		file_menu.add(save_item);
		mb.add(file_menu);
		mb.add(edit_menu);
		f.setMenuBar(mb);
		
		save_item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				FileDialog save=new FileDialog(f, "저장 창", FileDialog.SAVE);
				save.setVisible(true);
				
				FileWriter fw=null;
				try {
					fw=new FileWriter(save.getDirectory()+save.getFile());
					fw.write(ta.getText());
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					 try {
						 if(fw !=null ) fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}		
				
			}
		});
		 
		 
		open_item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				System.out.println("file open?");
				FileDialog open=new FileDialog(f, "열기 창", FileDialog.LOAD );
				open.setVisible(true);
				
				FileReader fr=null;
				BufferedReader br=null;
				try {			
					 fr=new FileReader(open.getDirectory()+open.getFile());
					 br=new BufferedReader(fr);
					String oneLine="";
					ta.setText("");
					while((oneLine=br.readLine()) != null ) {
						ta.append(oneLine+"\n");
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						if(br !=null ) br.close();
						if(fr !=null ) fr.close();
					}catch(IOException e) {
						
					}
				}
			}
		});
		 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
					
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 채팅 서버 연결
				chatId="["+tf.getText()+"]";//[은수]
				ta.setText(chatId+"님 채팅을 시작합니다\n");
				try {
					Socket s=new Socket("localhost",9999);
					out=new DataOutputStream(s.getOutputStream());
					in=new DataInputStream(s.getInputStream());
					ClientThread t=new ClientThread();
					t.start();
					ta.append("연결 ok\n");
					tf.setText("");
				
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {					
					e1.printStackTrace();
				}
			}
		});
		
			
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
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		ClientUI ui=new ClientUI();
		ui.onCreate();
	}//end main
	
	
	
	


}//end ClientUi