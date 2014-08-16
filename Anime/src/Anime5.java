import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Anime5 extends Applet implements Runnable {
	int x1, x2, x3, x4, y1, y2, y3, y4, dx, dy, r;
	final static int WIDTH = 700;
	final static int HEIGHT = 700;
	Thread th;

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		x1 = (int) (WIDTH / 2);
		y1 = (int) (HEIGHT / 2);
		x2 = (int) (WIDTH / 2);
		y2 = (int) (HEIGHT / 2);
		x3 = (int) (WIDTH / 2);
		y3 = (int) (HEIGHT / 2);
		x4 = (int) (WIDTH / 2);
		y4 = (int) (HEIGHT / 2);
		dx = 1;
		dy = 1;
		r = 50;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		while (th != null) {
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.pink);
		g.fillOval(x1, y1, r, r);
		g.setColor(Color.black);
		g.fillOval(x2, y2, r, r);

		g.setColor(Color.cyan);
		g.fillOval(x3, y3, r, r);
		g.setColor(Color.orange);
		g.fillOval(x4, y4, r, r);

		y1 = y1 - dy;
		y2 = y2 + dy;
		x3 = x3 + dx;
		x4 = x4 - dx;

		if ((y1 > HEIGHT / 2) || (y1 < 0))
			dy = -dy;

		if ((x3 > WIDTH) || (x3 < 0))
			dx = -dx;
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