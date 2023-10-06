
public class Calculator {

	public double add(double n1, double n2) {
		return n1 + n2;
	}

	public double subtract(double n1, double n2) {
		return n1 - n2;
	}
	
	public double divide(int n1, int n2) {
		
		double result = 0;
		
		try {
			result =  n1 / n2;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	
	
	

}
