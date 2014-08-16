
public class Sikaku extends FormContainer{
	private int kazu2;

public Sikaku(int kazu,int kazu2,char kigou){
	super(kazu,kigou);
	this.setKazu2(kazu2);
}

public void draw(){
	for(int i=0;i<getKazu();i++){
		for(int j=0;j<getKazu2();j++){
		System.out.print(getKigou());}
		System.out.println();
	}

}
public int getKazu2(){
	return kazu2;
}
public void setKazu2(int ka2){
	kazu2=ka2;
}
}

