package case_study.furama_controller;

import case_study.furama_utils.ReadAndWrite;

public class PromotionManagement {
    public void selectPromotion(){
        boolean flag = true;
        do {
            System.out.println("-----PROMOTION MANAGEMENT-----" +
                    "\n1.Display list customers use service" +
                    "\n2.Display list customers get voucher" +
                    "\3.Return main menu" +
                    "Select your option"
                    );
            int select = ReadAndWrite.inputInput();
            switch (select){
                case 1:
                    System.out.println("Display list customers use service");
                    break;
                case 2:
                    System.out.println("Display list customers get voucher");
                    break;
                case 3:
                    System.out.println("Return main menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Input Again!!");
                    break;
            }
        }while (flag);
    }
}
