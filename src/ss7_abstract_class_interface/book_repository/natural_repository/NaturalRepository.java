package ss7_abstract_class_interface.book_repository.natural_repository;

import ss7_abstract_class_interface.book_model.NaturalBook;
import ss7_abstract_class_interface.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class NaturalRepository implements INaturalRepository {
    @Override
    public List<NaturalBook> displayNaturalBook() {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_BOOK);
        List<NaturalBook> naturalBookList = new ArrayList<>();
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            naturalBookList.add(new NaturalBook(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3])));
        }
        return naturalBookList;
    }

    @Override
    public void addNaturalBook(NaturalBook naturalBook) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_BOOK);
        stringList.add(naturalBook.convertToStringNaturalBook());
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_BOOK, stringList, false);
    }

    @Override
    public int searchIdNaturalBook(int id) {
        for (int i = 0; i < displayNaturalBook().size(); i++) {
            if (displayNaturalBook().get(i).getIdBook() == id) {
                return i;
            }
        }
        return -1;
    }
}
