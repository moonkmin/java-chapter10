/* ��10�� Programming ���� 1��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEx extends JFrame {
	public MouseEx() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");
		c.add(label);
		label.addMouseListener(new MyMouseAdapter());     // �󺧿� ���콺 �̺�Ʈ ������ �ޱ�
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEx();
	}
}
class MyMouseAdapter extends MouseAdapter {
	public void mouseEntered(MouseEvent e) {     // ���콺�� ������Ʈ ���� �ö�� ��
		JLabel label = (JLabel)e.getSource();
		label.setText("Love Java");
	}

	public void mouseExited(MouseEvent e) {     // ������Ʈ ���� �ö�� ���콺�� ������Ʈ�� ��� ��
		JLabel label = (JLabel)e.getSource();
		label.setText("�����");
	}			
}


