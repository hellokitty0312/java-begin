
public class Worker {
	/* Worker の状態を記憶するフィールド:名前,働いた日数を格納するための変数 */
	 private String name;
	 private int workDays;

	 /* 引数つきコンストラクタ */
	 public Worker(String name, int workDays){
	 this.name = name;
	 this.workDays = workDays;
	 }

	 /* 名前を返すメソッド */
	 public String getName(){
	 return name;
	 }

	 /* 日数を返すメソッド */
	 public int getWorkDays(){
	 return workDays;
	 }

	 /* 各インスタンスの名前と働いた日数,給料を出力する printData メソッド */
	 public void printData(){
	 System.out.println("");
	 System.out.println("NAME: "+getName());
	 System.out.println("WORKDAYS: "+getWorkDays());
	 System.out.println("SALARY: "+calcSalary());
	 }

	 /* 給料計算のメソッド */
	 public int calcSalary(){
	 return 0;
	 }

	}


