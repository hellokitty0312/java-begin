
public class Bottle {

	private String name;
	private int net;

	public Bottle(String name,int net){
		setName(name);
		setNet(net);
	}

	public void show(){
		System.out.print(getName()+"容量:"+getNet()+"ml");
	}
	public int getNet(){
		return this.net;

	}

	public void setNet(int net){
		this.net=net;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){

	}
}
