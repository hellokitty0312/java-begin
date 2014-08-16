import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class lession00 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("整数を入力してください。");

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = bReader.readLine();
		String str2 = bReader.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		System.out.println("最初に" + num1 + "が入力されました。");
		System.out.println("次に" + num2 + "が入力されました。");




	}

}
