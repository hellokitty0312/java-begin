import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class lession00 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		System.out.println("��������͂��Ă��������B");

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = bReader.readLine();
		String str2 = bReader.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		System.out.println("�ŏ���" + num1 + "�����͂���܂����B");
		System.out.println("����" + num2 + "�����͂���܂����B");




	}

}
