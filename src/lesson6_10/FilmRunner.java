package lesson6_10;

import java.io.IOException;
import java.util.List;

/**
 * Created by Tania on 20.07.2016.
 */
public class FilmRunner {

    public static void main(String[] args) {

        List<Film> films = FilmUtils.createFilms();

        System.out.println(Film.findByGenres(films, Genre.HORROR, Genre.THRILLER));
        System.out.println(Film.findByGenreAndYears(films, Genre.COMEDY, 1990, 2000));

        try {
            FilmIOUtils.writeFilmsToFile(films, "src\\lesson6_10\\file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(FilmIOUtils.readFilmsFromFile("src\\lesson6_10\\file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
