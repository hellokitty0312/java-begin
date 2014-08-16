import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;


public class AppletPlusThread1 extends JApplet implements Runnable{

	public void init(){
		JPanel p = new JPanel();
		JButton b = new JButton("Draw Graphics");

		p.setBackground(Color.white);
		b.setSize(10,30);
		b.setForeground(new Color(50,50,200));
		this.setSize(256,256);

		MouseListener ML = new MouseListener(){
			public void mouseClicked(MouseEvent e){}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
			public void mousePressed(MouseEvent e){
				Graphics g = getGraphics();
				paint(g);
			}
			public void mouseReleased(MouseEvent e){}


		};
		b.addMouseListener(ML);
		p.add(b);
		this.add(p);

		//Threadのinstantiationと開始
		Thread t = new Thread(this);
		t.start();

	}

	public void paint(Graphics g){
       Dimension d = getSize();
       g.setColor(
    		 new Color(
    		   (int)(Math.random() * 256),
    		   (int)(Math.random() * 256),
    		   (int)(Math.random() * 256)
    		   )
    		   );
       g.fillRect(
    		   (int)(Math.random() * d.width)-25,
    		   (int)(Math.random() * d.height)-25,
    		   50,
    		   50
    		   );
	}

	public void run(){
		while(true){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		Graphics g = getGraphics();
		Dimension d = getSize();
		g.setColor(
	    		 new Color(
	    		   (int)(Math.random() * 256),
	    		   (int)(Math.random() * 256),
	    		   (int)(Math.random() * 256)
	    		   )
	    		   );
		g.fillOval(
			   (int)(Math.random() * d.width)-25,
    		   (int)(Math.random() * d.height)-25,
    		   50,
    		   50
    		   );

		}
	}

}
