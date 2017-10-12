package movies;

public class ListAnalyzer {
	// Should run slower
	public static void main(String[] args) {

		ListFilmArchive archive = new ListFilmArchive();

		for (int i = 0; i < 10000000; i++) {
			archive.add(new Movie("Movie" + i, 2017));

			if (i % 1000 == 0)

				System.out.println(i);
		}

		System.out.println("List analyzer DONE");
	}
}