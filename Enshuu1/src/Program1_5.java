import java.awt.Color;


public class Program1_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Roof r1=new Roof(2,"plastic",Color.green);
		Wall w1=new Wall(2,"plastic",Color.blue);
		Door d1=new Door(3,"plastic",Color.red);

		House h1=new House(r1,w1,d1);

		h1.pleaseDraw();



	}

}
