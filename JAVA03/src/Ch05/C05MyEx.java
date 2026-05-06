package Ch05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05ExJframe extends JFrame {
	C05ExJframe(String title) {
		//Frame
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel setting
		JPanel panel = new JPanel();
//		Color col = new Color(255,255,0);
//		panel.setBackground(col);
		panel.setLayout(null);
		
		//Component Setting
		JButton btn1 = new JButton("파일로저장");
		btn1.setBounds(250,10,150,30);
		JButton btn2 = new JButton("1:1요청");
		btn2.setBounds(250,60,150,30);
		JButton btn3 = new JButton("대화기록보기");
		btn3.setBounds(250,110,150,30);
		JButton btn4 = new JButton("입력");
		btn4.setBounds(250,350,150,30);
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,350,210,30);
		JTextArea area1 = new JTextArea();
//		area1.setBounds(10,90,210,300);
		JScrollPane scroll = new JScrollPane(area1);
		scroll.setBounds(10,10,210,300);
		
		//Panel에 Component 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txt1);
		panel.add(scroll);
		
		//Frame에 Panel 추가
		add(panel); 
		
		setVisible(true);
	}
}
public class C05MyEx {

	public static void main(String[] args) {
		new C05ExJframe("Chatting Server");
	}

}
