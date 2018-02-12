package lesson6_10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 20.07.2016.
 */
public class FilmUtils {

    public static List<Film> createFilms() {

        List<Film> films = new ArrayList<>();

        films.add(new Film("Star Trek", 2009)
                .addGenre(Genre.FANTASY)
                .addGenre(Genre.THRILLER)
                .addActor("Chris Pine")
                .addActor("Zachary Quinto")
                .addActor("John Cho"));
        films.add(new Film("The Shawshank Redemption", 1994)
                .addActor("Tim Robbins")
                .addActor("Morgan Freeman")
                .addActor("Bob Hunton")
                .addGenre(Genre.DRAMA)
                .addGenre(Genre.CRIMINAL));
        films.add(new Film("The Green Mile",1999)
                .addActor("Tom Hanks")
                .addActor("David Morse")
                .addActor("Bonnie Hunt")
                .addGenre(Genre.FANTASTIC)
                .addGenre(Genre.DRAMA)
                .addGenre(Genre.CRIMINAL));
        films.add(new Film("The Last House On The Left", 2009)
                .addActor("Tony Goldwyn")
                .addActor("Garret Dillahunt")
                .addGenre(Genre.HORROR)
                .addGenre(Genre.THRILLER));
        films.add(new Film("Some Other Film", 1996)
                .addActor("No Matter Who")
                .addActor("Whoever")
                .addGenre(Genre.ROMANCE)
                .addGenre(Genre.COMEDY));

        return films;
    }
}
