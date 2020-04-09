
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;//С�������
	double y = 100;//С��������
	boolean right = true;//����
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("������");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if(right) {
			x = x+10;
		}else {
			x = x-10;
		}
		if(x>856-40-30) {//30��С��ֱ����40�����ӱ߿�
			right = false;
		}
		if(x<40) {
			right = true;
		}
	}
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//�ػ�����,ÿ�뻭25��
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println("ˢ��");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
