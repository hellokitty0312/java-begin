
public class Enshuu6_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double [ ][ ] a = new double [2][2];
	    double [ ][ ] b = new double [2][2];

	    MatrixOperation_4.setMatrix(a);
	    System.out.println("a=");  MatrixOperation_4.showMatrix(a);

	    MatrixOperation_4.copyMatrix(b,a);
	    System.out.println("行列 a を行列 b にコピーしました.");
	    System.out.println("b=");  MatrixOperation_4.showMatrix(b);

	    System.out.println("O=");  MatrixOperation_4.showMatrix(MatrixOperation_4.zero);
	    System.out.println("I=");  MatrixOperation_4.showMatrix(MatrixOperation_4.unit);
	  }

	}


