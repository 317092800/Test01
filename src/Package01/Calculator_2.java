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
	
	Number number = new Number();	//显示界面
	Keys keys = new Keys();		//按钮盘
	JButton clear = new JButton("清零");		//清零按钮
	
	Calculator_2() {
		setTitle("计算器"); // 设定标题
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设定关闭窗体时退出程序
		
		JPanel pane = new JPanel(); // 定义主面板
		pane.setLayout(new BorderLayout()); // 设置容器为边界布局管理器
		setBounds(300, 300, 200, 250); // 前两个参数是在屏幕上显示的坐标，后两个是大小
		
		pane.add(number, BorderLayout.NORTH);
		pane.add(keys, BorderLayout.CENTER);
		pane.add(clear, BorderLayout.SOUTH);
		
		setContentPane(pane);		//我们可以在JFrame对象中添加Swing组件。但是，虽然它有add方法，却不能直接用于添加组件
		
	}
	
	public static void main(String[] args) {
		Calculator_2 frame = new Calculator_2();
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
*/