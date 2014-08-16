/*
 * 5個の変数に整数0から4を順に代入して表示するプログラム(II)
 * for文を使って簡単に？
 */
public class Array02 {
 public static void main(String[] args) {
 int[] a = new int[5];
 for (int i=0; i < a.length; i++)
 a[i] = i;
 for (int i=0; i < a.length; i++)
 System.out.println("a["+i+"]="+a[i]);
 }
}