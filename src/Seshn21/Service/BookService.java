package Seshn21.Service;

import Seshn21.Interface.BookInterface;
import Seshn21.Model.Book;
import Seshn21.Model.DataBase;
import Seshn21.Model.Library;

import java.util.ArrayList;
import java.util.List;

public class BookService implements BookInterface {
    private DataBase dataBase;

    public BookService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Book saveBook(Long libraryId, Book book) {
        List<Library> arr1 = dataBase.getLibraries();
        for (Library arr:arr1) {
            if (arr.getId() == libraryId ) {
                arr.getBooks().add(book);
                dataBase.getBooks().add(book);
            }
        }

        return book;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        for (Library l : dataBase.getLibraries()) {
            if (l.getId() == libraryId) {
                return l.getBooks();
            }

        }
        return null;
}


    public Book getBookById(Long libraryId, Long bookId) {
        for (Library l : dataBase.getLibraries()) {
            if (l.getId() == libraryId) {
                for (Book b : dataBase.getBooks()) {
                    if(b.getId()==bookId){
                        return b;
                    }
                }
            }
        }

        return null;
    }
    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (Library l : dataBase.getLibraries()) {
                if (l.getId() == libraryId) {
                    for (Book b : dataBase.getBooks()) {
                        if (b.getId() == bookId) {
                            l.getBooks().remove(b);
                            dataBase.getBooks().remove(b);
                            return "Book is deleted ";
                        }
                    }
                }
            }
            return null;
        }



    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library l: dataBase.getLibraries()) {
            if(l.getId()==libraryId){
                l.getBooks().clear();
            }
        }
        System.out.println(dataBase.getLibraries());
    }
}
