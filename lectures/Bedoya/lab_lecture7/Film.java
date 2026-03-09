package lab_lecture7;

public class Film implements Displayable, Comparable<Film>{
	
	private String filmTitle; 
	private String director; 
	
	public Film(String filmTitle, String director) {
		this.director = director;
		this.filmTitle = filmTitle;
	}
	
	public void display() {
		System.out.println(filmTitle + " by " + director);
	}

	@Override
	public int compareTo(Film o) {
		return this.filmTitle.compareTo(o.filmTitle); 
	}
	
	public String getFilmTitle() {
		return this.filmTitle;
	}
	
	@Override
	public String toString() {
		return filmTitle + " by " + director; 
	}
		
}
