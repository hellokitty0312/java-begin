public class Circle extends Shape{

 //図形の名前(Circle)を格納したクラス定数
 public static final String name = "円";
 private static final double pi = 3.14;
 //半径の長さを格納したインスタンス変数
 private double radius;

 //コンストラクタ
 public Circle( String color, double radius ){
 super( color );
 this.radius = radius;
 }

 //面積を計算して返す
 public double getArea(){
 return radius*radius*pi;
 }
}