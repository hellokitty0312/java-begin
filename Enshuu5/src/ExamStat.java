/*
 * 国語・英語・数学のテストの点数を保存して，平均点を計算する
 */
public class ExamStat {
 public static void main(String[] args) {
 Subject japanese = new Subject("国語", 5); /* 3つのインスタンスを生成。受験者数は５名 */
 Subject english = new Subject("英語", 5);
 Subject mathematics = new Subject("数学", 5);
 japanese.setScore(); /* テストの点数を入力 */
 english.setScore();
 mathematics.setScore();
 System.out.println("各教科の平均点は次の通りです"); /* 平均点を出力 */
 System.out.println(japanese.getName() + ", " + japanese.getAverage() + "点");
 System.out.println(english.getName() + ", " + english.getAverage() + "点");
 System.out.println(mathematics.getName() + ", " + mathematics.getAverage() + "点");
 }
}