
public class ExamStat_04 {
	/*
	 * 国語・英語・数学のテストの点数を保存して，平均点を計算する
	 * クラスインスタンスの配列を用いた実装
	 */


	  public static void main(String[] args) {
	    Subject [ ] allSubjects;

	    allSubjects = new Subject[ ]{              /* 配列の初期化 */
	            new Subject("国語",3),
	            new Subject("英語",3),
	            new Subject("数学",3),
	            new Subject("物理",3),
	            new Subject("化学",3),
	    };

	    for (int i=0; i < allSubjects.length; i++)  /* テストの点を入力 */
	    allSubjects[i].setScore();

	    System.out.println("各教科の平均点は次の通りです");    /* 平均点を出力 */
	    for (int i=0; i < allSubjects.length; i++)
	      System.out.println(allSubjects[i].getName() + ", " + allSubjects[i].getAverage() + "点");
	    }
	  }



