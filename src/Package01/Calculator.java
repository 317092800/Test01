package Package01;
/*
 * some thing add by zw.
 * some thing new
 * 417753294@qq.com
 * lyh
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	Number number = new Number();	//��ʾ����
	Keys keys = new Keys();		//��ť��
	JButton clear = new JButton("����");		//���㰴ť
	
	boolean flag = false; // �������ť+��-��*��/ʱ��flag = true
	int i = 0; // ��i=0ʱ˵�������ǵ�һ�����룬�ַ���text�����ۼ�
	String text = ""; // ���text������
	double save = 0; // ��ŵ����ť+��-��*��/֮ǰ����ֵ
	int symbol = 0; // +��-��*��/�Ĵ��ŷֱ�Ϊ1��2��3��4
	
	
	Calculator() {
		setTitle("������"); // �趨����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �趨�رմ���ʱ�˳�����
		
		JPanel pane = new JPanel(); // ���������
		pane.setLayout(new BorderLayout()); // ��������Ϊ�߽粼�ֹ�����
		setBounds(300, 300, 200, 250); // ǰ��������������Ļ����ʾ�����꣬�������Ǵ�С
		
		pane.add(number, BorderLayout.NORTH);
		pane.add(keys, BorderLayout.CENTER);
		pane.add(clear, BorderLayout.SOUTH);
		
		setContentPane(pane);
		
		keys.one.addActionListener(this); // ��1��ť��Ӽ����¼�
		keys.two.addActionListener(this); // ��2��ť��Ӽ����¼�
		keys.three.addActionListener(this); // ��3��ť��Ӽ����¼�
		keys.four.addActionListener(this); // ��4��ť��Ӽ����¼�
		keys.five.addActionListener(this); // ��5��ť��Ӽ����¼�
		keys.six.addActionListener(this); // ��6��ť��Ӽ����¼�
		keys.seven.addActionListener(this); // ��7��ť��Ӽ����¼�
		keys.eight.addActionListener(this); // ��8��ť��Ӽ����¼�
		keys.nine.addActionListener(this); // ��9��ť��Ӽ����¼�
		keys.zero.addActionListener(this); // ��0��ť��Ӽ����¼�

		keys.plus.addActionListener(this); // ��+��ť��Ӽ����¼�
		keys.equ.addActionListener(this); // ��=��ť��Ӽ����¼�
		keys.sub.addActionListener(this); // ��-��ť��Ӽ����¼�
		keys.mul.addActionListener(this); // ��*��ť��Ӽ����¼�
		keys.div.addActionListener(this); // ��/��ť��Ӽ����¼�
		keys.poi.addActionListener(this); // ��.��ť��Ӽ����¼�

		clear.addActionListener(this);// �ԡ����㡱��ť��Ӽ����¼�
	}
	
	public void actionPerformed(ActionEvent e) {
		/*
		 * ����ǵ�����ְ�ť��ô��Ҫ�ж��Ƿ��ڴ�֮ǰ�����+��-��*��/��=��
		 * ����ǣ���ôflag=true�����û��flag=false
		 * �����Ƿ������ּ��������i = 1,���û�� i = 0;
		 */

		if (e.getSource() == keys.one) {	//getSource �Ƿ��ش����¼��Ķ�������ǰ�ť����getSource���ǰ�ť
			if (flag || i == 0) {
				number.text.setText("1");
				flag = false;
				i = 1;
			} else {
				text = number.text.getText();
				number.text.setText(text + "1");
			}
		}
		else if(e.getSource() == keys.two) {
			if(flag || i == 0) {
				number.text.setText("2");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				number.text.setText(text + "2"); 
			}
		}
		else if(e.getSource() == keys.three) {
			if(flag || i == 0) {
				number.text.setText("3");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				number.text.setText(text + "3"); 
			}
		}
		else if(e.getSource() == keys.four) {
			if(flag || i == 0) {
				number.text.setText("4");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				number.text.setText(text + "4"); 
			}
		}
		else if(e.getSource() == keys.five) {
			if(flag || i == 0) {
				number.text.setText("5");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				number.text.setText(text + "5"); 
			}
		}
		else if(e.getSource() == keys.six) {
			if(flag || i == 0) {
				number.text.setText("6");
				i = 1;
				flag = false;
			}else {
				text = number.text.getText();
				number.text.setText(text + "6"); 
			}
		}
		else if(e.getSource() == keys.seven) {
			if(flag || i == 0) {
				number.text.setText("7");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				number.text.setText(text + "7"); 
			}
		}
		else if(e.getSource() == keys.eight) {
			if(flag || i == 0) {
				number.text.setText("8");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				number.text.setText(text + "8"); 
			}
		}
		else if(e.getSource() == keys.nine) {
			if(flag || i == 0) {
				number.text.setText("9");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				number.text.setText(text + "9"); 
			}
		}
		/*
		 * Ϊ�˱��������00000�������������Ҫ�����ж����������text�е���ֵ=0��Ҫ�ж��������ֵ���Ƿ���С�������
		 * ����У���ô����ԭ����ֵ����֮���� ��0�����򱣳�ԭ������ֵ����
		 */
		else if(e.getSource() == keys.zero) {
			if(flag || i == 0) {
				number.text.setText("0");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				// number.text.setText(text + "0"); 	//ֱ�������ͻ���0000����
				if(Float.parseFloat(text) != 0) {   // Float.parseFloat(text)��������ת��
					number.text.setText(text + "0");	//�����ֵ��Ϊ0����ֱ�����0
				}else {		//�����ֵΪ0����ô�ж���û��С����
					if(text.trim().indexOf(".") == -1)	{
						number.text.setText(text);	//û���ҵ�С�����򷵻�-1������0 �ı�����0
					}else {
						number.text.setText(text + "0");	//�ҵ�С���㣬����0���ı���0
					}
				}
			}		//trim() ȥ���ַ�����ͷ�ͽ�β�Ŀո�,��ֹ����Ҫ�Ŀո��µĴ���
					//indexOf �������� String �����ڵ�һ�γ������ַ������ַ�λ�ã�ָ�� String ���������ַ����Ŀ�ʼλ�á�
					//��indexOf()���������������ַ��ڸ��ַ����ڵ�ѭ��λ�ã��ڵڼ�λ�ͷ��ؼ�-1��
					//������ظ����ַ����֣��Ե�һ���ַ�Ϊ׼�����û���ҵ����ַ����� �򷵻� -1��
		}

			//�����򲻻���һ����ֵ�г���2�����ϵ�С����.����������:�ж��Ƿ��Ѿ�����.���ھͲ����, �����ھ����.
			else if(e.getSource() == keys.poi) {
				if(flag || i == 0) {
					number.text.setText("0.");
					flag = false;
					i = 1;
				}else {
					text = number.text.getText();
					if(text.trim().indexOf(".") == -1) {	//û���ҵ�С�����򷵻�-1������С�����ı���С����
						number.text.setText(text + ".");
					}else {
						number.text.setText(text);		//�ҵ�С���㣬����С������ı�����С����
					}
				}
			}
			//	��������
			else if(e.getSource() == clear) {
				number.text.setText("0");
				i = 0;
				flag = true;
				save = 0;
				System.out.println("******************************************************");
			}
			
		//���û�ȡ+ - * / ǰ������
			else if (e.getSource() == keys.plus) {	// ��õ��+֮ǰ����ֵ
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 1;
				System.out.print(number.text.getText() + "  +  ");
			}
			else if(e.getSource() == keys.sub) {	// ��õ��-֮ǰ����ֵ
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 2;
				System.out.print(number.text.getText() + "  -  ");
			}
			else if(e.getSource() == keys.mul) {	// ��õ��*֮ǰ����ֵ
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 3;
				System.out.print(number.text.getText() + "  *  ");
			}
			else if(e.getSource() == keys.div) {	// ��õ��/֮ǰ����ֵ
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 4;
				System.out.print(number.text.getText() + "  /  ");
			}
		
		//���ð��µȺŰ�ť��ļ���
			else if(e.getSource() == keys.equ) {
				System.out.print(number.text.getText() + "  =  ");
				switch(symbol) {
				case 1: {
					double ans = save + Double.parseDouble(number.text.getText());
					i = 0;
					number.text.setText(ans + "");	//����setText��������ַ���String��ģ���������һ��""��double���ansתΪ�ַ���
					System.out.println(ans);
					break;
				}
				case 2: {
					double ans = save - Double.parseDouble(number.text.getText());
					i = 0;
					number.text.setText(ans + ""); 
					System.out.println(ans);
					break;
				}
				case 3: {
					double ans = save * Double.parseDouble(number.text.getText());
					i = 0;
					number.text.setText(ans + ""); 
					System.out.println(ans);
					break;
				}
				case 4: {
					double ans = save / Double.parseDouble(number.text.getText());
					i = 0;
					number.text.setText(ans + ""); 
					System.out.println(ans);
					break;
				}default: {
					;
				}
			}
			
			}
			
		
	}
	
	public static void main(String[] args) {
		Calculator frame = new Calculator();
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