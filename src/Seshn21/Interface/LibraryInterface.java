package Seshn21.Interface;

import Seshn21.Model.Library;

import java.util.List;

public interface LibraryInterface {

    List<Library> saveLibrary(List<Library>libraries);

    List<Library>getAllLibraries();

    Library getLibraryById(Long id);

    Library updateLibrary(Long id, Library library);

    Library deleteLibrary(Long id);
}
