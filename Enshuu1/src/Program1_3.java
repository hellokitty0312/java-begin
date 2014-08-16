import java.awt.Color;


public class Program1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Wall w1=new Wall(1,"plastic",Color.blue);

		double x1=w1.area();
		double y1=w1.unitMaterialCost();
		double totalMaterialCost=x1*y1;
		System.out.println("Total material cost is:"+totalMaterialCost);
		}



	}


