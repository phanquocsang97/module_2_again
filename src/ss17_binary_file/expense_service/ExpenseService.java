package ss17_binary_file.expense_service;

import ss16_io_text_file.expense_utils.IdNotFoundExpense;
import ss16_io_text_file.expense_utils.ReadAndWrite;
import ss16_io_text_file.expense_utils.UniqueIdExpense;
import ss17_binary_file.expense_model.Expense;
import ss17_binary_file.expense_repository.ExpenseRepository;
import ss17_binary_file.expense_repository.IExpenseRepository;

import java.util.List;

import static ss16_io_text_file.expense_view.Run.scanner;

public class ExpenseService implements IExpenseService {
    IExpenseRepository expenseRepository = new ExpenseRepository();

    @Override
    public void display() {
        for (Expense expense : expenseRepository.displayList()) {
            System.out.println(expense);
        }
    }

    @Override
    public void addNewExpense() {
        try {
            System.out.println("Input id");
            int newId = ReadAndWrite.inputInt();
            int index = expenseRepository.searchIdExpense(newId);
            if (index == -1) {
                System.out.println("Input name");
                String newName = scanner.nextLine();
                System.out.println("Input day");
                String newDay = scanner.nextLine();
                System.out.println("Input price");
                int newPrice = ReadAndWrite.inputInt();
                System.out.println("Input detail");
                String newDetail = scanner.nextLine();
                Expense newExpense = new Expense(newId, newName, newDay, newPrice, newDetail);
                expenseRepository.addNewExpense(newExpense);
            } else {
                throw new UniqueIdExpense();
            }
        } catch (UniqueIdExpense expense) {
            System.out.println("Id already exist!!");
        }
    }

    @Override
    public void removeExpense() {
        try {
            System.out.println("Input id expense you want to remove");
            int id = ReadAndWrite.inputInt();
            int index = expenseRepository.searchIdExpense(id);
            if (index == -1) {
                throw new IdNotFoundExpense();
            } else {
                System.out.println(expenseRepository.getExpense(index));
                System.out.println("Enter yes to remove");
                String select = scanner.nextLine().toLowerCase().trim();
                if (select.equals("yes")) {
                    expenseRepository.removeExpense(index);
                } else {
                    System.out.println("Cancel!!");
                }
            }
        } catch (IdNotFoundExpense e) {
            System.out.println("Id doesnt exist!!");
        }
    }

    @Override
    public void editExpense() {
        boolean flag = true;
        try {
            System.out.println("Input id you want to edit");
            int id = ReadAndWrite.inputInt();
            int index = expenseRepository.searchIdExpense(id);
            if (index == -1) {
                throw new IdNotFoundExpense();
            } else {
                Expense newExpense = expenseRepository.getExpense(index);
                do {
                    System.out.println("Input info you want to edit" +
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
                            System.out.println("Input new id");
                            int newId = ReadAndWrite.inputInt();
                            newExpense.setIdExpense(newId);
                            break;
                        case 2:
                            System.out.println("Input new name");
                            String newName = scanner.nextLine();
                            newExpense.setNameExpense(newName);
                            break;
                        case 3:
                            System.out.println("Input new day");
                            String newDay = scanner.nextLine();
                            newExpense.setDayExpense(newDay);
                            break;
                        case 4:
                            System.out.println("Input new price");
                            int newPrice = ReadAndWrite.inputInt();
                            newExpense.setPriceExpense(newPrice);
                            break;
                        case 5:
                            System.out.println("Input new detail");
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
                System.out.println("Enter yes to save info");
                String select = scanner.nextLine().toLowerCase().trim();
                if (select.equals("yes")) {
                    expenseRepository.editExpense(index, newExpense);
                } else {
                    System.out.println("Cancel!!");
                }
            }
        } catch (IdNotFoundExpense e) {
            System.out.println("Id doesnt exist!!!");
        }
    }

    @Override
    public void searchById() {
        try {
            System.out.println("Input id you want to search");
            int id = ReadAndWrite.inputInt();
            int index = expenseRepository.searchIdExpense(id);
            if (index == -1) {
                throw new IdNotFoundExpense();
            }else {
                Expense searchExpense = expenseRepository.getExpense(index);
                System.out.println(searchExpense);
            }
        } catch (IdNotFoundExpense e) {
            System.out.println("Id doesnt exist!!!");
        }
    }
}
