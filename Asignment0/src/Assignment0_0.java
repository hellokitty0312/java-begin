
public class Assignment0_0 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double nagasa1 = 20; // field
		double haba1 = 5;
		double nagasa2 = 9;
		double haba2 = 7;
		Rectangle r1 = new Rectangle(nagasa1, haba1); // instance 1
		double m1 = r1.menseki(); // メソッド１の呼び出し
		double p1 = r1.perimeter(); // メソッド2の呼び出し
		System.out.println("長方形r1の長さは " + nagasa1 + " センチです。"); // 画面に出力
		System.out.println("長方形r1の幅は " + haba1 + " センチです。");
		System.out.println("長方形r1の面積は " + m1 + " センチです。");
		System.out.println("長方形r1の周囲は " + p1 + " センチです。");

		Rectangle r2 = new Rectangle(nagasa2, haba2); // instance 2
		double m2 = r2.menseki();
		double p2 = r2.perimeter();

		System.out.println("長方形r2の長さは " + nagasa2 + " センチです。"); // 画面に出力
		System.out.println("長方形r2の幅は " + haba2 + " センチです。");
		System.out.println("長方形r2の面積は " + m2 + " センチです。");
		System.out.println("長方形r2の周囲は " + p2 + " センチです。");



	}

}
