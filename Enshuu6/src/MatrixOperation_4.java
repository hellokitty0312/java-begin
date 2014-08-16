
	/*
	 * MatrixOperation クラス：行列に関する操作をまとめたクラス
	 */
	import java.util.Scanner;

	public class MatrixOperation_4 {
	  private static Scanner stdIn = new Scanner(System.in);

	  public static final double [ ][ ] zero = { {0,0}, {0,0} };  /* 零行列を表すクラス変数 */
	  public static final double [ ][ ] unit = { {1,0}, {0,1} };    /* 単位行列を表すクラス変数 */

	  MatrixOperation_4 (){}  /* コンストラクタ：現時点では実体はありません */

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
	      for (int j=0; j < a[ i ].length; j++){
	        System.out.print("("+(i+1)+","+(j+1)+")要素を入力してください ");
	        a[i][j] = stdIn.nextDouble();
	      }
	    }

	  }

	  public static void copyMatrix(double [ ][ ] a, double [ ][ ] b){
		    for (int i=0; i < a.length; i++){
		      for (int j=0; j < a[ i ].length; j++){
		        a[i][j] = b[i][j];
		      }
		    }
		  }

		}