package net.flix;

public class Movie {

    private String title;
    private double releaseYear;
    private double revenue;
    private Rating rating;
    private Genre genre;

    public Movie(String title, double revenue, double releaseYear) {
        setTitle(title);
        setRevenue(revenue);
        setReleaseYear(releaseYear);
//        You uses setters in the constructor for validation. So when you insttiate the constructor when you make an object. It willl check the conditions of the setter if it has any and then set the value to that. It means that whatever the value is must be valid based on the setter condition for the value to be set in the contsructor
    }

    public Movie(String title, double releaseYear, double revenue, Rating rating, Genre genre) {
       this(title, revenue, releaseYear);
        this.rating = rating;
        this.genre = genre;
    }

    public Movie() {

    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        setTitle(title);
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(double releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Title: " + getTitle() + ", Year: " + getReleaseYear() + ", Revenue: " + getRevenue();
    }

}
