package Lession;

public class lession08161 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte[] bt ;
		bt = new byte[5];
		bt[1] = -128;
		bt[4] = 127;

		for(int i=0 ; i<bt.length ; i++) {
			System.out.println(bt[i]);
			System.out.println(bt.length);
		}

	}

}
