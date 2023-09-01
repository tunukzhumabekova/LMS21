package Seshn21.Model;

import Seshn21.Enum.Genre;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;
    private Genre genre;
    private static int idd=1;

    public Book( String name, String author, Genre genre) {
        this.id = idd++;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public Book(ArrayList<Book> booksList, ArrayList<Book> booksList2, ArrayList<Book> booksList3) {
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Book.idd = idd;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +"\n" ;
    }
}
