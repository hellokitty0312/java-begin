public class Inherit1 {
 public static void main (String[] args ) {

 /* 役員,雇用者インスタンスをつくる */
 Executive worker0 = new Executive("Eiko", 20, "CEO");
 Employee worker1 = new Employee("Wataru", 18,5);
 Executive worker2 = new Executive("Yone", 17, "CTO");
 Executive worker3 = new Executive("Wakana", 24, "CIO");
 Employee worker4 = new Employee("Kouji", 16, 10);

 /* 各社員のデータを出力 */
 worker0.printData();
 worker1.printData();
 worker2.printData();
 worker3.printData();
 worker4.printData();
 }
}