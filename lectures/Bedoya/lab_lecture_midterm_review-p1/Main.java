package lab_lecture_midterm_review;

interface Operation1{
	int apply(int a, int b); 
}

interface Operation2{
	int compute(int a);
}

interface Operation3{
	double compute(double a, double b);
}


public class Main {

	public static void main(String[] args) {
		
		Operation1 add = (a, b) -> a + b; 
		
		int result1 = add.apply(4, 8); 
		
		System.out.println(result1);
		
		Operation2 square = (a) -> a * a; 
		
		int result2 = square.compute(2); 

		System.out.println(result2);
		
		// Distance from the origin
		Operation3 dist = (a, b) -> Math.sqrt(a*a + b*b); 
		
		double result3 = dist.compute(1,2); 
	}
	

}
