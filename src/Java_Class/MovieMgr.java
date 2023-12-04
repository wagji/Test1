package Java_Class;

import java.util.ArrayList;
import java.util.List;

public class MovieMgr {
    
private List<Movie> movieList;

public MovieMgr() {
       this.movieList = new ArrayList<>();
    }

    // add method
    public void add(Movie m) {
        movieList.add(m);
    }

// search method (prints all movies)
    
public void search() {
for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

public void search( String title ) {
	for (Movie movie : movieList) {
		if (movie.getTitle().equals(title) || movie.getTitle().contains(title)) {
			System.out.println(movie);
			return ;
		}
	}
	System.out.println( "해당 제목의 영화를 찾을수 없습니다 ");
}
public void search01rector(String name) {
	for(Movie movie : movieList ) {
		if (movie.getDirector().equals(name)) {
			System.out.println(movie);
		}
	}
}
public List<Movie> searchgenre(String genre) {
 List <Movie> foundMovies = new ArrayList <> () ;
 for( Movie movie : movieList)

	if(movie.getGenre().equals(genre)) {
		foundMovies.add(movie) ;
	}
return foundMovies;

	
}







}