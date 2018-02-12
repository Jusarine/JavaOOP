package lesson6_10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 20.07.2016.
 */

/*Написать класс Film (название, год выпуска, список имен актеров, список жанров). Жанр реализовать в виде enum.
 Написать клиентский код, создающий список из 20 фильмов, и выполняющий задачи:
1. Найти все фильмы, у которых жанры HORROR, THRILLER.
2. Найти все фильмы комедии, которые выпущеные в 1990-2000 rr.*/

public class Film {

    private String name;
    private int issueYear;

    private List<Genre> genres = new ArrayList<>();
    private List<String> actors = new ArrayList<>();

    public Film() {

    }

    public Film(String name, int issueYear) {
        this.name = name;
        this.issueYear = issueYear;
    }

    public String getName() {
        return name;
    }

    public Film setName(String name) {
        this.name = name;
        return this;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public Film setIssueYear(int issueYear) {
        this.issueYear = issueYear;
        return this;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Film setGenres(List<Genre> genres) {
        this.genres = genres;
        return this;
    }

    public List<String> getActors() {
        return actors;
    }

    public Film setActors(List<String> actors) {
        this.actors = actors;
        return this;
    }

    public Film addActor(String actor) {
        actors.add(actor);
        return this;
    }

    public Film addGenre(Genre genre) {
        genres.add(genre);
        return this;
    }

    public static List<Film> findByGenre(List<Film> films, Genre genre) {
        List<Film> results = new ArrayList<>();

        for (Film film : films) {
            if(film.getGenres().contains(genre)) {
                results.add(film);
            }
        }
        return results;
    }

    public static List<Film> findByGenres(List<Film> films, Genre genre1, Genre genre2) {
        List<Film> results = new ArrayList<>();

        for (Film film : films) {
            if(film.getGenres().contains(genre1) && film.getGenres().contains(genre2)) {
                results.add(film);
            }
        }
        return results;
    }

    public static List<Film> findByYear(List<Film> films, int issueYear) {
        List<Film> results = new ArrayList<>();

        for (Film film : films) {
            if(film.getIssueYear() == issueYear) {
                results.add(film);
            }
        }
        return results;
    }

    public static List<Film> findByYears(List<Film> films, int issueYear1, int issueYear2) {
        List<Film> results = new ArrayList<>();

        for (Film film : films) {
            if(film.getIssueYear() >= issueYear1 && film.getIssueYear() <= issueYear2) {
                results.add(film);
            }
        }
        return results;
    }

    public static List<Film> findByGenreAndYear(List<Film> films, Genre genre, int issueYear) {
        List<Film> results = new ArrayList<>();

        for (Film film : films) {
            if(film.getGenres().contains(genre) && film.getIssueYear() == issueYear) {
                results.add(film);
            }
        }
        return results;
    }

    public static List<Film> findByGenreAndYears(List<Film> films, Genre genre, int issueYear1, int issueYear2) {
        List<Film> results = new ArrayList<>();

        for (Film film : films) {
            if(film.getGenres().contains(genre) && film.getIssueYear() >= issueYear1 && film.getIssueYear() <= issueYear2) {
                results.add(film);
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", issueYear=" + issueYear +
                ", genres=" + genres +
                ", actors=" + actors +
                '}';
    }
}
