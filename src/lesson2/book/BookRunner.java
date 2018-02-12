package lesson2.book;

import java.util.List;

/**
 * Created by Tania on 05.07.2016.
 */
public class BookRunner {
    public static void main(String[] args) {

        List<Book> books = BookSolution.createBooks();

        List<Book> bookList1 = BookSolution.findByAuthor(books, "Author2");
        System.out.println(bookList1.toString());

        List<Book> bookList2 = BookSolution.findByPublicationYear(books, 2003);
        System.out.println(bookList2.toString());

        List<Book> bookList3 = BookSolution.findByPublisher(books, "Publisher1");
        System.out.println(bookList3.toString());
    }

}
