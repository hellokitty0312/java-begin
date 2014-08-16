// Shooting stars
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Anime6b extends Applet implements Runnable {
	int x, y, dx, dy, r;
	final static int WIDTH = 500;
	final static int HEIGHT = 500;
	int dist,dist2;
	Thread th;

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		this.setBackground(Color.BLACK);
		x = (int) (Math.random() * WIDTH);
		y = 0;
		dist = (int) 250;
		dx = 3;
		dy = 3;
		r = 15;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		while (th != null) {


			repaint();

			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// do nothing
			}

		    if(dist2>=250){
			if(y<500&& x> 0 && x<500){
				x=x+dx;
				y=y+dy;
			}
			else {
				x = (int) (Math.random() * WIDTH);
				y = 0;
				dist2= (int)(Math.random()*500);
			}}
		    else{
		    	if(y<500 && x>0 && x<500){
				x=x-dx;
				y=y+dy;
			}
			else {
				x = (int) (Math.random() * WIDTH);
				y = 0;
				dist2= (int)(Math.random()*500);
			}}
		}
	}

	public void paint(Graphics g) {



			g.setColor(Color.white);
			g.fillOval(x, y, r, r+5);



	}

	public void update(Graphics g) { // double buffering
		Image dbImage = null;
		Graphics dbg = null;
		// initialize buffer
		if (dbImage == null) {
			dbImage = createImage(this.getSize().width, this.getSize().height);
			dbg = dbImage.getGraphics();
		}

		// clear screen in background
		dbg.setColor(getBackground());
		dbg.fillRect(0, 0, this.getSize().width, this.getSize().height);

		// draw elements in background
		dbg.setColor(getForeground());
		paint(dbg);

		// draw image on the screen
		g.drawImage(dbImage, 0, 0, this);
	}

}
