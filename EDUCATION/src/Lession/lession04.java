package Lession;

public class lession04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		for(int i = 1 ; i <= 100 ; i++) {
			 String str = Integer.toString(i);
			 str.contains("7");

			 if(i % 7 == 0){
			 System.out.println(i + "lucky");
		 }else if(str.contains("7")){

			 System.out.println(i + "lucky");

		}else {
			System.out.println(i);
		}

	}

}
}
