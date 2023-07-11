package ss7_abstract_class_interface.book_service.social_service;

import ss7_abstract_class_interface.book_model.SocialBook;
import ss7_abstract_class_interface.book_repository.social_repository.ISocialRepository;
import ss7_abstract_class_interface.book_repository.social_repository.SocialRepository;
import ss7_abstract_class_interface.utils.InputWrongIdException;
import ss7_abstract_class_interface.utils.ReadAndWrite;

import static ss7_abstract_class_interface.book_view.View.scanner;

public class SocialService implements ISocialService {
    ISocialRepository socialRepository = new SocialRepository();

    @Override
    public void displaySocialBook() {
        for (SocialBook socialBook : socialRepository.displaySocialBook()) {
            System.out.println(socialBook);
        }
    }

    @Override
    public void addNewSocialBook() {
        do {
            try {
                System.out.println("Enter Id social book:");
                int idSocialBook = ReadAndWrite.inputInt();
                int index = socialRepository.searchIdSocialBook(idSocialBook);
                if (index == -1) {
                    System.out.println("Enter name social book:");
                    String nameSocialBook = scanner.nextLine();
                    System.out.println("Enter year social book:");
                    int yearSocialBook = ReadAndWrite.inputInt();
                    System.out.println("Enter author social book");
                    String authorBook = scanner.nextLine();
                    SocialBook socialBook = new SocialBook(idSocialBook, nameSocialBook, yearSocialBook, authorBook);
                    socialRepository.addNewSocialBook(socialBook);
                } else {
                    throw new InputWrongIdException();
                }
            } catch (InputWrongIdException e) {
                System.out.println("Id already exist!!");
                ;
            }
        } while (true);
    }
}
