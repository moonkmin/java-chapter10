/* ��10�� Programming ���� 4��
 * �̸� : �����
 * �й� : 20163014
 * ������ : 2017.11.21 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEx extends JFrame{
	public KeyEx() {
		setTitle("Left Ű�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		MyKeyListener listener = new MyKeyListener();     // ������ ��ü ����
		label.addKeyListener(listener);     // KeyListener ������ ���
		
		setSize(350, 150);
		setVisible(true);
		label.setFocusable(true);     // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus();     // ���̺� Ű �Է� ��Ŀ�� ����
	}
	public static void main(String[] args) {
		new KeyEx();
	}
}
class MyKeyListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();     // Ű �ڵ� �˾Ƴ���
		int i = 1;
		
		if(keyCode == KeyEvent.VK_LEFT) {
			JLabel label = (JLabel)e.getSource();
			String text  = new String(label.getText());
			label.setText(text.substring(i) + text.substring(i-1, i));  // i �ε������� �����ϴ� ���� ��Ʈ�� ����
		}
	}
}
