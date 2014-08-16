
package Lession;


public class lession1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/* 文字列を出力しますが

		 */

		/*System.out.print("welcome to java education!"+"\n");
		System.out.print("welcome to java education!");*/

     	int bb;

		int  aa;

		boolean ss;

		bb = 5;
		aa = 4;

		if(bb%aa == 1){//a?
			ss = true;
		}

		else{
			ss = false;
		}

		if(ss){
		StringBuilder sb = new StringBuilder();
		sb.append("正ですね。");
		sb.append("\t");
		sb.append(bb*aa);
		sb.append("余値は1です。");
		System.out.print(sb);
		

			System.out.print("正しいですね!"+"\\t"+"余値は１です。");//x1

		}else{
			System.out.print("正しいですね!"+"\n"+"余値は１じゃない。");//x2
		}
	//	System.out.print(bb/aa);




	}
}


//		aa*bb ! = 12
//      aa/bb
/*	if(aa*bb!=12){
			ss ="aho";
			System.out.println(ss);

		}else{
			//
			ss = "あほじゃない";
			System.out.println(ss);

		}

	}


*/





	/*	int y = 0;

		System.out.println(y++);

		System.out.println(y);

		int x = 0;
		System.out.println(++x);
		System.out.println(x);

	}
}*/
