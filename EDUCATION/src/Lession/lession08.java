package Lession;

import java.util.Scanner;

public class lession08 {

	public static void main(String[] args) {
		
		int s = new java.util.Random().nextInt(1000);
		s = s + 1 ;

		int i = 0;
		while( i<10 ){
			System.out.println("Please input a number : ");
			Scanner scanner = new Scanner(System.in);
			int p = scanner.nextInt();
			if(s > p){
				System.out.println("it's small.");
			}else if(s < p){
				System.out.println("it's large.");
			}else {
				System.out.println("it's right.");
				break;
			}
			i++;
		}

	}

}
