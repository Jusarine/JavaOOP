package lesson6_10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 02.08.2016.
 */

/*
 Написать класс Film (название, год выпуска, список имен актеров, список жанров) (см. ДЗ из лекции 6). Написать класс FilmIOUtils, в котором будут присутвовать методы:
1. Запись списка фильмов в текстовый файл.
2. Чтение списка фильмов из текстового файла.
3. Запись списка фильмов в бинарный файл (сериализация).
4. Чтение списка фильмов из бинарного файла (десериализация).
 */
public class FilmIOUtils {

    public static final String CSV_DELIMITER = ";";

    public static void writeFilmsToFile(List<Film> films, String fileName) throws IOException {

        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            outputFilms(films, writer);
        }
    }

    public static void writeFilmToFile(Film film, String fileName) throws IOException {

        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            outputFilm(film, writer);
        }
    }

    public static void outputFilms(List<Film> films, PrintWriter writer){

        for (Film film : films) {
            outputFilm(film, writer);
        }
    }

    public static void outputFilm(Film film, PrintWriter writer) {
        writer.println(convertFilmToCsv(film));
    }


    public static List<Film> readFilmsFromFile(String fileName) throws IOException {

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFilms(reader);
        }
    }

    public static Film readFilmFromFile(List<Film> fileFilms, String fileName) throws IOException {

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFilm(reader);
        }
    }

    public static List<Film> readFilms(BufferedReader reader) throws IOException {

        List<Film> fileFilms = new ArrayList<>();

        String line;
        while((line = reader.readLine()) != null){

            Film film = convertFilmFromCsv(line);

            if (film != null){
                fileFilms.add(film);
            }
        }
        return fileFilms;
    }

    public static Film readFilm(BufferedReader reader) throws IOException {
        return convertFilmFromCsv(reader.readLine());
    }

    public static String convertFilmToCsv(Film film) {
        return film.getName() + CSV_DELIMITER + film.getIssueYear();
    }

    public static Film convertFilmFromCsv(String s)  {

        if(s != null) {
            String[] array = s.split(CSV_DELIMITER);

            String name = array[0];
            int issueYear = Integer.parseInt(array[1]);

            return new Film(name, issueYear);
        }
        return null;
    }

    public static void writeBinaryFilmToFile(List<Film> films, String fileName) throws IOException {

        try (ObjectOutput outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
             outputStream.writeObject(films);
        }
    }

    public static List<Film> readBinaryFilmFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInput inputStream = new ObjectInputStream(new FileInputStream(fileName))){
            return (List<Film>) inputStream.readObject();
        }
    }
}
