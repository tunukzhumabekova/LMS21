package Seshn21.Model;

import java.util.List;

public class Library {
    private int id;
    private String name;
    private String address;
    private List<Book> books;
    private  List<Reader>readers;
    private static int idd=1;

    public Library(String name, String address, List<Book> books, List<Reader> readers) {
        this.id = idd++;
        this.name = name;
        this.address = address;
        this.books = books;
        this.readers = readers;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Library.idd = idd;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                ", readers=" + readers ;
    }
}
