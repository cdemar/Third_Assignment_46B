package movies;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive {

	// You don't need to add the 'add' method because its method is already in
	// TreeSet class

	public ArrayList<Movie> getSorted() {
		// This sorts the movies in an unordered form
		TreeSet<Movie> a = new TreeSet<Movie>(this); // Not needed
		ArrayList<Movie> b = new ArrayList<Movie>(a);

		return b;
	}

}
