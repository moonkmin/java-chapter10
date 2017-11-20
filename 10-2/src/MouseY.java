/* ��10�� Programming ���� 2��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseY extends JFrame {
	public MouseY() {
		setTitle("�巡�뵿�� YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		
		MyMouseListener listener = new MyMouseListener();     // ������ ��ü ����
		c.addMouseListener(listener);     // MouseListener ������ ���
		c.addMouseMotionListener(listener);     // MouseMotionListener ������ ���
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseY();
	}
}
class MyMouseListener implements MouseListener, MouseMotionListener {
	// MouseMotionListener�� 2�� �޼ҵ� ����
	public void mouseDragged(MouseEvent e) {
		Component c = (Component)e.getSource();     // ���콺�� �巡�׵� ������Ʈ
		c.setBackground(Color.YELLOW);     // ��� ���������
	}
	public void mouseMoved(MouseEvent e) {}
	
	// MouseListener�� 5�� �޼ҵ� ����
	public void mouseReleased(MouseEvent e) {
		Component c = (Component)e.getSource();     // ������ ���콺 ��ư�� ������ �� ������Ʈ
		c.setBackground(Color.GREEN);     // ��� �ʷϻ�����
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
}
