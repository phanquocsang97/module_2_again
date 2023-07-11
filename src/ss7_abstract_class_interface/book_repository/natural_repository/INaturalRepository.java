package ss7_abstract_class_interface.book_repository.natural_repository;

import ss7_abstract_class_interface.book_model.NaturalBook;

import java.util.List;

public interface INaturalRepository {
    List<NaturalBook> displayNaturalBook();
    void addNaturalBook(NaturalBook naturalBook);
    int searchIdNaturalBook(int id);
}
