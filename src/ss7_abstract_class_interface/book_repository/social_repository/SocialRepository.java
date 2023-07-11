package ss7_abstract_class_interface.book_repository.social_repository;

import ss7_abstract_class_interface.book_model.SocialBook;
import ss7_abstract_class_interface.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class SocialRepository implements ISocialRepository {
    //    static List<SocialBook> socialBookList = new ArrayList<>();
//    static {
//        socialBookList.add(new SocialBook(1,"conan",3,"abc"));
//        socialBookList.add(new SocialBook(2,"dragon ball",3,"zxc"));
//        socialBookList.add(new SocialBook(3,"yaiba",3,"asd"));
//    }
    @Override
    public List<SocialBook> displaySocialBook() {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_BOOK);
        List<SocialBook> socialBookList = new ArrayList<>();
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            socialBookList.add(new SocialBook(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), info[3]));
        }
        return socialBookList;
    }

    @Override
    public void addNewSocialBook(SocialBook socialBook) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_BOOK);
        stringList.add(socialBook.convertToStringSocialBook());
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_BOOK, stringList, false);
    }

    @Override
    public int searchIdSocialBook(int id) {
        for (int i = 0; i < displaySocialBook().size(); i++) {
            if (displaySocialBook().get(i).getIdBook() == id) {
                return i;
            }
        }
        return -1;
    }
}
