package Package01;
/*
 * some thing add by zw.
 * some thing new
 * 417753294@qq.com
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
	
	Number number = new Number();	//显示界面
	Keys keys = new Keys();		//按钮盘
	JButton clear = new JButton("清零");		//清零按钮
	
	boolean flag = false; // 当点击按钮+、-、*、/时，flag = true
	int i = 0; // 当i=0时说明是我们第一次输入，字符串text不会累加
	String text = ""; // 存放text的内容
	double save = 0; // 存放点击按钮+、-、*、/之前的数值
	int symbol = 0; // +、-、*、/的代号分别为1，2，3，4
	
	
	Calculator() {
		setTitle("计算器"); // 设定标题
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设定关闭窗体时退出程序
		
		JPanel pane = new JPanel(); // 定义主面板
		pane.setLayout(new BorderLayout()); // 设置容器为边界布局管理器
		setBounds(300, 300, 200, 250); // 前两个参数是在屏幕上显示的坐标，后两个是大小
		
		pane.add(number, BorderLayout.NORTH);
		pane.add(keys, BorderLayout.CENTER);
		pane.add(clear, BorderLayout.SOUTH);
		
		setContentPane(pane);
		
		keys.one.addActionListener(this); // 对1按钮添加监听事件
		keys.two.addActionListener(this); // 对2按钮添加监听事件
		keys.three.addActionListener(this); // 对3按钮添加监听事件
		keys.four.addActionListener(this); // 对4按钮添加监听事件
		keys.five.addActionListener(this); // 对5按钮添加监听事件
		keys.six.addActionListener(this); // 对6按钮添加监听事件
		keys.seven.addActionListener(this); // 对7按钮添加监听事件
		keys.eight.addActionListener(this); // 对8按钮添加监听事件
		keys.nine.addActionListener(this); // 对9按钮添加监听事件
		keys.zero.addActionListener(this); // 对0按钮添加监听事件

		keys.plus.addActionListener(this); // 对+按钮添加监听事件
		keys.equ.addActionListener(this); // 对=按钮添加监听事件
		keys.sub.addActionListener(this); // 对-按钮添加监听事件
		keys.mul.addActionListener(this); // 对*按钮添加监听事件
		keys.div.addActionListener(this); // 对/按钮添加监听事件
		keys.poi.addActionListener(this); // 对.按钮添加监听事件

		clear.addActionListener(this);// 对“清零”按钮添加监听事件
	}
	
	public void actionPerformed(ActionEvent e) {
		/*
		 * 如果是点击数字按钮那么先要判断是否在此之前点击了+、-、*、/、=，
		 * 如果是，那么flag=true；如果没有flag=false
		 * 或者是否点击数字键，如果是i = 1,如果没有 i = 0;
		 */

		if (e.getSource() == keys.one) {	//getSource 是返回触发事件的对象。如果是按钮，则getSource就是按钮
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
		 * 为了避免出现如00000这样的情况，需要增加判断条件：如果text中的数值=0就要判断在这个数值中是否有小数点存在
		 * 如果有，那么就在原来数值基础之上添 加0；否则保持原来的数值不变
		 */
		else if(e.getSource() == keys.zero) {
			if(flag || i == 0) {
				number.text.setText("0");
				flag = false;
				i = 1;
			}else {
				text = number.text.getText();
				// number.text.setText(text + "0"); 	//直接这样就会有0000出现
				if(Float.parseFloat(text) != 0) {   // Float.parseFloat(text)就是类型转换
					number.text.setText(text + "0");	//如果数值不为0，则直接添加0
				}else {		//如果数值为0，那么判断有没有小数点
					if(text.trim().indexOf(".") == -1)	{
						number.text.setText(text);	//没有找到小数点则返回-1，输入0 文本不加0
					}else {
						number.text.setText(text + "0");	//找到小数点，输入0后文本加0
					}
				}
			}		//trim() 去掉字符串开头和结尾的空格,防止不必要的空格导致的错误。
					//indexOf 方法返回 String 对象内第一次出现子字符串的字符位置，指出 String 对象内子字符串的开始位置。
					//即indexOf()括号内所包含的字符在该字符串内的循序位置，在第几位就返回几-1，
					//如果有重复的字符出现，以第一个字符为准。如果没有找到子字符串， 则返回 -1。
		}

			//本程序不会让一个数值中出现2个以上的小数点.具体做法是:判断是否已经存在.存在就不添加, 不存在就添加.
			else if(e.getSource() == keys.poi) {
				if(flag || i == 0) {
					number.text.setText("0.");
					flag = false;
					i = 1;
				}else {
					text = number.text.getText();
					if(text.trim().indexOf(".") == -1) {	//没有找到小数点则返回-1，输入小数点文本加小数点
						number.text.setText(text + ".");
					}else {
						number.text.setText(text);		//找到小数点，输入小数点后文本不加小数点
					}
				}
			}
			//	设置清零
			else if(e.getSource() == clear) {
				number.text.setText("0");
				i = 0;
				flag = true;
				save = 0;
				System.out.println("******************************************************");
			}
			
		//设置获取+ - * / 前的数字
			else if (e.getSource() == keys.plus) {	// 获得点击+之前的数值
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 1;
				System.out.print(number.text.getText() + "  +  ");
			}
			else if(e.getSource() == keys.sub) {	// 获得点击-之前的数值
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 2;
				System.out.print(number.text.getText() + "  -  ");
			}
			else if(e.getSource() == keys.mul) {	// 获得点击*之前的数值
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 3;
				System.out.print(number.text.getText() + "  *  ");
			}
			else if(e.getSource() == keys.div) {	// 获得点击/之前的数值
				flag = true;
				i = 0;
				save = Double.parseDouble(number.text.getText());
				symbol = 4;
				System.out.print(number.text.getText() + "  /  ");
			}
		
		//设置按下等号按钮后的计算
			else if(e.getSource() == keys.equ) {
				System.out.print(number.text.getText() + "  =  ");
				switch(symbol) {
				case 1: {
					double ans = save + Double.parseDouble(number.text.getText());
					i = 0;
					number.text.setText(ans + "");	//由于setText后必须是字符串String类的，所以增加一个""把double类的ans转为字符串
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
		frame.setVisible(true);	//设置窗体界面可见
	}
}

class Number extends JPanel {

	private static final long serialVersionUID = 1L;
	JTextField text = new JTextField("0");
	
	@SuppressWarnings("deprecation")
	Number() {
		text.setHorizontalAlignment(SwingConstants.RIGHT); // 讲输入的数字或得到的结果在text的右边显示
		text.enable(false); // 文本框不能编辑
		setLayout(new BorderLayout()); // 设定布局管理器边框布局
		add(text, BorderLayout.CENTER); // number放置在窗体的中间
	}
}

class Keys extends JPanel {

	private static final long serialVersionUID = 1L;
	JButton one = new JButton("1"); // 数字键1
	JButton two = new JButton("2"); // 数字键2
	JButton three = new JButton("3"); // 数字键3
	JButton four = new JButton("4"); // 数字键4
	JButton five = new JButton("5"); // 数字键5
	JButton six = new JButton("6"); // 数字键6
	JButton seven = new JButton("7"); // 数字键7
	JButton eight = new JButton("8"); // 数字键8
	JButton nine = new JButton("9"); // 数字键9
	JButton zero = new JButton("0"); // 数字键0

	JButton plus = new JButton("+"); // 运算键+
	JButton sub = new JButton("-"); // 运算键-
	JButton mul = new JButton("*"); // 运算键*
	JButton div = new JButton("/"); // 运算键/
	JButton equ = new JButton("="); // 运算键=
	JButton poi = new JButton("."); // 小数点.

	Keys() {
		setLayout(new GridLayout(4, 4, 2, 2)); // 定义布局管理器为网格布局
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