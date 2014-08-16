import java.awt.Color;
import java.util.Random;


public class Assignment0_6 {


public static void main(String[] args) {
	    Random ransuu = new Random();

	    int i = ransuu.nextInt(3);
	    char s;
	    if (i == 0)
	    	s = 'S';
	    else if (i == 1)
	    	s = 'M';
	    else
	    	s = 'L';


		Color C1= Color.cyan;
		Color C2= Color.gray;
		Color C3= Color.blue;
		Color C4= Color.darkGray;
		Color C5= Color.green;
		Color C6= Color.lightGray;
		Color C7= Color.magenta;
		Color C8= Color.pink;
		Color C9= Color.white;
		Color C10= Color.yellow;

		Mandala10 Man1 = new Mandala10(s,C1,C2,C3,C4,C5,C6,C7,C8,C9,C10);

		Man1.pleaseDraw();

	}

}
