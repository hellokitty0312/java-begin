import java.applet.Applet;
import java.awt.Graphics;

public class Anime1 extends Applet implements Runnable {
	Thread th; // スレッドの宣言
	String myString;
	int x, y;

	public void init() {
		myString = "WELCOME TO JAVA!!";
		x = 100;
		y = 100;
		th = new Thread(this); // スレッドの初期化
		th.start(); // スレッドの開始
	}

	public void run() {
		while (th != null) { // スレッドが停止してない限り
			repaint();
			try {
				Thread.sleep(20); // ２０ミリ秒間スリープさせる
			} catch (InterruptedException e) {// try catch は、エラーを避けるため
			}
		}
	}

	public void paint(Graphics g) {
		g.drawString(myString, x, y);// draw method を参照
		x--;
		if (x < -120)
			x = 100;
	}
}
