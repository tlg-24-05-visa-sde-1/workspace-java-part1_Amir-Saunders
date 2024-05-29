package net.flix;

public class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("V for Vendetta",22.5,2015, Rating.R,Genre.DRAMA);
        Movie movie2 = new Movie();

        movie2.setTitle("Twilight");
        movie2.setReleaseYear(2008);
        movie2.setRevenue(5_280_000_000.0);
        System.out.println(movie2.toString());
        movie1.setRating(Rating.NC17);
    }
}
