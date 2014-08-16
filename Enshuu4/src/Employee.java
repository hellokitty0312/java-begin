
	public class Employee extends Worker{
	 /* 日給の基本給:クラス変数 */
	 private final static int salary = 8000;

	 /* 残業時の時給:クラス変数 */
	 private final static int extraSalary = 1000;

	 /* 残業時間:インスタンス変数 */
	 private int extraHours;


	 /* 引数つきコンストラクタ */
	 public Employee(String name, int workDays, int extraHours){
	 super(name, workDays);
	 this.extraHours = extraHours;
	 }

	 /* 日給の基本給を返すメソッド */
	 public int getSalary(){
	 return salary;
	 }

	 /* 残業時の時給を返すメソッド */
	 public int getExtraSalary(){
	 return extraSalary;
	 }

	 /* 残業時間を返すメソッド */
	 public int getExtraHours(){
	 return extraHours;
	 }

	 /* 給料計算のメソッド */
	 public int calcSalary(){
	 return getSalary() * getWorkDays() + getExtraSalary() * getExtraHours();
	 }
	}


