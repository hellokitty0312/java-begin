import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Anime2 extends Applet implements Runnable {
	Thread th;
	int x1, y1, r;
	int WIDTH = 500;
	int HEIGHT = 500;

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		x1 = WIDTH / 2;
		y1 = 0;
		r = 20;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		while (th != null) {
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x1, y1, r, r);
		y1--;
		if (y1 <0)
			y1 =HEIGHT;
	}
}
