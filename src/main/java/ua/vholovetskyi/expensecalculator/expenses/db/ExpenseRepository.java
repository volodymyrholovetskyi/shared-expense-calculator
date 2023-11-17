package ua.vholovetskyi.expensecalculator.expenses.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Long, ExpenseRepository> {
}
