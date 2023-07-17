package ss13_search.expense_service;

import ss13_search.expense_model.Expense;
import ss13_search.expense_model.SortByPrice;
import ss13_search.expense_repository.ExpenseRepository;
import ss13_search.expense_repository.IExpenseRepository;
import ss13_search.expense_utils.ReadAndWrite;
import ss14_sort.expense_utils.IdNotFoundException;
import ss14_sort.expense_utils.UniqueIdException;

import java.util.Collections;
import java.util.List;

import static ss13_search.expense_view.Run.scanner;

public class ExpenseService implements IExpenseService {
    IExpenseRepository expenseRepository = new ExpenseRepository();

    @Override
    public void displayExpense() {
        for (Expense expense : expenseRepository.displayExpense()) {
            System.out.println(expense);
        }
    }

    @Override
    public void addNewExpense() {
        do {
            try {
                System.out.println("Enter id new expense");
                int newId = ReadAndWrite.inputInt();
                int index = expenseRepository.searchIdExpense(newId);
                if (index == -1) {
                    System.out.println("Enter name new expense");
                    String newName = scanner.nextLine();
                    System.out.println("Enter day new expense");
                    String newDay = scanner.nextLine();
                    System.out.println("Enter price new expense");
                    int newPrice = ReadAndWrite.inputInt();
                    System.out.println("Enter detail new expense");
                    String newDetail = scanner.nextLine();
                    Expense expense = new Expense(newId, newName, newDay, newPrice, newDetail);
                    expenseRepository.addNewExpense(expense);
                } else {
                    displayExpense();
                    throw new UniqueIdException();
                }
            } catch (UniqueIdException e) {
                System.out.println("Id already exist!!");
            }
        } while (true);
    }

    @Override
    public void removeExpense() {
        do {
            try {
                System.out.println("Enter id you want to remove");
                int idRemove = ReadAndWrite.inputInt();
                int index = expenseRepository.searchIdExpense(idRemove);
                if (index == -1) {
                    throw new IdNotFoundException();
                } else {
                    System.out.println(expenseRepository.getExpense(index));
                    System.out.println("Enter yes to remove!!");
                    String choice = scanner.nextLine().toLowerCase().trim();
                    if (choice.equals("yes")) {
                        expenseRepository.removeExpense(index);
                    } else {
                        System.out.println("Cancel!!");
                    }
                }
            } catch (IdNotFoundException e) {
                System.out.println("Id doesnt exist!!");
            }
        } while (true);
    }

    @Override
    public void editExpense() {
        boolean flag = true;
        System.out.println("Enter id you want to edit");
        int idEdit = ReadAndWrite.inputInt();
        int index = expenseRepository.searchIdExpense(idEdit);
        if (index == -1) {
            System.out.println("Id doesnt exist!!");
        } else {
            Expense newExpense = expenseRepository.getExpense(index);
            do {
                System.out.println("SELECT INFO" +
                        "\n1.Edit id" +
                        "\n2.Edit name" +
                        "\n3.Edit day" +
                        "\n4.Edit price" +
                        "\n5.Edit detail" +
                        "\n6.Save info"
                );
                int select = ReadAndWrite.inputInt();
                switch (select) {
                    case 1:
                        System.out.println("Enter new id");
                        int newId = ReadAndWrite.inputInt();
                        newExpense.setIdExpense(newId);
                        break;
                    case 2:
                        System.out.println("Enter new name");
                        String newName = scanner.nextLine();
                        newExpense.setNameExpense(newName);
                        break;
                    case 3:
                        System.out.println("Enter new day");
                        String newDay = scanner.nextLine();
                        newExpense.setDayExpense(newDay);
                        break;
                    case 4:
                        System.out.println("Enter new price");
                        int newPrice = ReadAndWrite.inputInt();
                        newExpense.setPriceExpense(newPrice);
                        break;
                    case 5:
                        System.out.println("Enter new detail");
                        String newDetail = scanner.nextLine();
                        newExpense.setDetailExpense(newDetail);
                        break;
                    case 6:
                        System.out.println("Save info");
                        flag = false;
                        break;
                    default:
                        System.out.println("Input Wrong!!");
                        break;
                }
            } while (flag);
            System.out.println("Enter yes to save new info");
            String select = scanner.nextLine().toLowerCase().trim();
            if (select.equals("yes")) {
                expenseRepository.editExpense(index, newExpense);
                displayExpense();
            } else {
                System.out.println("Cancel!!");
            }
        }
    }

    @Override
    public void searchIdExpense() {
        System.out.println("Enter id you want to search");
        int idSearch = ReadAndWrite.inputInt();
        int index = expenseRepository.searchIdExpense(idSearch);
        if (index == -1) {
            System.out.println("Id doesnt exist!!");
        } else {
            Expense expense = expenseRepository.getExpense(index);
            System.out.println(expense);
        }
    }

    @Override
    public void searchNameExpense() {
        System.out.println("Enter name you want to search");
        String nameSearch = scanner.nextLine();
        List<Expense> expenseList = expenseRepository.searchNameExpense(nameSearch);
        if (expenseList.size() == 0) {
            System.out.println("Name doesnt exist!!");
        } else {
            for (Expense e : expenseList) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void sortByName() {
        System.out.println("Sort list by name");
        List<Expense> expenseList = expenseRepository.displayExpense();
        Collections.sort(expenseList);
        for (Expense e : expenseList) {
            System.out.println(e);
        }
    }

    @Override
    public void sortByPrice() {
        System.out.println("Sort list by price");
        List<Expense> expenseList = expenseRepository.displayExpense();
        Collections.sort(expenseList, new SortByPrice());
        for (Expense e : expenseList) {
            System.out.println(e);
        }
    }
}
