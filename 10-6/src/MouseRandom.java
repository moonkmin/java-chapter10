/* 제10장 Programming 문제 6번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseRandom extends JFrame {
	public MouseRandom() {
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);          // 컨텐트팬의 배치관리자 제거
		
		JLabel label = new JLabel("C");
		label.setLocation(100, 100);     // label의 초기 위치를 (100, 100)으로 함
		label.setSize(10,10);
		
		c.add(label);
		
		MyMouseListener listener = new MyMouseListener();     // 리스너 객체 생성
		label.addMouseListener(listener);     // MouseListener 리스너 등록
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseRandom();
	}
}
class MyMouseListener extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		JLabel label = (JLabel)e.getSource();
		int x = (int)(Math.random()*300);     // 0 ~ 300
		int y = (int)(Math.random()*300);     // 0 ~ 300
		
		label.setLocation(x, y);     // 레이블의 위치를 (x,y)로 이동
	}
}
