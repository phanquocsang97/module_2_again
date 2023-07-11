package ss7_abstract_class_interface.book_controller;

import ss7_abstract_class_interface.book_service.natural_service.INaturalService;
import ss7_abstract_class_interface.book_service.natural_service.NaturalService;
import ss7_abstract_class_interface.book_service.social_service.ISocialService;
import ss7_abstract_class_interface.book_service.social_service.SocialService;

import static ss7_abstract_class_interface.book_view.View.scanner;

public class BookController {
    INaturalService naturalService = new NaturalService();
    ISocialService socialService = new SocialService();

    public void displayMenuBook() {
        do {
            System.out.println("BOOK MANAGEMENT" +
                    "\n1.Display Natural Book" +
                    "\n2.Display Social Book" +
                    "\n3.Add New Natural Book" +
                    "\n4.Add New Social Book " +
                    "\n5.Exit program"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display Natural Book");
                    naturalService.displayNaturalBook();
                    break;
                case 2:
                    System.out.println("Display Social Book");
                    socialService.displaySocialBook();
                    break;
                case 3:
                    System.out.println("Add new natural book");
                    naturalService.addNaturalBook();
                    break;
                case 4:
                    System.out.println("Add new social book");
                    socialService.addNewSocialBook();
                    break;
                case 5:
                    System.out.println("Exit Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        } while (true);
    }

}
