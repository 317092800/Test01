package Package01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
//创建一个窗体
public class Calculator_1 extends JFrame {

	Calculator_1() {
		setTitle("计算器"); // 设定标题
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设定关闭窗体时退出程序
		
		JPanel pane = new JPanel(); // 定义主面板
		pane.setLayout(new BorderLayout()); // 设置容器为边界布局管理器
		setBounds(300, 300, 200, 250); // 前两个参数是在屏幕上显示的坐标，后两个是大小
	}
	
	public static void main(String[] args) {
		Calculator_1 frame = new Calculator_1();
		frame.setVisible(true);	//设置窗体界面可见
	}
}
