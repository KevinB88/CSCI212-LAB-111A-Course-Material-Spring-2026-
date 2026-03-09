package lab_lecture7;

public class Book implements Displayable, Comparable<Book>{
	
	private String title;
	private String author; 
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	public void display() {
		System.out.println(title + " by " + author);
	}


	@Override
	public int compareTo(Book o) {
		//String objects already have an inherit compareTo method
		return this.title.compareTo(o.title); 
		/*	return values: 	
		 * 	negative : -1	this < other 
		 * 	zero	 :  0 	this = other 
		 * 	positive :  1	this > other 
		 */
	}
}
