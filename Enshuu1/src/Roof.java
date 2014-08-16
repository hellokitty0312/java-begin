/* Tad Gonsalves
JAVA2014-Lesson2
April 25, 2014
Enshuu1
*/                     	 /*  comment      */

// 屋根を作るクラス     // comment


import java.awt.Color;  //カラークラスのインポート

public class Roof {// Roof クラスの　定義
	int size;
	String material;
	Color color;

	public Roof(int s, String m, Color c) {// Constructor
		this.size = s;
		this.material = m;
		this.color = c;
	}


	public double area() {                     // method：double 型の値を返す

		double s = 3; // if(size == 1)

		if (size == 2)
			s = 6;
		if (size == 3)
			s = 10;
		return s * s / 2;                 // method: 三角の面積を計算する。
	}

	public double unitMaterialCost(){      // method：double 型の値を返す　　　　　　
		double cost = 0;
		if (material.equalsIgnoreCase("paper"))//それぞれの素材のコスト（yen/cm^2) を返す
			cost = 50;
		if (material.equalsIgnoreCase("plastic"))
			cost = 200;
		if (material.equalsIgnoreCase("metal"))
			cost = 450;
		return cost;
	}

	public double unitColorCost() {
		return 25;
	}

}