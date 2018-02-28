package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() throws IllegalStateException {
		if(firstFlag == false) {
			throw new IllegalStateException("firstValue method has not been previously exectued");
		}
        // add the necessary code here 
		double temp = current;
		current += prev;
		prev = temp;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

}
