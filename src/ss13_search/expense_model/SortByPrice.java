package ss13_search.expense_model;

import java.util.Comparator;

public class SortByPrice implements Comparator<Expense> {
    @Override
    public int compare(Expense o1, Expense o2) {
        if (o2.getPriceExpense() - o1.getPriceExpense() == 0){
            return o2.compareTo(o1);
        }else {
            return o2.getPriceExpense() - o1.getPriceExpense();
        }
    }
}
