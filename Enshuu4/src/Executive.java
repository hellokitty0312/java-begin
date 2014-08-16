/* 役員クラスの定義 */
public class Executive extends Worker{
 /* 日給の基本給:クラス変数 */
 private final static int salary = 12000;

 /* 役職名を格納するためのインスタンス変数 */
 private String post;

 /* 引数つきコンストラクタ */
 public Executive(String name, int workDays, String post){
 super(name, workDays);
 this.post = post;
 }

 /* 日給の基本給を返すメソッド */
 public int getSalary(){
 return salary;
 }

 /* 役職名を返すメソッド */
 public String getPost(){
 return post;
 }

 /* 給料計算のメソッド */
 public int calcSalary(){
 return getSalary() * getWorkDays();
 }

 /* 各インスタンスの名前と働いた日数,給料,役職名を出力する printData メソッド */
 public void printData(){
 super.printData();
 System.out.println("POST: "+getPost());
 }
}