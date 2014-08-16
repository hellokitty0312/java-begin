
public class Enshuu6_5 {
	public static void main(String[] args) {
		 double [ ][ ] a = new double [2][2];
		 double [ ][ ] b = new double [2][2];
		 MatrixOperation.setMatrix(a);
		 MatrixOperation.showMatrix(a);

		 MatrixOperation.setMatrix(b);
		 MatrixOperation.showMatrix(b);
		 System.out.println("a+b="); MatrixOperation.showMatrix(MatrixOperation_5.add(a, b));
		 System.out.println("a-b="); MatrixOperation.showMatrix(MatrixOperation_5.sub(a, b));
		 System.out.println("a*b="); MatrixOperation.showMatrix(MatrixOperation_5.mult(a, b));
	}

}
