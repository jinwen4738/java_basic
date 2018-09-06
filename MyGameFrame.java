/**
 * 
 */
/**
 * @author jinwen
 *
 */
package 第087讲_游戏项目介绍_建立游戏主窗口;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 高淇
 *
 */
public class MyGameFrame/*飞机游戏主窗口*/  extends  JFrame {//继承
	
	/**
	 * 初始化窗口
	 */
	public  void  launchFrame(){//初始化方法
		this.setTitle("尚学堂学员_程序猿作品");//给窗口加个标题，this的方法继承了方法
		this.setVisible(true);//窗口默认是不可见的，这里可见
		this.setSize(500, 500);//给窗口设置宽度、高度
		this.setLocation(300, 300);//窗口出现的位置
		
		this.addWindowListener(new WindowAdapter() {//匿名内部类，
			@Override
			public void windowClosing(WindowEvent e) {//重写windowClosing（窗口关闭）的方法
				System.exit(0);//结束虚拟机运行，0表示正常结束。
			}
		});
		
	}
	
	public static void main(String[] args) {
		MyGameFrame  f = new MyGameFrame();//创建窗口对象
		f.launchFrame();//调用方法
	}
	
}
