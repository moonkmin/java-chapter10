/* 제10장 Programming 문제 4번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEx extends JFrame{
	public KeyEx() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		MyKeyListener listener = new MyKeyListener();     // 리스너 객체 생성
		label.addKeyListener(listener);     // KeyListener 리스너 등록
		
		setSize(350, 150);
		setVisible(true);
		label.setFocusable(true);     // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus();     // 레이블에 키 입력 포커스 지정
	}
	public static void main(String[] args) {
		new KeyEx();
	}
}
class MyKeyListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();     // 키 코드 알아내기
		int i = 1;
		
		if(keyCode == KeyEvent.VK_LEFT) {
			JLabel label = (JLabel)e.getSource();
			String text  = new String(label.getText());
			label.setText(text.substring(i) + text.substring(i-1, i));  // i 인덱스부터 시작하는 서브 스트링 리턴
		}
	}
}
