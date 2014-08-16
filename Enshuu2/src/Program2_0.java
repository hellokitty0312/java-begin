
public class Program2_0 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		En en1=new En("赤","プラスチック",5);

		double y=en1.menseki();
		System.out.println("えんの面積は"+y+"平方センチです。");

		int x=en1.chokkei();

				double penkiTanka=150;
				double z=en1.paintCost(penkiTanka);


				System.out.println("長径"+x+"センチです。");
				System.out.println("たか"+z+"です。");
	}
}
