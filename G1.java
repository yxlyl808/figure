package keshe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class G1 extends JFrame implements ActionListener{ //ActionListener�ӿ��Ƕ����¼�������
	JButton a1; //������ť
	JLabel b1,b2,b3,b4,b5; //������ǩ

	public G1(){
		b1=new JLabel("------��������Ϸ------"); //��ǩ��ʼ��
		b1.setFont(new java.awt.Font("΢���ź�",1,37)); //���ñ�ǩ���������ͣ��Ӵ֣��ֺŴ�С
		b2=new JLabel("��Ϸ˵����");
		b2.setFont(new java.awt.Font("΢���ź�",1,20));
		b3=new JLabel("����������������99����С0��");
		b3.setFont(new java.awt.Font("΢���ź�",1,20));
		b4=new JLabel("���м�ʤ���²�������Ų£�ֱ������Ϊֹ��");
		b4.setFont(new java.awt.Font("΢���ź�",1,20));
		b5=new JLabel("��Ϸ��ʱ����25��Ϊ��꣡");
		b5.setFont(new java.awt.Font("΢���ź�",1,20));
		a1=new JButton("ȷ��");
		a1.setFont(new java.awt.Font("΢���ź�",1,20));
		this.setTitle("��������Ϸ"); //�����ʼ��
		this.setSize(700,700); //�����С
		this.setLayout(null); //��ʹ��Ĭ�ϲ���
		this.setLocationRelativeTo(null);//����Ļ�м������ʾ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //�رս�������ֹͣ����
	    this.setVisible(true); //����ɼ�
	    b1.setBounds(140,15,450,75); //���ñ�ǩ��λ�úʹ�С
	    b2.setBounds(50,90,400,75);
	    b3.setBounds(150,130,400,75);
	    b4.setBounds(150,210,400,75);
	    b5.setBounds(150,290,400,75);
	    a1.setBounds(220,410,220,50);
	    this.add(b1); //���뵽������
	    this.add(b2);
	    this.add(b3);
	    this.add(b4);
	    this.add(b5);
	    this.add(a1);
	    a1.addActionListener(this); //�����¼�����
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="ȷ��" ) //��ť�����£������¼�
		{
			JOptionPane.showMessageDialog(null,"��������Ѳ��� ��");
			dispose(); //ʹ������ʧ
			new G2();
		}
	}  
}
