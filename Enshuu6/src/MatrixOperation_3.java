

	/*
	 * MatrixOperation クラス：行列に関する操作をまとめたクラス
	 */
	import java.util.Scanner;  /* キーボード入力の利用 */

	public class MatrixOperation_3 {
	  private static Scanner stdIn = new Scanner(System.in);  /* キーボード入力の利用 */

	  MatrixOperation_3 (){}  /* コンストラクタ：現時点では実体はありません */

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

	  public static void setMatrix(double [][] a){
	    for (int i=0; i < a.length; i++){
	      for (int j=0; j< a[ i ].length; j++){
	        System.out.print("("+(i+1)+","+(j+1)+")要素を入力してください ");
	        a[i][j] = stdIn.nextDouble();  /* この文を追加 */
	      }
	    }
	  }

}
