import java.awt.Color;

public class Program1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	Roof r1=new Roof(1,"plastic",Color.green);

	double x1=r1.area();
	double y1=r1.unitMaterialCost();
	double totalMaterialCost=x1*y1;
	System.out.println("Total material cost is:"+totalMaterialCost);
	}

}
