import javax.swing.JFrame;


public class nonAppletSample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame f = new JFrame("JFrame");
	     MySquareDraw DS = new MySquareDraw();

	     f.setVisible(true);
	     f.setSize(256,256);

	     f.add(DS);
	}

}
