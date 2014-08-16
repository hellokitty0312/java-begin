package Lession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lession06 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		while (str.endsWith("tion")){
			System.out.println("station?");
			break;
		}


	}

}
