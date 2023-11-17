package ua.vholovetskyi.expensecalculator.expenses.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.expensecalculator.expenses.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
