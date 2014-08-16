

	/*
	 * MatrixOperation クラス：行列に関する操作をまとめたクラス
	 */
	import java.util.Scanner;

	public class MatrixOperation_6 {
	  private static Scanner stdIn = new Scanner(System.in);

	  private static double [ ][ ] tmp = new double [2][2];

	  public static final double [ ][ ] zero = { {0,0}, {0,0} };  /* 零行列を表すクラス変数 */
	  public static final double [ ][ ] unit = { {1,0}, {0,1} };    /* 単位行列を表すクラス変数 */

	  MatrixOperation_6 (){}  /* コンストラクタ：現時点では実体はありません */

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
	      for (int j=0; j < a[ i ] .length; j++){
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

	  /* add(a,b) = a+b */
	  public static double[ ][ ] add(double [ ][ ] a, double [ ][ ] b){
	    copyMatrix(tmp,zero);
	      for (int i=0; i < tmp.length; i++){
	        for (int j=0; j  < tmp[ i ].length; j++){
	          tmp[i][j] = a[i][j] + b[i][j];
	        }
	      }
	    return tmp;
	  }

	  /* subt(a,b) = a-b */
	  public static double[ ][ ] sub(double [ ][ ] a, double [ ][ ] b){
	    copyMatrix(tmp,zero);
	    for (int i=0; i  < tmp.length; i++){
	      for (int j=0; j < tmp[ i ].length; j++){
	        tmp[i][j] = a[i][j] - b[i][j];
	      }
	    }
	    return tmp;
	  }

	  /* mult(a,b) = a*b */
	  public static double[ ][ ] mult(double [ ][ ] a, double [ ][ ] b){
	    copyMatrix(tmp,zero);
	      for (int i=0; i < tmp.length; i++){
	        for (int j=0; j < tmp[ i ].length; j++){
	          for( int k=0; k < a[ i ].length; k++){
	            tmp[i][j] += a[i][k] * b[k][j];
	          }
	        }
	      }
	    return tmp;
	  }

	/* 以下演習６で追加　*/
	  public static boolean isNonsingular(double [ ][ ] a){
	    if (a[0][0]*a[1][1]-a[0][1]*a[1][0] == 0)
	      return false;
	    else
	      return true;
	  }

	  public static boolean isEqual(double [ ][ ] a, double [ ][ ] b){
	    for (int i=0; i < a.length; i++){
	      for (int j=0; j < a[ i ].length; j++){
	        if (a[i][j] != b [i][j]){
	          return false;
	        }
	      }
	    }
	    return true;
	  }

	  public static double [ ][ ] inverse(double [ ][ ] a){
	    copyMatrix(tmp,zero);
	    if(isNonsingular(a)){
	      double det = a[0][0]*a[1][1]-a[0][1]*a[1][0];
	      tmp[0][0] = a[1][1]/det;
	      tmp[0][1] = -a[0][1]/det;
	      tmp[1][0] = -a[1][0]/det;
	      tmp[1][1] = a[0][0]/det;
	    } else {
	      System.out.println("非正則行列の逆行列は存在しません。");
	    }
	    return tmp;
	  }

	}


