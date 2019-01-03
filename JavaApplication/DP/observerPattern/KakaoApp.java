package observerPattern;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KakaoApp implements KakaoObserver{
	Kakao server;
	
	JFrame frame;
	JTextArea yourChat;
	JTextArea myChat;
	JButton sendButton;
	
	public KakaoApp(Kakao server) {
		//이 서버와 원래 서버 동기화
		this.server = server;
		//서버에 이 앱을 등록
		this.server.addObserver(this);
		//기타 레이아웃
		frame = new JFrame("KakaoTalk");
		Container panel = frame.getContentPane();
		panel.setLayout(new BorderLayout());
		
		yourChat = new JTextArea();
		myChat = new JTextArea();
		sendButton = new JButton("send");
		
		panel.add(yourChat, BorderLayout.PAGE_START);
		panel.add(myChat, BorderLayout.CENTER);
		panel.add(sendButton, BorderLayout.PAGE_END);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 400);
		frame.setVisible(true);
		
		sendButton.addActionListener(new MyListener());
	}
	@Override
	public void update(String msg) {
		yourChat.setText(msg);
		
	}
	
	private class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String msg = myChat.getText();
			server.newChat(msg);
		}
		
	}

}
