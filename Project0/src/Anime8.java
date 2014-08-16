// 
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Anime8 extends Applet implements Runnable {

	private double x, y, dX, dY;// パックマンの位置
	private int appletWidth, appletHeight;
	private int alpha, beta, delta;
	private int alphaMouthOpen, alphaRotate;
	private boolean mouthOpen;
	Thread t;

	public void init() {
		setBackground(Color.CYAN);
		appletWidth = 400;
		appletHeight = 400;
		x = 10;
		y = 15;
		dX = 2;
		dY = 5;
		alphaMouthOpen = 40;
		rotate();

		delta = 5;
		mouthOpen = true;

		
		t = new Thread(this);
		t.start();
	}

	public void step() {
		x = x + dX;
		if ((x < 0) || (x > appletWidth)) {
			dX = -dX;
			rotate();
		}
		y = y + dY;
		if ((y < 0) || (y > appletHeight)) {
			dY = -dY;
			rotate();
		}
	}

	public void rotate() {
		if ((dX > 0) && (dY == 0))
			alphaRotate = 0;
		else if ((dX == 0) && (dY < 0))
			alphaRotate = 90;
		else if ((dX < 0) && (dY == 0))
			alphaRotate = 180;
		else if ((dX == 0) && (dY > 0))
			alphaRotate = 270;

		else if ((dX > 0) && (dY < 0))
			alphaRotate = 0 + (int) calculateTheta();
		else if ((dX < 0) && (dY < 0))
			alphaRotate = 180 - (int) calculateTheta();
		else if ((dX < 0) && (dY > 0))
			alphaRotate = 180 + (int) calculateTheta();
		else if ((dX > 0) && (dY > 0))
			alphaRotate = 360 - (int) calculateTheta();

		alpha = alphaRotate + alphaMouthOpen;
		if (alpha > 360)
			alpha = alpha - 360;
		beta = (360 - 2 * alphaMouthOpen);
	}

	public void mouth() {

		if (mouthOpen) {
			alpha = alpha - delta; // close the mouth
			beta = beta + 2 * delta; // close the mouth
			if (alpha <= alphaRotate)
				mouthOpen = false;
		}

		else if (!mouthOpen) {
			alpha = alpha + delta; // open the mouth
			beta = beta - 2 * delta; // open the mouth //
			if (alpha >= alphaMouthOpen + alphaRotate)
				if (alpha >= alphaMouthOpen)
					mouthOpen = true;

		}

	}

	public double calculateTheta() {

		double theta = Math.atan(Math.abs(dY) / Math.abs(dX)) * (180 / Math.PI);

		return theta;
	}

	public void paint(Graphics g) {
		step();
		// rotate();
		mouth();

		g.setColor(Color.RED);
		g.fillArc((int) x, (int) y, 40, 40, alpha, beta);
	}


	public void stop() {
		t = null;
	}

	public void run() {
		while (t != null) {
			repaint();
			try {
				t.sleep(20);
			} catch (InterruptedException e) {

			}
		}

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
