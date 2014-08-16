package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class lx6 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Please input strat or Strat:");
		String str = br.readLine();


		 int fortune1 = (int)(Math.random()*6)+1;
		 System.out.println("your number is :" + fortune1);
		 int fortune2 = (int)(Math.random()*6)+1;
		 System.out.println("his number is :" + fortune2);

		 if(fortune1 > fortune2){
			 System.out.println("You win.");
		 }else if(fortune1 < fortune2){
			 System.out.println("You lose..");

		 }else{
			 System.out.println("The game ended in a draw.");
		 }

	}

}
