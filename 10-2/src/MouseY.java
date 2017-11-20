/* 제10장 Programming 문제 2번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseY extends JFrame {
	public MouseY() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		
		MyMouseListener listener = new MyMouseListener();     // 리스너 객체 생성
		c.addMouseListener(listener);     // MouseListener 리스너 등록
		c.addMouseMotionListener(listener);     // MouseMotionListener 리스너 등록
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseY();
	}
}
class MyMouseListener implements MouseListener, MouseMotionListener {
	// MouseMotionListener의 2개 메소드 구현
	public void mouseDragged(MouseEvent e) {
		Component c = (Component)e.getSource();     // 마우스가 드래그된 컴포넌트
		c.setBackground(Color.YELLOW);     // 배경 노란색으로
	}
	public void mouseMoved(MouseEvent e) {}
	
	// MouseListener의 5개 메소드 구현
	public void mouseReleased(MouseEvent e) {
		Component c = (Component)e.getSource();     // 눌러진 마우스 버튼이 떼어질 때 컴포넌트
		c.setBackground(Color.GREEN);     // 배경 초록색으로
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
}
