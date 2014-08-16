/* T. Gonsalves
   May2, 2014
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Mandala4 extends JComponent {
   /////////////////////////////Field
	int frameH = 600;
	int frameW = 600;
	int x0 = (int)(frameW/2);    // centre
	int y0 = (int)(frameH/2);
	char size;
	Color color1, color2,color3, color4;
	int r ;
	int r1,r2, r3, r4 ;
   //////////////////////////////Field

  //////////////////////////////Constructor

	public Mandala4(char s, Color c1, Color c2,Color c3, Color c4) {//コンストラクタ2；中心のX座標、Y座標、半径と色の付いた円を作ってくれる
		this.color1 = c1;
		this.color2 = c2;
		this.color3 = c3;
		this.color4 = c4;
		this.size = s;
		r = 240;
		if(size == 'S')
			r = 80;
		if(size == 'M')
			r = 160;
		if(size == 'L')
			r = 240;
	}
///////////////////////////////////////Constructor

//////////////////////////////////////methods

	public void pleaseDraw() {         //画面上に円を描くメソッド１
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, frameH, frameW);
		window.getContentPane().add(new Mandala4(size,color1, color2, color3, color4));
		window.setVisible(true);
	}

	public void paint(Graphics g) {  // 画面上に円を描くメソッド２
		// g.setColor(Color.cyan);
		int r1 = r;                            //円１ の半径
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
	}
//////////////////////////////////////////methods
}
