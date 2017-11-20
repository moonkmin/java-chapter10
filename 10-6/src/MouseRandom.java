/* ��10�� Programming ���� 6��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseRandom extends JFrame {
	public MouseRandom() {
		setTitle("Ŭ�� ������ �������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);          // ����Ʈ���� ��ġ������ ����
		
		JLabel label = new JLabel("C");
		label.setLocation(100, 100);     // label�� �ʱ� ��ġ�� (100, 100)���� ��
		label.setSize(10,10);
		
		c.add(label);
		
		MyMouseListener listener = new MyMouseListener();     // ������ ��ü ����
		label.addMouseListener(listener);     // MouseListener ������ ���
		
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
		
		label.setLocation(x, y);     // ���̺��� ��ġ�� (x,y)�� �̵�
	}
}
