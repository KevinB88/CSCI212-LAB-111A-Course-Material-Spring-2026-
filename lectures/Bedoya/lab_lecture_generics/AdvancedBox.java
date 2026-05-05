package lab_lecture_generics;

// Two generic variables A and B 
// place holders for other object types
public class AdvancedBox<A, B> {
	private A first; 
	private B second; 
	
	public AdvancedBox(A first, B second) {
		this.first = first; 
		this.second = second; 
	}
	
	public A getFirst() { return first; }
	public B getSecond() { return second; }
}
