package Package01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
//����һ������
public class Calculator_1 extends JFrame {

	Calculator_1() {
		setTitle("������"); // �趨����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �趨�رմ���ʱ�˳�����
		
		JPanel pane = new JPanel(); // ���������
		pane.setLayout(new BorderLayout()); // ��������Ϊ�߽粼�ֹ�����
		setBounds(300, 300, 200, 250); // ǰ��������������Ļ����ʾ�����꣬�������Ǵ�С
	}
	
	public static void main(String[] args) {
		Calculator_1 frame = new Calculator_1();
		frame.setVisible(true);	//���ô������ɼ�
	}
}
