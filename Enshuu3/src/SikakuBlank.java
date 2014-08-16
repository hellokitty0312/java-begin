
public class SikakuBlank extends Sikaku{

	private char kigou2;

	public SikakuBlank(int t,int y,char k,char k2){
		super(t,y,k);
		this.setKigou2(k2);
	}

	public void draw(){
		for(int j=0;j<getKazu();j++){
			System.out.print(getKigou());
		}
		System.out.println();


		for(int i=2;i<getKazu2();i++){
			System.out.print(getKigou());
			for(int j=2;j<getKazu();j++){
				System.out.print(getKigou2());
			}
		System.out.print(getKigou());
		System.out.println();
		}

		for(int j=0;j<getKazu();j++){
			System.out.print(getKigou());
	}
		System.out.println();

	}

	public void setKigou2(char kigou2){
		this.kigou2=kigou2;
	}

	public char getKigou2(){
		return kigou2;
	}


}
