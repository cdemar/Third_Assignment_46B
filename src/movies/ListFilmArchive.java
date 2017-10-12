package movies;

import java.util.ArrayList;
import java.util.TreeSet;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive {

	// This method checks every movies in the arraylist.
	public boolean add(Movie aMovie) {
		for (Movie a : this) {
			if (aMovie.equals(a)) {
				return false;
			}
		}
		boolean reallyAdded = super.add(aMovie);

		return true;
	}

	public ArrayList<Movie> getSorted() {
		// This sorts the movies in an unordered form
		TreeSet<Movie> a = new TreeSet<Movie>(this);
		ArrayList<Movie> b = new ArrayList<Movie>(a);

		return b;
	}
}
