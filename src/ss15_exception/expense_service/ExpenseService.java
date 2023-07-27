package ss15_exception.expense_service;

import ss13_search.expense_model.Expense;
import ss13_search.expense_model.SortByPrice;
import ss15_exception.expense_repository.ExpenseRepository;
import ss15_exception.expense_repository.IExpenseRepository;
import ss15_exception.expense_utils.IdNotFoundException;
import ss15_exception.expense_utils.ReadAndWrite;
import ss15_exception.expense_utils.UniqueIdException;

import java.util.Collections;
import java.util.List;

import static ss15_exception.expense_view.Run.scanner;

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
        try {
            System.out.println("Enter new id");
            int newId = ReadAndWrite.inputInt();
            int index = expenseRepository.searchIdExpense(newId);
            if (index == -1) {
                System.out.println("Enter new name");
                String newName = scanner.nextLine();
                System.out.println("Enter new day");
                String newDay = scanner.nextLine();
                System.out.println("Enter new price");
                int newPrice = ReadAndWrite.inputInt();
                System.out.println("Enter new detail");
                String newDetail = scanner.nextLine();
                Expense expense = new Expense(newId, newName, newDay, newPrice, newDetail);
                expenseRepository.addNewExpense(expense);
            } else {
                throw new UniqueIdException();
            }
        } catch (UniqueIdException e) {
            System.out.println("Id already exist!!");
        }
    }

    @Override
    public void removeExpense() {

        try {
            System.out.println("Enter id you want to remove");
            int idRemove = ReadAndWrite.inputInt();
            int index = expenseRepository.searchIdExpense(idRemove);
            if (index == -1) {
                throw new IdNotFoundException();
            } else {
                System.out.println(expenseRepository.getExpense(index));
                System.out.println("Enter yes to remove");
                String select = scanner.nextLine().toLowerCase().trim();
                if (select.equals("yes")) {
                    expenseRepository.removeExpense(index);
                } else {
                    System.out.println("Cancel remove!!!");
                }
            }
        } catch (IdNotFoundException e) {
            System.out.println("Id doesnt exist!!");
        }
    }

    @Override
    public void editExpense() {
        boolean flag = true;
        do {
            try {
                System.out.println("Enter id you want to edit");
                int idEdit = ReadAndWrite.inputInt();
                int index = expenseRepository.searchIdExpense(idEdit);
                if (index == -1) {
                    throw new IdNotFoundException();
                } else {
                    Expense expense = expenseRepository.getExpense(index);
                    do {
                        System.out.println("Enter info you want to edit" +
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
                                System.out.println("Edit id");
                                int newId = ReadAndWrite.inputInt();
                                expense.setIdExpense(newId);
                                break;
                            case 2:
                                System.out.println("Edit name");
                                String newName = scanner.nextLine();
                                expense.setNameExpense(newName);
                                break;
                            case 3:
                                System.out.println("Edit day");
                                String newDay = scanner.nextLine();
                                expense.setDayExpense(newDay);
                                break;
                            case 4:
                                System.out.println("Edit price");
                                int newPrice = ReadAndWrite.inputInt();
                                expense.setPriceExpense(newPrice);
                                break;
                            case 5:
                                System.out.println("Edit detail");
                                String newDetail = scanner.nextLine();
                                expense.setDetailExpense(newDetail);
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
                    System.out.println("Enter yes to save info");
                    String choice = scanner.nextLine().toLowerCase().trim();
                    if (choice.equals("yes")) {
                        expenseRepository.editExpense(index, expense);
                    } else {
                        System.out.println("Cancel!!!");
                    }
                }
            } catch (IdNotFoundException e) {
                System.out.println("Id doesnt exist!!");
            }
        } while (flag);

    }

    @Override
    public void searchIdExpense() {
        System.out.println("Enter id you want to search");
        int id = ReadAndWrite.inputInt();
        int index = expenseRepository.searchIdExpense(id);
        if (index == -1) {
            System.out.println("Id doesnt exist");
        } else {
            Expense expense = expenseRepository.getExpense(index);
            System.out.println(expense);
        }
    }

    @Override
    public void searchNameExpense() {
        System.out.println("Enter name you want to search");
        String name = scanner.nextLine();
        List<Expense> expenseList = expenseRepository.searchNameExpense(name);
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
