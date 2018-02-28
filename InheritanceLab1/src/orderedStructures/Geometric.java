package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 

	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}

	@Override
	public double nextValue() {
		if(firstFlag == false) {
			throw new IllegalStateException("firstValue method has not been previously exectued");
		}
		current = current * commonFactor; 
		return current;
	}
	public String toString(){
		return "Geom("+ super.firstValue() + ", " + this.nextValue()+ " )";
	}
	public double getTerm(int n){
		double temp = super.firstValue();
		if(n == 1) {
			return temp;
		}
		for (int i= 2; i< n; i++) {
			temp = this.nextValue();
		}
		return temp;
	}
}
