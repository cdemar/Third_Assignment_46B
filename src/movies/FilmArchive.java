package movies;

import java.util.ArrayList;

//	This interface is for ListFilmArchive, 
//	HashFilmArchive, and TreeFilmArchive

public interface FilmArchive {

	ArrayList<Movie> getSorted();

	boolean add(Movie m);
}
