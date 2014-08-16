import javax.swing.JFrame;


public class GraphicsSample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     JFrame f = new JFrame("JFrame");
     MyCanvas MC = new MyCanvas();

     f.setVisible(true);
     f.setSize(512,512);

     f.add(MC);
	}

}
