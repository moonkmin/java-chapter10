/* ��10�� Programming ���� 5��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyPM extends JFrame {
	public KeyPM() {
		setTitle("+,- Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10));     // Arial ��Ʈ�� 10�ȼ� ũ��
		
		
		c.add(label);
		
		MyKeyListener listener = new MyKeyListener();     // ������ ��ü ����
		label.addKeyListener(listener);     // KeyListener ������ ���
		
		setSize(350, 150);
		setVisible(true);
		label.setFocusable(true);     // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus();     // ���̺� Ű �Է� ��Ŀ�� ����
	}

	public static void main(String[] args) {
		new KeyPM();
	}
}
class MyKeyListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int keyChar = e.getKeyChar();     // Ű ���� �� �˾Ƴ���
		
		if(keyChar == '+') {
			JLabel label = (JLabel)e.getSource();
			Font f = label.getFont();
			int size = f.getSize();
			label.setFont(new Font("Arial", Font.PLAIN, size+5));     // 15�ȼ� ũ��
		}
		else if(keyChar == '-') {
			JLabel label = (JLabel)e.getSource();
			Font f = label.getFont();
			int size = f.getSize();
			label.setFont(new Font("Arial", Font.PLAIN, size-5));     // 5�ȼ� ũ��
		}
	}
}
