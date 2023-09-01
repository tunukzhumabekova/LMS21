package Seshn21.Service;

import Seshn21.Interface.LibraryInterface;
import Seshn21.Model.DataBase;
import Seshn21.Model.Library;

import java.util.List;

public class LibraryService implements LibraryInterface {
    private DataBase dataBase;

    public LibraryService(DataBase dataBase) {
        this.dataBase=dataBase;
    }
    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        dataBase.getLibraries().addAll( libraries);
        System.out.println(dataBase.getLibraries());

        return libraries;
    }


    @Override
    public List<Library> getAllLibraries() {


        return dataBase.getLibraries()  ;
    }

    @Override
    public Library getLibraryById(Long id) {
        for (Library library: dataBase.getLibraries()) {
            if(library.getId()==id){
                return library;
            }
        }

        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for (Library library1: dataBase.getLibraries()) {
            if(library1.getId()==id){
                library1.setId(library.getId());
                library1.setBooks(library.getBooks());
                library1.setName(library.getName());
                library1.setReaders(library.getReaders());
                library1.setAddress(library.getAddress());
            }
        }
        return library;
    }

    @Override
    public Library deleteLibrary(Long id) {
        for (Library lib: dataBase.getLibraries()) {
            if(lib.getId()==id){
                dataBase.getLibraries().remove(lib);
                return lib;
            }
        }

        return null;
    }
}
