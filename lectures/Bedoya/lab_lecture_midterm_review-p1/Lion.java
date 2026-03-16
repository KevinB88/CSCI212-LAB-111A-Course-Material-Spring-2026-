package lab_lecture_midterm_review;

public class Lion implements PrimitiveFunctions{
	
	/*
	 * Lion has the following attributes (private)
	 * #1: hunger level (between 0 to 5) 
	 * (0 is exceedingly hungry, 5 is otherwise
	 * #2: thirst level (between 0 to 5) 
	 * (0 is exceedingly thirsty, 5 is otherwise
	 * #3: tiredness level (between 0 to 5) 
	 * (0 is exceedingly tired, 5 is otherwise
	 * 
	 * constructor (takes no parameters)
	 * 
	 * implement the following methods from PrimitiveFunctions:
	 * 
	 * isHungry() 	 at level <= 2 the lion is hungry 
	 * isTired()	 at level <= 1 the lion is hungry
	 * isThirsty()	 at level <= 3 the lion is hungry
	 * 
	 * 
	 */
	
	// attributes
	private int hungerLevel; 
	private int thirstLevel; 
	private int tirednessLevel; 
	
	// constructor 
	public Lion() {}
	
	// implementing the methods from the interface
	
	public boolean isHungry() {
//		if(hungerLevel <= 2) return true; 
//		else return false; 
		return hungerLevel <= 2; 
	}
	
	public boolean isTired() {
		return tirednessLevel <= 1; 
	}
	
	public boolean isThirsty() {
		return  thirstLevel <= 3; 
	}
	

}
