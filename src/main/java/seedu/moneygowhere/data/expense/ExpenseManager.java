package seedu.moneygowhere.data.expense;

import java.util.ArrayList;

/**
 * Stores and manages a list of expenses.
 */
@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class ExpenseManager {
    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public Expense getExpense(int expenseIndex) {
        return expenses.get(expenseIndex);
    }

    public ArrayList<Expense> getExpenses() {
        return new ArrayList<>(expenses);
    }

    public ArrayList<Expense> getExpensesByCategory(String expenseCategory) {
        ArrayList<Expense> expensesByCategory = new ArrayList<>();

        for (Expense expense: expenses) {
            if (expense.getCategory().equals(expenseCategory)) {
                expensesByCategory.add(expense);
            }
        }

        return expensesByCategory;
    }

    public void deleteExpense(int expenseIndex) {
        expenses.remove(expenseIndex);
    }

    public void editExpense(int expenseIndex, Expense expense) {
        expenses.set(expenseIndex, expense);
    }

    public void updateExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }
}
