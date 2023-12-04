package Java_Class;

public class Movie 
{
	private String Title ; 
 	private String Director;
 	private String genre ;
 	private int grade ;
 	
	Movie () {}
	Movie (String Title, String Director, int grade, String genre) 
	{
		this.Title = Title;
		this.Director = Director;
		this.grade = grade;
		this.genre = genre;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Movie [Title=" + Title + ", Director=" + Director + ", genre=" + genre + ", grade=" + grade + "]";
	}
	
	
	
	
	
}
