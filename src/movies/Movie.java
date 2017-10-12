package movies;

public class Movie implements Comparable<Movie> {
	private String title;
	private int year;

	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

	// Allows the user to have the list be looked
	// at by name and if needed by year.
	public int compareTo(Movie that) {
		// Loops up the title of the movie
		if (this.title.compareTo(that.title) < 0) {
			return -1;
		} else if (this.title.compareTo(that.title) > 0) {
			return 1;
		}
		// Looks up the year of same named movies
		else {
			if (this.year < that.year) {
				return -1;
			} else if (this.year > that.year) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public String getTitle() {
		return this.title;
	}

	public int getYear() {
		return this.year;
	}

	public boolean equals(Object movies) {
		Movie that = (Movie) movies;
		return this.compareTo(that) == 0;
	}

	public String toString() {
		return "Movie " + getTitle() + " (" + getYear() + ")";
	}

	public static Movie[] getTestMovies() {

		// The movie list named 'Movie'.
		Movie movie0 = new Movie("It", 1990);
		Movie movie1 = new Movie("It", 2017);
		Movie movie2 = new Movie("Inside Out", 2015);
		Movie movie3 = new Movie("The Penut Movie", 2015);
		Movie movie4 = new Movie("Home Alone", 1990);
		Movie movie5 = new Movie("Sad Movie", 2015);
		Movie movie6 = new Movie("Train to Busan", 2016);
		Movie movie7 = new Movie("127 Hours", 2010);
		Movie movie8 = new Movie("Home Alone 2", 1992);
		Movie movie9 = new Movie("Home Alone 3", 1997);

		// The array that pulls the 'Movies'
		Movie[] testMovie = new Movie[10];
		testMovie[0] = movie0;
		testMovie[1] = movie1;
		testMovie[2] = movie2;
		testMovie[3] = movie3;
		testMovie[4] = movie4;
		testMovie[5] = movie5;
		testMovie[6] = movie6;
		testMovie[7] = movie7;
		testMovie[8] = movie8;
		testMovie[9] = movie9;

		return testMovie;
	}

	public int hashCode() {
		return title.hashCode() + year;
	}
}