package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lx5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please input your name :");
		String str1 = br.readLine();
		System.out.println("Please input your age :");
		String str2 = br.readLine();

		String name = str1;
		int age = Integer.parseInt(str2);

		int count = name.length();

		if("angela".equalsIgnoreCase(name)){
			count = count - 8 ;
		}else if("bunny".equalsIgnoreCase(name)){
			count = count - 7 ;
		}else if("cat".equalsIgnoreCase(name)){
			count = count - 6 ;
		}else if("dog".equalsIgnoreCase(name)){
			count = count - 5 ;
		}else if("emi".equalsIgnoreCase(name)){
			count = count - 4 ;
		}else if("fra".equalsIgnoreCase(name)){
			count = count - 3 ;
		}else if("gi".equalsIgnoreCase(name)){
			count = count - 2 ;
		}else if ("h".equalsIgnoreCase(name)){
			count = count - 1;
		}


		if("大".equalsIgnoreCase(name)){
			count = count - 8 ;
		}else if("小".equalsIgnoreCase(name)){
			count = count - 7 ;
		}else if("黒".equalsIgnoreCase(name)){
			count = count - 6 ;
		}else if("虫".equalsIgnoreCase(name)){
			count = count - 5 ;
		}else if("花".equalsIgnoreCase(name)){
			count = count - 4 ;
		}else if("毛".equalsIgnoreCase(name)){
			count = count - 3 ;
		}else if("ちゃん".equalsIgnoreCase(name)){
			count = count - 2 ;
		}else if("鵬".equalsIgnoreCase(name)){
			count = count - 1;
		}

		int s = count * age ;

		int fortune = new java.util.Random().nextInt(age);

		int q = s + fortune;

		switch (q%9){

		case 0 :
			System.out.println("仙人");
			break;
		case 1 :
			System.out.print("妖怪");
			break;
		case 2 :
			System.out.print("皇子公主");
			break;
		case 3 :
			System.out.println("文臣武将");
			break;
		case 4 :
			System.out.print("地主");
			break;
		case 5 :
			System.out.print("平民");
			break;
		case 6 :
			System.out.print("賊民");
			break;
		case 7 :
			System.out.print("美人");
			break;
		case 8 :
			System.out.println("美人の彼");
			break;
		default:
			System.out.print("六道外");
	}



	}

}
