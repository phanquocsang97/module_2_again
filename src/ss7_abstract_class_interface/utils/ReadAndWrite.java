package ss7_abstract_class_interface.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static ss7_abstract_class_interface.book_view.View.scanner;

public class ReadAndWrite {
    public static final String PATH_FILE_BOOK = "C:\\Users\\Admin\\IdeaProjects\\Module 2_C05\\src\\ss7_abstract_class_interface\\data\\list.csv";
    public static void writeFileBook(String pathFile, List<String> text, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : text) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readFileBook(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("FILE DOESNT EXIST!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static int inputInt(){
        int num;
        try {
            num = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            System.out.println("Enter Again!!");
            return inputInt();
        }
        return num;
    }
}
