import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MyMouseDraw extends JPanel implements MouseListener,MouseMotionListener{
	public MyMouseDraw(){
		JButton b = new JButton("Erase");

		this.setBackground(Color.WHITE);
		b.setSize(10,30);

		MouseListener ML = new MouseListener(){
			//使用しないメソッドも空でよいので実装
			public void mouseClicked(MouseEvent e){}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
			public void mousePressed(MouseEvent e){
			Graphics g = getGraphics();
			paintComponent(g);

		}
		public void mouseReleased(MouseEvent e){}
		};

		b.addMouseListener(ML);
		this.add(b);
		addMouseListener(this);
		addMouseMotionListener(this);

	}
	public void mouseDragged(MouseEvent e){
		Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX()-2, e.getY(), 5, 5);
	}
	public void mouseMoved(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseXXXXX(MouseEvent e){

	}

}
