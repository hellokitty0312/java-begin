package Lession;

import java.util.Scanner;

public class lession08163 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner scn = new Scanner(System.in);
		//
		int[] math = new int[10];
		//
		System.out.println("Type the Math score in please.");
		//
		for(int i=0; i <math.length; i++) {
			//
			math[i] = scn.nextInt();

			label:
			if(math[i]>100||math[i]<0){
				//
				System.out.println("Over!");
				i--;

				break label;
			}else if(math[i] >= 90) {
				//
				System.out.println("Excellent!");
			}else if(math[i] >= 60) {
				//
				System.out.println("Pass!");
			}else {
				//
				System.out.println("Work Hard!");
			}
		}

		//
		int max = 0;

		for (int i =1; i< math.length;i++) {
			//
			if(math[i] > math[max]) {
				max = i;
			}
		}

		//
		for(int i=0;i<math.length;i++) {
			for(int j=i+1; j<math.length; j++){
				if(math[j] > math[i]) {
					int temp = math[i];
					math[i] = math[j];
					math[j] = temp;
				}
			}
			System.out.println(math[i]);
		}



		//

	}


}
