
public class Program3b_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String message=" ";
		int ondo =37;

		if(ondo>=27){
			message="今日は暑いですね！";
		}else if(ondo>=20){
			message="今日は暖かいですね！";
		}else if(ondo>=14){
			message="今日は涼しいですね！";
		}else{
			message="今日は寒いですね！";
		}
		System.out.println(message);
}
}