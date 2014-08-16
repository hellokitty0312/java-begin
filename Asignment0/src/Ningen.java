
public class Ningen {

	double w;
	double h;
	public Ningen(double weight,double height){// コンストラクタ
	w=weight;
	h=height;
	}//コンストラクタの終了

	public double BMI(){
		double bmi=w/(h*h);
		return bmi;
	}
}
