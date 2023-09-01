package Seshn21.Model;

import Seshn21.Model.Book;
import Seshn21.Model.Library;
import Seshn21.Model.Reader;

import java.util.ArrayList;
import java.util.List;
    public class DataBase{
    private List<Library> libraries;
    private List<Book>books;
    private List<Reader>readers;



        public DataBase(ArrayList<Book> books, ArrayList<Reader> readers, ArrayList<Library> libraries) {
            this.libraries=libraries;
            this.readers=readers;
            this.books=books;
        }

        public List<Library> getLibraries() {
            return libraries;
        }

        public void setLibraries(List<Library> libraries) {
            this.libraries = libraries;
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

        @Override
        public String toString() {
            return "DataBase{" +
                    "libraries=" + libraries +
                    ", books=" + books +
                    ", readers=" + readers +
                    '}';
        }
    }
