package lesson2.book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 06.07.2016.
 */
public class BookSolution {

    public static List<Book> createBooks(){
        List<Book> books = new ArrayList<>();

        books.add(new Book()
                        .setId(567897)
                        .setName("Name1")
                        .setAuthor("Author1")
                        .setPublisher("Publisher1")
                        .setPublicationYear(1989)
                        .setPagesNumber(386)
                        .setPrice(693)
                        .setBindingType("Binding1")
        );

        books.add(new Book()
                        .setId(678902)
                        .setName("Name2")
                        .setAuthor("Author2")
                        .setPublisher("Publisher2")
                        .setPublicationYear(2015)
                        .setPagesNumber(1230)
                        .setPrice(890)
                        .setBindingType("Binding2")
        );

        books.add(new Book()
                        .setId(983642)
                        .setName("Name3")
                        .setAuthor("Author3")
                        .setPublisher("Publisher3")
                        .setPublicationYear(2003)
                        .setPagesNumber(549)
                        .setPrice(783)
                        .setBindingType("Binding3")
        );
        return books;
    }

    public static List<Book> findByAuthor(List<Book> books, String author){

        List<Book> list = new ArrayList<>();

        for (Book book : books){
            if ( book.getAuthor().equals(author)){
                list.add(book);
            }
        }
        return list;
    }

    public static List<Book> findByPublisher(List<Book> books, String publisher){

        List<Book> list = new ArrayList<>();

        for (Book book : books){
            if ( book.getPublisher().equals(publisher)){
                list.add(book);
            }
        }
        return list;
    }

    public static List<Book> findByPublicationYear(List<Book> books, int publicationYear){

        List<Book> list = new ArrayList<>();

        for (Book book : books){
            if ( book.getPublicationYear() > (publicationYear)){
                list.add(book);
            }
        }
        return list;
    }
}
