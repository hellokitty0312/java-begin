public class Rectangle extends Shape{

 //図形の名前(Rectangle)を格納したクラス定数
 public static final String name = "長方形";

 //辺の長さを格納したインスタンス変数
 private double height, width;

 //コンストラクタ
 public Rectangle( String color, double height, double width ){
 super( color );
 this.height = height;
 this.width = width;
 }

 //面積を計算して返す
 public double getArea(){
 return height * width;
 }
}