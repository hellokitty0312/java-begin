
public class Program3b_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int score = 90;

		char grade;

		if(score>=90){
			grade='A';
		}else if(score>=80){
			grade='B';
		}else if(score>=70){
			grade='C';
		}else if(score>=60){
			grade='D';
		}else{
			grade='F';
		}
		System.out.println("Your grade is "+grade);

	}
}
