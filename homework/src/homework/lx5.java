package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lx5 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please input your name :");
		String str1 = br.readLine();
		System.out.println("Please input your age :");
		String str2 = br.readLine();

		String name = str1;
		int age = Integer.parseInt(str2);

		int count = name.length();

		if("angela".equalsIgnoreCase(name)){
			count = count - 8 ;
		}else if("bunny".equalsIgnoreCase(name)){
			count = count - 7 ;
		}else if("cat".equalsIgnoreCase(name)){
			count = count - 6 ;
		}else if("dog".equalsIgnoreCase(name)){
			count = count - 5 ;
		}else if("emi".equalsIgnoreCase(name)){
			count = count - 4 ;
		}else if("fra".equalsIgnoreCase(name)){
			count = count - 3 ;
		}else if("gi".equalsIgnoreCase(name)){
			count = count - 2 ;
		}else if ("h".equalsIgnoreCase(name)){
			count = count - 1;
		}


		if("��".equalsIgnoreCase(name)){
			count = count - 8 ;
		}else if("��".equalsIgnoreCase(name)){
			count = count - 7 ;
		}else if("��".equalsIgnoreCase(name)){
			count = count - 6 ;
		}else if("��".equalsIgnoreCase(name)){
			count = count - 5 ;
		}else if("��".equalsIgnoreCase(name)){
			count = count - 4 ;
		}else if("��".equalsIgnoreCase(name)){
			count = count - 3 ;
		}else if("�����".equalsIgnoreCase(name)){
			count = count - 2 ;
		}else if("�Q".equalsIgnoreCase(name)){
			count = count - 1;
		}

		int s = count * age ;

		int fortune = new java.util.Random().nextInt(age);

		int q = s + fortune;

		switch (q%9){

		case 0 :
			System.out.println("��l");
			break;
		case 1 :
			System.out.print("�d��");
			break;
		case 2 :
			System.out.print("�c�q����");
			break;
		case 3 :
			System.out.println("���b����");
			break;
		case 4 :
			System.out.print("�n��");
			break;
		case 5 :
			System.out.print("����");
			break;
		case 6 :
			System.out.print("����");
			break;
		case 7 :
			System.out.print("���l");
			break;
		case 8 :
			System.out.println("���l�̔�");
			break;
		default:
			System.out.print("�Z���O");
	}



	}

}
