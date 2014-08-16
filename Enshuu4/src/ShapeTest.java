
public class ShapeTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//インスタンスを生成
		 Rectangle shape1 = new Rectangle( "Red" ,10.5, 2.3);
		 Circle shape2 = new Circle( "Yellow", 2.5 );

		 //各インスタンスの色と面積の表示
		 System.out.println( Rectangle.name + "'s color : " + shape1.getColor() + " Area : "+
		shape1.getArea());
		 System.out.println( Circle.name + "'s color : " + shape2.getColor() + " Area : "+
		shape2.getArea() );

	}

}
