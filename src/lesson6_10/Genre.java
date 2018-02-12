package lesson6_10;

/**
 * Created by Tania on 20.07.2016.
 */
public enum Genre {
    THRILLER("Thriller"),
    HORROR("Horror"),
    DETECTIVE("Detective"),
    MYSTIC("Mystic"),
    FANTASY("Fantasy"),
    FANTASTIC("Fantastic"),
    COMEDY("Comedy"),
    ROMANCE("Romance"),
    DRAMA("Drama"),
    ADVENTURE("Adventure"),
    CRIMINAL("Criminal");

    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreName='" + genre + '\'' +
                '}';
    }
}
