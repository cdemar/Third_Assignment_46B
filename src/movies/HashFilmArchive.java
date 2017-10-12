package movies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {

	// You don't need to add the 'add' method because its method is already in
	// HashSet class

	public ArrayList<Movie> getSorted() {
		// This sorts the movies in an ordered form
		TreeSet<Movie> sorting = new TreeSet<Movie>(this);
		ArrayList<Movie> sorted = new ArrayList<Movie>(sorting);

		return sorted;
	}

}
