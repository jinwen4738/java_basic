/**
 * 
 */
/**
 * @author jinwen
 *
 */
package ��087��_��Ϸ��Ŀ����_������Ϸ������;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author ���
 *
 */
public class MyGameFrame/*�ɻ���Ϸ������*/  extends  JFrame {//�̳�
	
	/**
	 * ��ʼ������
	 */
	public  void  launchFrame(){//��ʼ������
		this.setTitle("��ѧ��ѧԱ_����Գ��Ʒ");//�����ڼӸ����⣬this�ķ����̳��˷���
		this.setVisible(true);//����Ĭ���ǲ��ɼ��ģ�����ɼ�
		this.setSize(500, 500);//���������ÿ�ȡ��߶�
		this.setLocation(300, 300);//���ڳ��ֵ�λ��
		
		this.addWindowListener(new WindowAdapter() {//�����ڲ��࣬
			@Override
			public void windowClosing(WindowEvent e) {//��дwindowClosing�����ڹرգ��ķ���
				System.exit(0);//������������У�0��ʾ����������
			}
		});
		
	}
	
	public static void main(String[] args) {
		MyGameFrame  f = new MyGameFrame();//�������ڶ���
		f.launchFrame();//���÷���
	}
	
}
