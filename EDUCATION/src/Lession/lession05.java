package Lession;

public class lession05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		label:
		for (int i=1 ; i<=9 ; i++){
			for (int j=1 ; j<=9; j++){
				if(i==4) {
					continue;
				}
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.print("\n");
		}
	}

}
