package ua.vholovetskyi.expensecalculator.participant.model.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.expensecalculator.participant.model.Group;

public interface GroupRepository extends JpaRepository<Long, Group> {
}