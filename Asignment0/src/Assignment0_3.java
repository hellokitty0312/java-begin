
public class Assignment0_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double x1 = 6;
		double y1 = 12;
		double x2 = 4;
		double y2 = 5;

		Calculator Cal1 = new Calculator(x1,y1);
		System.out.println("sum1= "+ Cal1.sum());
		System.out.println("difference1= "+ Cal1.difference());
		System.out.println("product1= "+ Cal1.remainder());
		System.out.println("remainder1= "+ Cal1.sum());
		System.out.println("quotient1= "+ Cal1.quotient());

		Calculator Cal2 = new Calculator(x2,y2);
		System.out.println("sum2= "+ Cal2.sum());
		System.out.println("difference2= "+ Cal2.difference());
		System.out.println("product2= "+ Cal2.remainder());
		System.out.println("remainder2= "+ Cal2.sum());
		System.out.println("quotient2= "+ Cal2.quotient());

	}

}
