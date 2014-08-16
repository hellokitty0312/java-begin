import javax.swing.JFrame;


public class GraphicsSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 JFrame f = new JFrame("JFrame");
	     MyMouseDraw MMD = new MyMouseDraw();

	     f.setVisible(true);
	     f.setSize(512,512);

	     f.add(MMD);
	}

}
