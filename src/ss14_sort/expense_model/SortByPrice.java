package ss14_sort.expense_model;

import ss13_search.expense_model.Expense;

import java.util.Comparator;

public class SortByPrice implements Comparator<ss13_search.expense_model.Expense> {
    @Override
    public int compare(ss13_search.expense_model.Expense o1, Expense o2) {
        if (o2.getPriceExpense() - o1.getPriceExpense() == 0){
            return o2.compareTo(o1);
        }else {
            return o2.getPriceExpense() - o1.getPriceExpense();
        }
    }
}
