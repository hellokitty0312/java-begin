import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Anime4 extends Applet implements Runnable {
	int x, y, dx, dy, r;
	int WIDTH = 500;
	int HEIGHT = 500;
	Thread th;

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		x = (int) (Math.random() * WIDTH);
		y = (int) (Math.random() * HEIGHT);
		dx = 1; // X座標の変更
		dy = 1; // Y座標の変更
		r = 50;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		while (th != null) {
			repaint();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
			}
		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.pink);
		g.fillOval(x, y, r, r);
		x = x + dx;
		y = y + dy;
		if ((x > WIDTH) || (x < 0))
			dx = -dx;
		if ((y > HEIGHT) || (y < 0))
			dy = -dy;
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