package keshe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class G2 extends JFrame implements ActionListener{ //ActionListener�ӿ��Ƕ����¼�������
	JButton a1,a2; //������ť
	JLabel b1,b2; //������ǩ
	static JLabel b3;
	JLabel b4;
	JTextField d1; //�����ı���
	int n=new Random().nextInt(100); //���������
	int i=1; //�ڼ��β�
	int a; //�µ���
    Xiancheng thread=new Xiancheng(); //�����߳�  

	public G2(){
		b1=new JLabel("------��������Ϸ------"); //��ǩ��ʼ��
		b1.setFont(new java.awt.Font("΢���ź�",1,37)); //���ñ�ǩ���������ͣ��Ӵ֣��ֺŴ�С
		b2=new JLabel("��1�β�:");
		b2.setFont(new java.awt.Font("΢���ź�",1,20));
		b3=new JLabel("00:00 000");
		b3.setFont(new java.awt.Font("΢���ź�",1,30));
		b4=new JLabel("");
		b4.setFont(new java.awt.Font("΢���ź�",1,30));
		a1=new JButton("ȷ��");
		a1.setFont(new java.awt.Font("΢���ź�",1,15));
		a2=new JButton("���");
		a2.setFont(new java.awt.Font("΢���ź�",1,15));
		d1=new JTextField(15);
		d1.setFont(new java.awt.Font("΢���ź�",1,25));
		this.setTitle("��������Ϸ"); //�����ʼ��
		this.setSize(700,700); //�����С
		this.setLayout(null); //��ʹ��Ĭ�ϲ���
		this.setLocationRelativeTo(null);//����Ļ�м������ʾ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //�رս�������ֹͣ����
	    this.setVisible(true); //����ɼ�
	    b1.setBounds(140,15,450,75); //���ñ�ǩ��λ�úʹ�С
	    b2.setBounds(230,260,450,75);
	    b3.setBounds(250,120,450,75);
	    b4.setBounds(300,470,450,75);
	    a1.setBounds(200,370,120,50);
	    a2.setBounds(360,370,120,50);
	    d1.setBounds(330,260,80,75);
	    this.add(b1); //���뵽������
	    this.add(b2);
	    this.add(b3);
	    this.add(b4);
	    this.add(a1);
	    this.add(a2);
	    this.add(d1);
	    a1.addActionListener(this); //�����¼�����
	    a2.addActionListener(this);
	    thread.start();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="ȷ��" ) //��ť�����£������¼�
		{
			cai();
		}
		else {
			d1.setText(""); //���
		}
	} 

	public void cai() {
	    try {
	    	a=Integer.parseInt(d1.getText());
    	    if (n<a) {
    	    	b4.setText("�´��ˣ�");
		    }
		    if (n>a) {
		    	b4.setText("��С�ˣ�");
		    }
		    if (n==a) {
		    	b4.setText("�¶��ˣ�");
		    	Xiancheng.yunxing=false; //�ü�ʱֹͣ
		    	return;
		    }
		    i++;
		    b2.setText("��"+i+"�β�:");
        }catch(NumberFormatException e) {
        	b4.setText("���������������!");
        }
	}
}
