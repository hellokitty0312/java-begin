
public class Calculator {

	double a;
	double b;
	public Calculator(double p,double q){
		a=p;
		b=q;
	}

		public double sum(){
			return a+b;
		}
		public double difference(){
			return a-b;
		}
		public double product(){
			return a*b;
		}
		public double remainder(){
			return a%b;
		}
		public double quotient(){
			return a/b;
		}

}
