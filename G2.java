package keshe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class G2 extends JFrame implements ActionListener{ //ActionListener接口是动作事件监听器
	JButton a1,a2; //创建按钮
	JLabel b1,b2; //创建标签
	static JLabel b3;
	JLabel b4;
	JTextField d1; //创建文本框
	int n=new Random().nextInt(100); //生成随机数
	int i=1; //第几次猜
	int a; //猜的数
    Xiancheng thread=new Xiancheng(); //计数线程  

	public G2(){
		b1=new JLabel("------猜数字游戏------"); //标签初始化
		b1.setFont(new java.awt.Font("微软雅黑",1,37)); //设置标签的字体类型，加粗，字号大小
		b2=new JLabel("第1次猜:");
		b2.setFont(new java.awt.Font("微软雅黑",1,20));
		b3=new JLabel("00:00 000");
		b3.setFont(new java.awt.Font("微软雅黑",1,30));
		b4=new JLabel("");
		b4.setFont(new java.awt.Font("微软雅黑",1,30));
		a1=new JButton("确定");
		a1.setFont(new java.awt.Font("微软雅黑",1,15));
		a2=new JButton("清空");
		a2.setFont(new java.awt.Font("微软雅黑",1,15));
		d1=new JTextField(15);
		d1.setFont(new java.awt.Font("微软雅黑",1,25));
		this.setTitle("猜数字游戏"); //界面初始化
		this.setSize(700,700); //界面大小
		this.setLayout(null); //不使用默认布局
		this.setLocationRelativeTo(null);//在屏幕中间居中显示
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //关闭界面后程序停止运行
	    this.setVisible(true); //界面可见
	    b1.setBounds(140,15,450,75); //设置标签的位置和大小
	    b2.setBounds(230,260,450,75);
	    b3.setBounds(250,120,450,75);
	    b4.setBounds(300,470,450,75);
	    a1.setBounds(200,370,120,50);
	    a2.setBounds(360,370,120,50);
	    d1.setBounds(330,260,80,75);
	    this.add(b1); //加入到界面中
	    this.add(b2);
	    this.add(b3);
	    this.add(b4);
	    this.add(a1);
	    this.add(a2);
	    this.add(d1);
	    a1.addActionListener(this); //动作事件监听
	    a2.addActionListener(this);
	    thread.start();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="确定" ) //按钮被按下，触发事件
		{
			cai();
		}
		else {
			d1.setText(""); //清空
		}
	} 

	public void cai() {
	    try {
	    	a=Integer.parseInt(d1.getText());
    	    if (n<a) {
    	    	b4.setText("猜大了！");
		    }
		    if (n>a) {
		    	b4.setText("猜小了！");
		    }
		    if (n==a) {
		    	b4.setText("猜对了！");
		    	Xiancheng.yunxing=false; //让计时停止
		    	return;
		    }
		    i++;
		    b2.setText("第"+i+"次猜:");
        }catch(NumberFormatException e) {
        	b4.setText("输入错误，重新输入!");
        }
	}
}
