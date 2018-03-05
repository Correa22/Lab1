package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(firstFlag == false) {
			throw new IllegalStateException("firstValue method has not been previously exectued");
		}
		current = current + commonDifference; 
		return current;
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

	public String toString() {
		return "Ari("+ super.firstValue() + ", " + this.nextValue()+ " )"; 
	}
	public Progression add(Arithmetic p2) {
		double newFirst = this.firstValue() + p2.firstValue();
		double newDiff = this.commonDifference + p2.commonDifference;
		Progression newP = new Arithmetic(newFirst,newDiff);
		return newP;		
	}
	public Progression subs(Arithmetic p2) {
		double newFirst = this.firstValue() - p2.firstValue();
		double newDiff = this.commonDifference - p2.commonDifference;
		Progression newP = new Arithmetic(newFirst,newDiff);
		return newP;
	}
}
