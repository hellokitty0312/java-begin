package Lession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class lession02 {

	public static void main(String[] args) throws IOException{

		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		Scanner scanner =new Scanner(System.in);
		 int number;
		 do{
			 System.out.println("Please input your weight(kg)");
			 String str1 = br.readLine();
			 while(!scanner.hasNextInt()){
				 System.out.println("That's not a number!");
				 scanner.next();
			 }


		System.out.println("Please input your height(m)");
		String str2 = br.readLine();

		double weight = Double.parseDouble(str1);
		double height = Double.parseDouble(str2);




		double BMI = weight/(height * height);

		if (BMI >= 25){
			System.out.println("you are fat!");
		}else if (BMI <= 18.5 || BMI < 25){
			System.out.println("you are good!");

		}else{
			 System.out.println("you have to eat!");
		}

	}

}







