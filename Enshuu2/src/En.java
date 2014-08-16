
public class En {
	String color;
	String  material;
	int r;

	public En(String iro,String zairyo,int hankei){

		color = iro;
		material = zairyo;
		r=hankei;
	}

	public double menseki(){

		double m;

		m=Math.PI*r*r;

		return m;
	}

	public int chokkei(){

		int n;

		n=2*r;

		return n;


	}

	public double paintCost(double tanka){

		int money=50;

		return money*menseki();
	}

}
