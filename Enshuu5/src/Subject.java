import java.util.Scanner; /* キーボード入力の利用 */
public class Subject {
 private String name; /* 科目名 */
 private int number; /* 受講者数 */
 private int [ ] score; /* 得点保管用の配列変数 */
 private double average; /* 平均点 */
 Scanner stdIn = new Scanner(System.in); /* キーボード入力の利用 */
 Subject(String name, int number){
 setName(name);
 setNumber(number);
 score = new int[number];
 }
 public void setScore(){ /* テストの点数をキーボードから入力 */
 System.out.println("各学生の" + name + "の点数を入力してください。");
 for (int i=0; i < score.length; i++){
 System.out.print(i+1 + "番目 ");
 score[i] = stdIn.nextInt();
 }
 calcAverage(); /* 入力が終わったら平均点を計算 */
 }
 public void setName(String name) {
this.name = name;
}
 public void setNumber(int number) {
this.number = number;
}
 public void setAverage(double average) {
this.average = average;
 }
 public int getScore(int i){ /* このメソッドを追加 */
 return score[i];
 }
 public String getName(){ return name;}
 public int getNumber(){return number;}
 public double getAverage(){ return average;}
 public void calcAverage(){
 double sum=0;
 for (int i=0; i < score.length; i++)
 sum += getScore(i);
 setAverage(sum/getNumber());
 }
}
