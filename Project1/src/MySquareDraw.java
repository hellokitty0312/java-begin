import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MySquareDraw extends JPanel{
	public MySquareDraw(){


			JButton b = new JButton("Draw Graphics");


			b.setSize(10,30);
			b.setForeground(new Color(50,50,200));


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
			this.add(b);


		}



	public void paintComponent(Graphics g){
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
}
