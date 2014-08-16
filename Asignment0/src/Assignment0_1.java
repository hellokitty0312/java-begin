
public class Assignment0_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double F=78;
		double C=37;

		TempConverter F1 = new TempConverter();
		double F_TO_C1 = F1.F_TO_C(F);
		System.out.println("華氏"+F+"は華氏"+F_TO_C1+"です。");

		TempConverter C1 = new TempConverter();
		double C_TO_F1 = C1.C_TO_F(C);
		System.out.println("摂氏"+C+"は華氏"+C_TO_F1+"です。");
	}
}
