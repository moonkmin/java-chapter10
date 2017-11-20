/* 제10장 Programming 문제 1번
 * 이름 : 문경민
 * 학번 : 20163014
 * 제출일 : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEx extends JFrame {
	public MouseEx() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");
		c.add(label);
		label.addMouseListener(new MyMouseAdapter());     // 라벨에 마우스 이벤트 리스너 달기
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEx();
	}
}
class MyMouseAdapter extends MouseAdapter {
	public void mouseEntered(MouseEvent e) {     // 마우스가 컴포넌트 위에 올라올 때
		JLabel label = (JLabel)e.getSource();
		label.setText("Love Java");
	}

	public void mouseExited(MouseEvent e) {     // 컴포넌트 위에 올라온 마우스가 컴포넌트를 벗어날 때
		JLabel label = (JLabel)e.getSource();
		label.setText("사랑해");
	}			
}


