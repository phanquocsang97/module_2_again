package ss7_abstract_class_interface.book_repository.social_repository;

import ss7_abstract_class_interface.book_model.SocialBook;

import java.util.List;

public interface ISocialRepository {
    List<SocialBook> displaySocialBook();

    void addNewSocialBook(SocialBook socialBook);

    int searchIdSocialBook(int id);
}
