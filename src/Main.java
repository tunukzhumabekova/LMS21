import Seshn21.Enum.Gender;
import Seshn21.Enum.Genre;
import Seshn21.Interface.BookInterface;
import Seshn21.Model.Book;
import Seshn21.Model.DataBase;
import Seshn21.Model.Library;
import Seshn21.Model.Reader;
import Seshn21.Service.BookService;
import Seshn21.Service.LibraryService;
import Seshn21.Service.ReaderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Reader reader=new Reader("Lima","Lima@gmail.com",789456123,Gender.FEMALE);
        Book book=new Book("book","Aitmatov",Genre.ADVENTURE);
        List<Reader>readerList=new ArrayList<>();
        readerList.add(new Reader("John Doe", "john@example.com", 123456789, Gender.MALE));
        readerList.add(new Reader("Jane Smith", "jane@example.com", 987654321, Gender.FEMALE));
        List<Reader>readerList1=new ArrayList<>();
        readerList1.add(new Reader("Alex Johnson", "alex@example.com", 555555555, Gender.FEMALE));
        readerList1.add(new Reader("Ella Davis", "ella@example.com", 111111111, Gender.FEMALE));
        List<Reader>readerList2=new ArrayList<>();
        readerList2.add(new Reader("Sam Wilson", "sam@example.com", 777777777, Gender.MALE));
        ArrayList<Reader>readers=new ArrayList<>();
        readers.addAll(readerList);
        readers.addAll(readerList1);
        readers.addAll(readerList2);



        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add( new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.ACTION));
        booksList.add( new Book("The Da Vinci Code", "Dan Brown", Genre.COMEDY));
        ArrayList<Book> booksList2 = new ArrayList<>();
        booksList2.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", Genre.FANTASY));
        booksList2.add(new Book("1984", "George Orwell", Genre.ADVENTURE));
        ArrayList<Book> booksList3 = new ArrayList<>();
        booksList3.add(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", Genre.FANTASY));
        booksList3.add(new Book("To Kill a Mockingbird", "Harper Lee", Genre.ACTION));

        ArrayList<Book>books=new ArrayList<>();
        books.addAll(booksList);
        books.addAll(booksList2);
        books.addAll(booksList3);


        ArrayList<Library>libraryList=new ArrayList<>();
        libraryList.add(new Library("Central Library", "123 Main St",booksList,readerList));
        libraryList.add(new Library("Community Library", "456 Oak Ave", booksList2, readerList1));
        ArrayList<Library>libraries=new ArrayList<>();
        libraries.addAll(libraryList);
        ArrayList<Library>libraryList1=new ArrayList<>();

        libraryList1.add(new Library("City Library", "789 Elm Rd", booksList3, readerList2));
Library library=new Library(null,null,null,null);

        DataBase dataBase=new DataBase(books,readers,libraries);
        BookService bookService=new BookService(dataBase);
        LibraryService libraryService=new LibraryService(dataBase);
        ReaderService readerService=new ReaderService(dataBase);
        System.out.println("1 Methods with readers");
        System.out.println("2 Methods with books");
        System.out.println("3 Methods with libraries");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        while(true) {
            switch (a) {
                case 1:
                    System.out.println("1 Save Reader");
                    System.out.println("2 Get all readers");
                    System.out.println("3 Get reader by id");
                    System.out.println("4 Update reader");
                    System.out.println("5 Assign reader to library");
                    int b = scanner.nextInt();
                    switch (b) {
                        case 1:
                            System.out.println("First choice");
                            readerService.saveReader(reader);
                            break;
                        case 2:
                            System.out.println("Second choice");
                            readerService.getAllReaders();
                            break;
                        case 3:
                            System.out.println("Third choice");
                            System.out.println("Enter id of reader that you want to get");
                            Long idToGetReader = scanner.nextLong();
                            readerService.getReaderById(idToGetReader);
                            break;
                        case 4:
                            System.out.println("Fourth choice");
                            System.out.println("Enter id of reader that you want to update");
                            Long idToUpdate = scanner.nextLong();
                            readerService.updateReader(idToUpdate, reader);
                            break;
                        case 5:
                            System.out.println("Fifth choice");
                            System.out.println("Enter id of reader to assign");
                            long IdOfReaderToAssign=scanner.nextLong();
                            System.out.println("Enter id of library ");
                            long IdOfLibraryToAssign=scanner.nextLong();
                            readerService.assignReaderToLibrary(IdOfReaderToAssign,IdOfLibraryToAssign);
                    }
                    break;
                case 2:
                    System.out.println("1 Save Book");
                    System.out.println("2 Get all books");
                    System.out.println("3 Get book by id");
                    System.out.println("4 Delete book");
                    System.out.println("5 Clear books by id");
                    int c = scanner.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("First choice");
                            System.out.println("Enter id of library to save");
                            Long idToSave=scanner.nextLong();
                            System.out.println(bookService.saveBook(idToSave, book));
                            break;
                        case 2:
                            System.out.println("Second choice");
                            System.out.println("Enter id of library to get");
                            Long idToDelete=scanner.nextLong();
                            System.out.println(bookService.getAllBooks(idToDelete));
                            break;
                        case 3:
                            System.out.println("Third choice");
                            System.out.println("Enter id of library to find");
                            Long idOfLibraryToFind=scanner.nextLong();
                            System.out.println("Enter id of book to find");
                            Long idOfBookToFind=scanner.nextLong();
                            System.out.println(bookService.getBookById(idOfLibraryToFind, idOfBookToFind));
                            break;
                        case 4:
                            System.out.println("Fourth choice");
                            System.out.println("Enter id of library to delete");
                            Long idOfLibraryToDelete=scanner.nextLong();
                            System.out.println("Enter id of book to delete");
                            Long idOfBookToDelete=scanner.nextLong();
                            System.out.println(bookService.deleteBook(idOfLibraryToDelete, idOfBookToDelete));
                            break;
                        case 5:
                            System.out.println("Fifth choice");
                            System.out.println("Enter id of library to clear books");
                            Long idOfLibraryToClear=scanner.nextLong();
                            bookService.clearBooksByLibraryId(idOfLibraryToClear);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1 Save library");
                    System.out.println("2 Get all libraries");
                    System.out.println("3 Get library by id");
                    System.out.println("4 Update library");
                    System.out.println("5 Delete library");
                    int x = scanner.nextInt();
                    switch (x) {
                        case 1:
                            System.out.println("First choice");
                            System.out.println(libraryService.saveLibrary(libraryList1));
                            break;
                        case 2:
                            System.out.println("Second choice");
                            System.out.println(libraryService.getAllLibraries());
                            break;
                        case 3:
                            System.out.println("Third choice");
                            System.out.println("Enter id of library to get");
                            long idOfLibraryToGet=scanner.nextLong();
                            System.out.println(libraryService.getLibraryById(idOfLibraryToGet));
                            break;
                        case 4:
                            System.out.println("Fourth choice");
                            System.out.println("Enter id of library to update");
                            long idOfLibraryToUpdate=scanner.nextLong();
                            System.out.println(libraryService.updateLibrary(idOfLibraryToUpdate, library));
                            break;
                        case 5:
                            System.out.println("Fifth choice");
                            System.out.println("Enter id of library to delete");
                            long idOfLibraryToDelete=scanner.nextLong();
                            System.out.println(libraryService.deleteLibrary(idOfLibraryToDelete));
                            break;
                    }
                    break;

            }
        }

    }
}


