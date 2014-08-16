import java.util.Scanner;
public class KeyboardInput {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int x;

		System.out.print("x=?");
		x = stdIn.nextInt();
		System.out.println("Input number is"+x+"");
	}

}
