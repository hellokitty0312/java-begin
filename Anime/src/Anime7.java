import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Anime7 extends Applet implements Runnable {
	private Thread thread;
	private int x, y, dX, dY;// パックマンの位置
	private int appletWidth, appletHeight;
	private int alpha, beta, delta;
	private int alphaOpen, alphaClosed;
	private boolean mouthOpen;

	public void init() {
		setBackground(Color.WHITE);
		appletWidth = 500;
		appletHeight = 500;
		alphaOpen = 40;
		alphaClosed = 0;
		alpha = alphaOpen;
		beta = 300; // (beta = 360 - 2 * alpha)
		delta = 7;
		mouthOpen = true;
		x = 0;
		y = 100;
		dX = 5;
		dY = 5;

		thread = new Thread(this);
		thread.start();
	}

	public void step() {
		x = x + dX;
		if ((x < 0) || (x > appletWidth)) {
			invert();
		}
	}

	public void invert() {
		dX = -dX;
		alpha = alpha + 180; // 方向を変える
		alphaOpen = 210;
		alphaClosed = 185;
		if (alpha > 360) { // 方向を変える
			alpha = alpha - 360;
			alphaOpen = 40;
			alphaClosed = 0;
		}
	}

	public void mouth() {
		if (mouthOpen) {
			alpha = alpha - delta; // close the mouth
			beta = beta + 2 * delta; // close the mouth

			if (alpha <= alphaClosed) {
				mouthOpen = false;
			}
		}

		else if (!mouthOpen) {
			alpha = alpha + delta; // open the mouth
			beta = beta - 2 * delta; // open the mouth
			if (alpha >= alphaOpen) {
				mouthOpen = true;
			}
		}
	}

	public void paint(Graphics g) {
		//step();
		mouth();
		g.setColor(Color.GREEN);
		g.fillArc(60, 60, 50, 50, alpha, beta);
	}

	public void stop() {
		thread = null;
	}

	public void run() {
		while (thread != null) {
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				break;
			}
		}
		thread = null;
	}

	public void update(Graphics g) {
		Image dbImage = null;
		Graphics dbg = null;
		// initialize buffer
		if (dbImage == null) {
			dbImage = createImage(this.getSize().width, this.getSize().height);
			dbg = dbImage.getGraphics();
		}

		// clear screen in background
		// dbg.clipRect(dX, dY, width, height)
		dbg.setColor(getBackground());
		dbg.fillRect(0, 0, this.getSize().width, this.getSize().height);

		// draw elements in background
		dbg.setColor(getForeground());
		paint(dbg);

		// draw image on the screen
		g.drawImage(dbImage, 0, 0, this);
	}

}
