package keshe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class G1 extends JFrame implements ActionListener{ //ActionListener接口是动作事件监听器
	JButton a1; //创建按钮
	JLabel b1,b2,b3,b4,b5; //创建标签

	public G1(){
		b1=new JLabel("------猜数字游戏------"); //标签初始化
		b1.setFont(new java.awt.Font("微软雅黑",1,37)); //设置标签的字体类型，加粗，字号大小
		b2=new JLabel("游戏说明：");
		b2.setFont(new java.awt.Font("微软雅黑",1,20));
		b3=new JLabel("产生随机整数，最大99，最小0。");
		b3.setFont(new java.awt.Font("微软雅黑",1,20));
		b4=new JLabel("猜中即胜，猜不中则接着猜，直至猜中为止。");
		b4.setFont(new java.awt.Font("微软雅黑",1,20));
		b5=new JLabel("游戏用时低于25秒为达标！");
		b5.setFont(new java.awt.Font("微软雅黑",1,20));
		a1=new JButton("确定");
		a1.setFont(new java.awt.Font("微软雅黑",1,20));
		this.setTitle("猜数字游戏"); //界面初始化
		this.setSize(700,700); //界面大小
		this.setLayout(null); //不使用默认布局
		this.setLocationRelativeTo(null);//在屏幕中间居中显示
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //关闭界面后程序停止运行
	    this.setVisible(true); //界面可见
	    b1.setBounds(140,15,450,75); //设置标签的位置和大小
	    b2.setBounds(50,90,400,75);
	    b3.setBounds(150,130,400,75);
	    b4.setBounds(150,210,400,75);
	    b5.setBounds(150,290,400,75);
	    a1.setBounds(220,410,220,50);
	    this.add(b1); //加入到界面中
	    this.add(b2);
	    this.add(b3);
	    this.add(b4);
	    this.add(b5);
	    this.add(a1);
	    a1.addActionListener(this); //动作事件监听
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="确定" ) //按钮被按下，触发事件
		{
			JOptionPane.showMessageDialog(null,"随机整数已产生 ！");
			dispose(); //使窗体消失
			new G2();
		}
	}  
}
