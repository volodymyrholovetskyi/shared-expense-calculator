package ua.vholovetskyi.expensecalculator.expenses.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.expensecalculator.expenses.model.Event;

public interface EventRepository extends JpaRepository<Long, Event> {
}
