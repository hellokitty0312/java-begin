
public class Program3b_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		double score;
		double gpa;
		int credits;
		char grade;
		
		score=95;
		gpa=3.6;
		credits=124;
		
		String message= " ";
		
		if(score>=90){
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
		}else if(score>=70){
			grade = 'C';
		}else if(score>=60){
			grade = 'D';
		}else{
			grade ='F';
		}
		
		if((grade=='A')&&(gpa*credits>400)){
			message = "おめでとう！奨学金申請資格あり！！";
			System.out.println(message);
		}
		else{
			message = "残念でした。もっと頑張ってください";
	
			System.out.println(message);
			
		}
		
	}

}
