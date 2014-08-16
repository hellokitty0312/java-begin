
public class FormContainer {
	private int kazu;
	private char kigou;

	public FormContainer(int ka,char ki){
		setKazu(ka);
		setKigou(ki);
	}

	public void setKigou(char ki){
			kigou=ki;
	}
	public char getKigou(){
		return kigou;
	}
	public void setKazu(int ka){
		kazu=ka;
	}
	public int getKazu(){
		return kazu;
	}
	public void draw(){
		for (int i=0;i<getKazu();i++){
			System.out.print(getKigou());
		}
		System.out.println();

}
}