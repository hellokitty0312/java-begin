import java.rmi.server.Operation;


public class Final2014_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int [] score =new int[10];

		Operation.show(score);
		Operation.getMaxValue(score);
		
		public static void showMatrix(double [ ][ ] a){
		    for (int i=0; i < a.length; i++){
		      System.out.print("|");
		      for (int j=0; j < a[ i ].length; j++){
		        System.out.print(a[i][j]);
		          if (j < a[i].length-1){
		            System.out.print(", ");
		          }
		        }
		      System.out.println("|");
		    }
		    System.out.println();
		  }


	}

}
