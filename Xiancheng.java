package keshe;

import javax.swing.JOptionPane;

public class Xiancheng extends Thread{
	static boolean yunxing=true; //�Ƿ��Ѿ��¶�
	long kaishi=System.currentTimeMillis(); //��¼��ʼʱ��
	long shijian; //����ʱ��
	
    public void run() {
    	while (true) {
            if (yunxing==true) {  
                shijian=System.currentTimeMillis()-kaishi;  
                G2.b3.setText(format(shijian));
            }
            else {
            	break;
            }
    	}
    	if (shijian/1000<25) {
    		JOptionPane.showMessageDialog(null,"�������Ϊ����꣡");
		}
		else {
			JOptionPane.showMessageDialog(null,"�������Ϊ��̫���ˣ�");
		}
    }
    
    private String format(long shijian) { //����������ʽ�� 
        int m,s,ms;  
        ms=(int)(shijian%1000);  
        shijian=shijian/1000;  
        s=(int)(shijian%60);  
        shijian=shijian/60;  
        m=(int)(shijian%60);  
        shijian=shijian/60;
        return String.format("%02d:%02d %03d",m,s,ms);  
    }
}
