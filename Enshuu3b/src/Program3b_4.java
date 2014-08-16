
public class Program3b_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String name;
		String sex;
		double shibou;
		String message;

		name="松陽" ;
		sex="女性";
		shibou=16;

		if(sex.equalsIgnoreCase("男性")){

			if(shibou>=25)
				message="You are male with "+ shibou;
				else if (shibou >= 20)
					 message = "You are male with " + shibou
					 + "% body fat; You are fat！";
					 else if (shibou >= 15)
					 message = "You are male with " + shibou
					 + "% body fat; You are normal";
					 else {
					 message = "You are male with " + shibou;
					 }
			System.out.println(message);
		 }

		 else { // 女性の場合
		 if (shibou >= 30)
		 message = "You are female with " + shibou
		 + "% body fat; You are very fat！";
		 else if (shibou >= 25)
		 message = "You are female with " + shibou
		 + "% body fat; You are fat！";
		 else if (shibou >= 20)
		 message = "You are female with " + shibou
		 + "% body fat; You are normal";
		 else
		 message = "You are female with " + shibou
		 + "% body fat; You are thin！";

		System.out.println(message);


		}

	}

}
