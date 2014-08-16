
public class Assignment0_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double weight1=43;
		double height1=1.67;
		double weight2=52;
		double height2=1.63;
		Ningen N1=new Ningen(weight1,height1);
			double BM1=N1.BMI();
			if(BM1>25){
				System.out.println("N1 is fat!");
			}
			else{
				System.out.println("N1 is not fat!");
			}

		 Ningen N2=new Ningen(weight2,height2);
			double BM2=N2.BMI();
			if(BM2>25){
				System.out.println("N2 is fat!");
			}
			else{
				System.out.println("N2 is not fat!");
			}

	}

}
