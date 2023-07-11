package ss7_abstract_class_interface.book_service.natural_service;

import ss7_abstract_class_interface.book_model.NaturalBook;
import ss7_abstract_class_interface.book_repository.natural_repository.INaturalRepository;
import ss7_abstract_class_interface.book_repository.natural_repository.NaturalRepository;
import ss7_abstract_class_interface.utils.InputWrongIdException;
import ss7_abstract_class_interface.utils.ReadAndWrite;

import static ss7_abstract_class_interface.book_view.View.scanner;

public class NaturalService implements INaturalService {
    INaturalRepository naturalRepository = new NaturalRepository();

    @Override
    public void displayNaturalBook() {
        for (NaturalBook naturalBook : naturalRepository.displayNaturalBook()) {
            System.out.println(naturalBook);
        }
    }

    @Override
    public void addNaturalBook() {
        do {
            try {
                System.out.println("Enter ID natural book: ");
                int idNatural = ReadAndWrite.inputInt();
                int index = naturalRepository.searchIdNaturalBook(idNatural);
                if (index == -1) {
                    System.out.println("Enter name natural book");
                    String nameNatural = scanner.nextLine();
                    System.out.println("Enter year natural book");
                    int yearNatural = ReadAndWrite.inputInt();
                    System.out.println("Enter amount natural book");
                    int amountNatural = ReadAndWrite.inputInt();
                    NaturalBook naturalBook = new NaturalBook(idNatural, nameNatural, yearNatural, amountNatural);
                    naturalRepository.addNaturalBook(naturalBook);
                    break;
                } else {
                    displayNaturalBook();
                    throw new InputWrongIdException();
                }

            } catch (InputWrongIdException e) {
                System.out.println("Id already exist!!");
            }
        } while (true);
    }
}
