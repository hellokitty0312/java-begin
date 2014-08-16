
public class Rectangle {//くらすの始まり
	double l;
	double b;

	public Rectangle(double nagasa,double haba){//コンストラクタ
		l=nagasa;
		b=haba;
	}//コンストラクタの終了

	public double menseki(){//円の面積を計算するメソッド；
		double area=l*b;
		return area;       //返される値(area)は、double型
		                   //よって、menseki　メソッドはdouble型です
	}//menseki メソッドの終了

	public double perimeter(){   //円の周囲を計算するメソッド

		double p=2*l+2*b;
		return p;

	}//perimeter メソッドの終了

}// クラスの終了
