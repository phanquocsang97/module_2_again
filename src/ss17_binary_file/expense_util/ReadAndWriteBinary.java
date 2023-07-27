package ss17_binary_file.expense_util;

import ss17_binary_file.expense_model.Expense;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static ss17_binary_file.expense_view.Run.scanner;

public class ReadAndWriteBinary {
    private static final String FILE_PATH = "D:\\CodeGym\\module_2_again\\src\\ss17_binary_file\\expense_data\\expense.dat";
    public static void writeListFile(List<Expense> expense) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(expense);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Expense> readListFile() {
        List<Expense> expenseList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            expenseList = (List<Expense>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException ioException) {

        } catch (ClassNotFoundException classNotFoundException) {

        }catch (Exception e){

        }
        return expenseList;
    }
    public static int inputInt(){
        int num;
        try {
            num = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            System.out.println("Input Again!!");
            return inputInt();
        }
        return num;
    }
}
