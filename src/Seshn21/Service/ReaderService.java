package Seshn21.Service;

import Seshn21.Interface.ReaderInterface;
import Seshn21.Model.DataBase;
import Seshn21.Model.Library;
import Seshn21.Model.Reader;

import java.util.Iterator;
import java.util.List;

public class ReaderService implements ReaderInterface {
    private DataBase dataBase;


    public ReaderService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    @Override
    public String toString() {
        return "ReaderService{" +
                "dataBase=" + dataBase +
                '}';
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void saveReader(Reader reader) {
        dataBase.getReaders().add(reader);
        System.out.println(reader);
    }

    @Override
    public List<Reader> getAllReaders() {
        System.out.println(dataBase.getReaders());

        return null;
    }



    @Override
    public Reader getReaderById(Long id) {
        for (Reader reader : dataBase.getReaders()) {
            if (reader.getId()==id) {
                System.out.println(reader);
            }
        }
        return null;
    }


    @Override
    public Reader updateReader(Long id, Reader reader) {

        for (Reader reader1: dataBase.getReaders()) {
            if(reader1.getId()==id){
                reader1.setId(reader.getId());
                reader1.setEmail(reader.getEmail());
                reader1.setGender(reader.getGender());
                reader1.setFullName(reader.getFullName());
                reader1.setPhoneNumber(reader.getPhoneNumber());
                System.out.println(reader);
            }
        }
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
            List<Library> libraries = dataBase.getLibraries();
            List<Reader> readers = dataBase.getReaders();

            for (Reader red : readers) {
                if (red.getId() == readerId) {
                    for (Library l : libraries) {
                        if (l.getId() == libraryId) {
                            l.getReaders().add(red);
                            dataBase.getLibraries().add(l);
                            System.out.println("Читатель успешно перемещен: " + l);
                            return;
                        }
                    }
                }
            }
            System.out.println("Данная библиотека или же читатель не найден");

        }
    }

