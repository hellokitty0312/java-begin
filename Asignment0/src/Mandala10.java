import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
public class Mandala10 extends Mandala4 {
	int r5,r6,r7,r8,r9,r10;
	Color color5, color6,color7,color8,color9,color10;
	public Mandala10(char s, Color c1, Color c2, Color c3, Color c4,
			Color c5, Color c6, Color c7, Color c8, Color c9, Color c10) {
		super(s, c1, c2, c3, c4);
		this.color5 = c5;
		this.color6 = c6;
		this.color7 = c7;
		this.color8 = c8;
		this.color9 = c9;
		this.color10 = c10;
		r = 240;
		if(size == 'S')
			r = 80;
		if(size == 'M')
			r = 160;
		if(size == 'L')
			r = 240;

	}
	public void pleaseDraw() {         //画面上に円を描くメソッド１
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, frameH, frameW);
		window.getContentPane().add(new Mandala10(size,color1, color2, color3, color4,color5, color6,color7,color8,color9,color10));
		window.setVisible(true);
	}
	public void paint(Graphics g) {  // 画面上に円を描くメソッド２
		// g.setColor(Color.cyan);
		r1 = r;                                //円１ の半径
		g.setColor(color1);                    //円１の色
		g.fillOval(x0-r1, y0-r1, 2*r1, 2*r1);  //円１を画面に描く

		r2 = (int)(r*0.9);
		g.setColor(color2);
		g.fillOval(x0-r2, y0-r2, 2*r2, 2*r2);

		r3 = (int)(r*0.8);
		g.setColor(color3);
		g.fillOval(x0-r3, y0-r3, 2*r3, 2*r3);

		r4 = (int)(r*0.7);
		g.setColor(color4);
		g.fillOval(x0-r4, y0-r4, 2*r4, 2*r4);

		r5 = (int)(r*0.6);
		g.setColor(color5);
		g.fillOval(x0-r5, y0-r5, 2*r5, 2*r5);

		r6 = (int)(r*0.5);
		g.setColor(color6);
		g.fillOval(x0-r6, y0-r6, 2*r6, 2*r6);

		r7 = (int)(r*0.4);
		g.setColor(color7);
		g.fillOval(x0-r7, y0-r7, 2*r7, 2*r7);

		r8 = (int)(r*0.3);
		g.setColor(color8);
		g.fillOval(x0-r8, y0-r8, 2*r8, 2*r8);

		r9 = (int)(r*0.2);
		g.setColor(color9);
		g.fillOval(x0-r9, y0-r9, 2*r9, 2*r9);

		r10 = (int)(r*0.1);
		g.setColor(color10);
		g.fillOval(x0-r10, y0-r10, 2*r10, 2*r10);

	}
//////////////////////////////////////////methods

}
