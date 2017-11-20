/* 제10장 Programming 문제 5번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyPM extends JFrame {
	public KeyPM() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10));     // Arial 폰트로 10픽셀 크기
		
		
		c.add(label);
		
		MyKeyListener listener = new MyKeyListener();     // 리스너 객체 생성
		label.addKeyListener(listener);     // KeyListener 리스너 등록
		
		setSize(350, 150);
		setVisible(true);
		label.setFocusable(true);     // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus();     // 레이블에 키 입력 포커스 서정
	}

	public static void main(String[] args) {
		new KeyPM();
	}
}
class MyKeyListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int keyChar = e.getKeyChar();     // 키 문자 값 알아내기
		
		if(keyChar == '+') {
			JLabel label = (JLabel)e.getSource();
			Font f = label.getFont();
			int size = f.getSize();
			label.setFont(new Font("Arial", Font.PLAIN, size+5));     // 15픽셀 크기
		}
		else if(keyChar == '-') {
			JLabel label = (JLabel)e.getSource();
			Font f = label.getFont();
			int size = f.getSize();
			label.setFont(new Font("Arial", Font.PLAIN, size-5));     // 5픽셀 크기
		}
	}
}
