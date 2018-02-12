package lesson2.book;

/**
 * Created by Tania on 05.07.2016.
 */

/*
Book: id, Название, Автор (ы), Издательство, Год издания, Количество стра-ниц, Цена, Тип переплета.
Создать массив объектов. Вывести:
a)  список книг заданного автора;
b)  список книг, выпущенных заданным издательством;
c)  список книг, выпущенных после заданного года.
 */
public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int publicationYear;
    private int pagesNumber;
    private int price;
    private String bindingType;


    public Book(){

    }
    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Book setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
        return this;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public Book setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Book setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getBindingType() {
        return bindingType;
    }

    public Book setBindingType(String bindingType) {
        this.bindingType = bindingType;
        return this;
    }
}
