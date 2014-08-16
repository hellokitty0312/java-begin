import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Anime3 extends Applet implements Runnable {
	int x1, y1, x2, y2, r;
	int WIDTH = 500;
	int HEIGHT = 500;
	Thread th;

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		x1 = WIDTH / 2;
		y1 = 0;
		x2 = 0;
		y2 = HEIGHT / 2;
		r = 20;
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
		y1++;
		if (y1 > HEIGHT)
			y1 = 0;

		g.setColor(Color.black);
		g.fillOval(x2, y2, r, r);
		x2++;
		if (x2 > WIDTH)
			x2 = 0;
	}

	public void update(Graphics g) { // 　double buffering  // 動画を滑らかにするために使われる
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
