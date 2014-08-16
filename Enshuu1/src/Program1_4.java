import java.awt.Color;


public class Program1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Door d1=new Door(1,"plastic",Color.red);

		double x1=d1.area();
		double y1=d1.unitMaterialCost();
		double totalMaterialCost=x1*y1;
		System.out.println("Total material cost is:"+totalMaterialCost);
		}



	}


