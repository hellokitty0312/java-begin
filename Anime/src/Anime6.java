// Shooting stars
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Anime6 extends Applet implements Runnable {
	int x, y, dx, dy, r;
	final static int WIDTH = 500;
	final static int HEIGHT = 500;
	int dist;
	Thread th;

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		this.setBackground(Color.BLACK);
		x = (int) (Math.random() * WIDTH);
		y = 0;
		dist = (int) (Math.random() * 500);
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
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}

	public void paint(Graphics g) {
		if (x < dist) {
			g.setColor(Color.white);
			g.fillOval(x, y, r, r+5);
			x = x + dx;
			y = y + dy;
		} else if (x >= dist) {
			x = (int) (Math.random() * WIDTH);
			y = 0;
			g.setColor(Color.white);
			g.fillOval(x, y, r, r+5);
			x = x + dx;
			y = y + dy;
		}

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
