import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class MyCanvas extends JPanel{
public MyCanvas(){

}


public void paintComponent(Graphics g){
super.paintComponent(g);

Graphics2D g2 = (Graphics2D)g;

g2.setColor(Color.GREEN);
g2.fill3DRect(50, 50, 50, 100, false);
g2.setColor(Color.BLUE);
g2.fill3DRect(100, 50, 50, 100, false);
g2.setColor(Color.RED);
g2.fill3DRect(150, 50, 50, 100, false);

Dimension d = getSize();
g.drawLine(0,0,d.width,d.height);
g.drawLine(0,d.height,d.width,0);

}
}