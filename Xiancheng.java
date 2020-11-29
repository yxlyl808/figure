package keshe;

import javax.swing.JOptionPane;

public class Xiancheng extends Thread{
	static boolean yunxing=true; //是否已经猜对
	long kaishi=System.currentTimeMillis(); //记录开始时间
	long shijian; //运行时间
	
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
    		JOptionPane.showMessageDialog(null,"你的评价为：达标！");
		}
		else {
			JOptionPane.showMessageDialog(null,"你的评价为：太慢了！");
		}
    }
    
    private String format(long shijian) { //将毫秒数格式化 
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
