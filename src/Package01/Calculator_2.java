package Package01;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
/*
public class Calculator_2 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	Number number = new Number();	//��ʾ����
	Keys keys = new Keys();		//��ť��
	JButton clear = new JButton("����");		//���㰴ť
	
	Calculator_2() {
		setTitle("������"); // �趨����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �趨�رմ���ʱ�˳�����
		
		JPanel pane = new JPanel(); // ���������
		pane.setLayout(new BorderLayout()); // ��������Ϊ�߽粼�ֹ�����
		setBounds(300, 300, 200, 250); // ǰ��������������Ļ����ʾ�����꣬�������Ǵ�С
		
		pane.add(number, BorderLayout.NORTH);
		pane.add(keys, BorderLayout.CENTER);
		pane.add(clear, BorderLayout.SOUTH);
		
		setContentPane(pane);		//���ǿ�����JFrame���������Swing��������ǣ���Ȼ����add������ȴ����ֱ������������
		
	}
	
	public static void main(String[] args) {
		Calculator_2 frame = new Calculator_2();
		frame.setVisible(true);	//���ô������ɼ�
	}
}

class Number extends JPanel {
	
	private static final long serialVersionUID = 1L;
	JTextField text = new JTextField("0");
	
	@SuppressWarnings("deprecation")
	Number() {
		text.setHorizontalAlignment(SwingConstants.RIGHT); // ����������ֻ�õ��Ľ����text���ұ���ʾ
		text.enable(false); // �ı����ܱ༭
		setLayout(new BorderLayout()); // �趨���ֹ������߿򲼾�
		add(text, BorderLayout.CENTER); // number�����ڴ�����м�
	}
}

class Keys extends JPanel {
	
	private static final long serialVersionUID = 1L;
	JButton one = new JButton("1"); // ���ּ�1
	JButton two = new JButton("2"); // ���ּ�2
	JButton three = new JButton("3"); // ���ּ�3
	JButton four = new JButton("4"); // ���ּ�4
	JButton five = new JButton("5"); // ���ּ�5
	JButton six = new JButton("6"); // ���ּ�6
	JButton seven = new JButton("7"); // ���ּ�7
	JButton eight = new JButton("8"); // ���ּ�8
	JButton nine = new JButton("9"); // ���ּ�9
	JButton zero = new JButton("0"); // ���ּ�0

	JButton plus = new JButton("+"); // �����+
	JButton sub = new JButton("-"); // �����-
	JButton mul = new JButton("*"); // �����*
	JButton div = new JButton("/"); // �����/
	JButton equ = new JButton("="); // �����=
	JButton poi = new JButton("."); // С����.

	Keys() {
		setLayout(new GridLayout(4, 4, 2, 2)); // ���岼�ֹ�����Ϊ���񲼾�
		setBackground(Color.white);

		add(seven);
		add(eight);
		add(nine);
		add(div);

		add(four);
		add(five);
		add(six);
		add(mul);

		add(one);
		add(two);
		add(three);
		add(sub);

		add(zero);
		add(poi);
		add(equ);
		add(plus);

		one.setForeground(Color.blue);
		two.setForeground(Color.blue);
		three.setForeground(Color.blue);
		four.setForeground(Color.blue);
		five.setForeground(Color.blue);
		six.setForeground(Color.blue);
		seven.setForeground(Color.blue);
		eight.setForeground(Color.blue);
		nine.setForeground(Color.blue);
		zero.setForeground(Color.blue);
		poi.setForeground(Color.blue);
		equ.setForeground(Color.red);
		plus.setForeground(Color.red);
		sub.setForeground(Color.red);
		mul.setForeground(Color.red);
		div.setForeground(Color.red);
	}
}
*/