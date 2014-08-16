import java.util.Scanner;
public class Array03 {
 public static void main(String[] args) {
 Scanner stdIn = new Scanner(System.in);
 int [] a = new int[5];
 for (int i=0; i < a.length; i++){ System.out.print("a[" + i + "]=? ");
 a[i] = stdIn.nextInt();
 }

 for (int i=0; i < a.length; i++){
 System.out.println("a[" + i + "]= " + a[i]);
 }
 }
}